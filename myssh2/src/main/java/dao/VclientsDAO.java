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


import entity.Vclients;
import entity.VclientsId;

import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * A data access object (DAO) providing persistence and search support for
 * Vclients entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Vclients
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class VclientsDAO extends BaseDAO {
	private static final Logger log = LoggerFactory.getLogger(VclientsDAO.class);
	// property constants

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

	public void save(Vclients transientInstance) {
		log.debug("saving Vclients instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Vclients persistentInstance) {
		log.debug("deleting Vclients instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public List findAllbyPage(String expressionStr,int pageIndex,int pageSize) {
		log.debug("finding all TClients instances");
		try {
			String queryString = "from TClients";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setFirstResult((pageIndex-1)*pageSize);
			queryObject.setMaxResults(pageSize);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List<Vclients> findbyConditionPage(String ConditionStr,int pageIndex,int pageSize) {
		
		log.debug("getting Vclients instance with Condition: " + ConditionStr);
		System.out.println("getting Vclients instance with Condition:  "+ConditionStr);
		try {
			
			org.hibernate.Criteria crit = getCurrentSession().createCriteria(Vclients.class);
			
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
					
			//Map(String, String)=this.
			//crit.add(Restrictions.eq("cliName", expressionStr));
			//List instance = crit.setMaxResults(50);
			//crit.setMaxResults(50);
			//List cats = crit.list();
			//queryObject.setFirstResult((pageIndex-1)*pageSize);
			//queryObject.setMaxResults(pageSize);
			//return queryObject.list();
			
			
			//TClients instance = (TClients) getCurrentSession().get("entity.TClients", expressionStr);
			//crit.setfi
			crit.setFirstResult((pageIndex-1)*pageSize);
		    crit.setMaxResults(pageSize);
			//crit.setFirstResult(0);
			//crit.setMaxResults(3);
			return crit.list();
			//return crit.setMaxResults(pageSize).list();

			
			
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	/***
	 * get count of query by condition 
	 * @param ConditionStr
	 * @return
	 */
	public int getCountbyCondition(String ConditionStr) {
		int count=0;
		String ConSql=this.ConditionToSql(ConditionStr);
		String hql = "select count(cliId) as count from Vclients "+ConSql;
		Query queryObject = getCurrentSession().createQuery(hql);
	    count = ((Number) queryObject.iterate().next()).intValue();
		
	    
		return count;
		
	}
	
	public Vclients findById(entity.VclientsId id) {
		log.debug("getting Vclients instance with id: " + id);
		try {
			Vclients instance = (Vclients) getCurrentSession().get("entity.Vclients", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Vclients> findByExample(Vclients instance) {
		log.debug("finding Vclients instance by example");
		try {
			List<Vclients> results = (List<Vclients>) getCurrentSession().createCriteria("entity.Vclients")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Vclients instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Vclients as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Vclients instances");
		try {
			String queryString = "from Vclients";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Vclients merge(Vclients detachedInstance) {
		log.debug("merging Vclients instance");
		try {
			Vclients result = (Vclients) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Vclients instance) {
		log.debug("attaching dirty Vclients instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vclients instance) {
		log.debug("attaching clean Vclients instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VclientsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VclientsDAO) ctx.getBean("VclientsDAO");
	}
}