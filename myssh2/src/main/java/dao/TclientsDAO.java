package dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import entity.BookCard;
import entity.TClients;

import org.hibernate.criterion.Restrictions;


/**
 * A data access object (DAO) providing persistence and search support for
 * TClients entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.TClients
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TclientsDAO {
	private static final Logger log = LoggerFactory.getLogger(TclientsDAO.class);
	// property constants
	public static final String CLI_CODE = "cliCode";
	public static final String CLI_NAME = "cliName";
	public static final String CLI_TTYPE = "cliTtype";
	public static final String CLI_CONNECTOR = "cliConnector";
	public static final String CLI_TELNUM = "cliTelnum";
	public static final String CLI_FAX = "cliFax";
	public static final String CLI_EMAIL = "cliEmail";
	public static final String CLI_BANK = "cliBank";
	public static final String CLI_BANK_ACCOUNT = "cliBankAccount";
	public static final String CLI_BDDRES_COUNTRY = "cliBddresCountry";
	public static final String CLI_BDDRES_PROVINCE = "cliBddresProvince";
	public static final String CLI_ADDRES_CITY = "cliAddresCity";
	public static final String CLI_ADDRESS_STREE = "cliAddressStree";
	public static final String CLI_POSTCODE = "cliPostcode";
	public static final String CLI_SUBSIDIARY_ID = "cliSubsidiaryId";
	public static final String CLI_PASSWORD = "cliPassword";
	public static final String CLI_IS_ACTIVE = "cliIsActive";
	public static final String CREAT_BY = "creatBy";
	public static final String LASTUPDATE_BY = "lastupdateBy";

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

	public void save(TClients transientInstance) {
		log.debug("saving TClients instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TClients persistentInstance) {
		log.debug("deleting TClients instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public List<TClients> findByExpression(String expressionStr) {
		
		log.debug("getting TClients instance with Expression: " + expressionStr);
		try {
			
			org.hibernate.Criteria crit = getCurrentSession().createCriteria(TClients.class);
			crit.add(Restrictions.eq("cliName", expressionStr));
			//List instance = crit.setMaxResults(50);
			//crit.setMaxResults(50);
			//List cats = crit.list();
			
			
			//TClients instance = (TClients) getCurrentSession().get("entity.TClients", expressionStr);
			return crit.setMaxResults(50).list();
			
			
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	public TClients findById(java.lang.Integer id) {
		log.debug("getting TClients instance with id: " + id);
		try {
			TClients instance = (TClients) getCurrentSession().get("entity.TClients", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TClients> findByExample(TClients instance) {
		log.debug("finding TClients instance by example");
		try {
			List<TClients> results = (List<TClients>) getCurrentSession().createCriteria("entity.TClients")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TClients instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TClients as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TClients> findByCliCode(Object cliCode) {
		return findByProperty(CLI_CODE, cliCode);
	}

	public List<TClients> findByCliName(Object cliName) {
		return findByProperty(CLI_NAME, cliName);
	}

	public List<TClients> findByCliTtype(Object cliTtype) {
		return findByProperty(CLI_TTYPE, cliTtype);
	}

	public List<TClients> findByCliConnector(Object cliConnector) {
		return findByProperty(CLI_CONNECTOR, cliConnector);
	}

	public List<TClients> findByCliTelnum(Object cliTelnum) {
		return findByProperty(CLI_TELNUM, cliTelnum);
	}

	public List<TClients> findByCliFax(Object cliFax) {
		return findByProperty(CLI_FAX, cliFax);
	}

	public List<TClients> findByCliEmail(Object cliEmail) {
		return findByProperty(CLI_EMAIL, cliEmail);
	}

	public List<TClients> findByCliBank(Object cliBank) {
		return findByProperty(CLI_BANK, cliBank);
	}

	public List<TClients> findByCliBankAccount(Object cliBankAccount) {
		return findByProperty(CLI_BANK_ACCOUNT, cliBankAccount);
	}

	public List<TClients> findByCliBddresCountry(Object cliBddresCountry) {
		return findByProperty(CLI_BDDRES_COUNTRY, cliBddresCountry);
	}

	public List<TClients> findByCliBddresProvince(Object cliBddresProvince) {
		return findByProperty(CLI_BDDRES_PROVINCE, cliBddresProvince);
	}

	public List<TClients> findByCliAddresCity(Object cliAddresCity) {
		return findByProperty(CLI_ADDRES_CITY, cliAddresCity);
	}

	public List<TClients> findByCliAddressStree(Object cliAddressStree) {
		return findByProperty(CLI_ADDRESS_STREE, cliAddressStree);
	}

	public List<TClients> findByCliPostcode(Object cliPostcode) {
		return findByProperty(CLI_POSTCODE, cliPostcode);
	}

	public List<TClients> findByCliSubsidiaryId(Object cliSubsidiaryId) {
		return findByProperty(CLI_SUBSIDIARY_ID, cliSubsidiaryId);
	}

	public List<TClients> findByCliPassword(Object cliPassword) {
		return findByProperty(CLI_PASSWORD, cliPassword);
	}

	public List<TClients> findByCliIsActive(Object cliIsActive) {
		return findByProperty(CLI_IS_ACTIVE, cliIsActive);
	}

	public List<TClients> findByCreatBy(Object creatBy) {
		return findByProperty(CREAT_BY, creatBy);
	}

	public List<TClients> findByLastupdateBy(Object lastupdateBy) {
		return findByProperty(LASTUPDATE_BY, lastupdateBy);
	}

	public List findAll() {
		log.debug("finding all TClients instances");
		try {
			String queryString = "from TClients";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List findAllbyPage(int pageIndex,int pageSize) {
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
	
/*    int pageIndex=2;
    int pageSize=3;
    query.setFirstResult((pageIndex-1)*pageSize);
    query.setMaxResults(pageSize);*/
	
/*	public int getCount(String hql) {
		log.debug("finding TClients instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TClients as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
		
		
		
		//String hql = "select count(*) from User as user";
		   int count = (int)HibernateDaoSupport.getHibernateTemplate().find(hql).listIterator().next();
	       return count;
	}*/

	public TClients merge(TClients detachedInstance) {
		log.debug("merging TClients instance");
		try {
			TClients result = (TClients) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TClients instance) {
		log.debug("attaching dirty TClients instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TClients instance) {
		log.debug("attaching clean TClients instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TclientsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TclientsDAO) ctx.getBean("TclientsDAO");
	}
}