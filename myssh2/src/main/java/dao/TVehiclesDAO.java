package dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;


import entity.TVehicles;


import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

@Transactional
public class TVehiclesDAO extends BaseDAO {
	// create loger
	private static final Logger log = LoggerFactory.getLogger(VclientsDAO.class);
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}
	
	
	/***
	 * get count of query by condition 
	 * @param ConditionStr
	 * @return count
	 */
	public int getCountbyCondition(String ConditionStr) {
		int count=0;
		String ConSql=this.ConditionToSql(ConditionStr);//TVehicles
		String hql = "select count(vehcode) as count from TVehicles ";//+ConSql;
		
		//String hql = "select count(proCode) as count from Tallproperties ";
		Query queryObject = getCurrentSession().createQuery(hql);
	    count = ((Number) queryObject.iterate().next()).intValue();
    
		return count;
		
	}
	
	public List<TVehicles> findbyConditionPage(String ConditionStr,int pageIndex,int pageSize) {
		
		log.debug("getting TVehicles instance with Condition: " + ConditionStr);
		System.out.println("getting TVehicles instance with Condition:  "+ConditionStr);
		try {
			
			org.hibernate.Criteria crit = getCurrentSession().createCriteria(TVehicles.class);
			
			if(ConditionStr.length()>0) {
										
				Map<String,String> conMap=this.ConditionToMap(ConditionStr);
				
				for(Map.Entry<String, String> entry : conMap.entrySet()){
				    String mapKey = entry.getKey();
				    String mapValue = entry.getValue();
				    
				    if(mapKey.contains("_Restriction")){
				    	continue;
				    }
				    
				    String restrValue=conMap.get(mapKey+"_Restriction");
				    
				    if(restrValue.equals("equate")){
						crit.add(Restrictions.eq(mapKey, mapValue));
				    	
				    } else if(restrValue.equals("like")){
						crit.add(Restrictions.like(mapKey, mapValue, MatchMode.ANYWHERE));			    	
				    }     				    		    
				}
			
			}
					
			crit.setFirstResult((pageIndex-1)*pageSize);
		    crit.setMaxResults(pageSize);
			return crit.list();


			
			
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	
}
