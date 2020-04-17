package dao;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import entity.TCliStoppoints;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCliStoppoints entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.TCliStoppoints
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TCliStoppointsDAO {
	private static final Logger log = LoggerFactory.getLogger(TCliStoppointsDAO.class);
	// property constants
	public static final String CSP_NAME = "cspName";
	public static final String CSP_ADDRES_COUNTRY = "cspAddresCountry";
	public static final String CSP_ADDRES_PROVINCE = "cspAddresProvince";
	public static final String CSP_ADDRES_CITY = "cspAddresCity";
	public static final String CSP_ADDRESS_STREE = "cspAddressStree";
	public static final String CSP_POSTCODE = "cspPostcode";
	public static final String CSP_IS_ACTIVE = "cspIsActive";

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

	public void save(TCliStoppoints transientInstance) {
		log.debug("saving TCliStoppoints instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TCliStoppoints persistentInstance) {
		log.debug("deleting TCliStoppoints instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TCliStoppoints findById(java.lang.Integer id) {
		log.debug("getting TCliStoppoints instance with id: " + id);
		try {
			TCliStoppoints instance = (TCliStoppoints) getCurrentSession().get("entity.TCliStoppoints", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCliStoppoints> findByExample(TCliStoppoints instance) {
		log.debug("finding TCliStoppoints instance by example");
		try {
			List<TCliStoppoints> results = (List<TCliStoppoints>) getCurrentSession()
					.createCriteria("entity.TCliStoppoints").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TCliStoppoints instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TCliStoppoints as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TCliStoppoints> findByCspName(Object cspName) {
		return findByProperty(CSP_NAME, cspName);
	}

	public List<TCliStoppoints> findByCspAddresCountry(Object cspAddresCountry) {
		return findByProperty(CSP_ADDRES_COUNTRY, cspAddresCountry);
	}

	public List<TCliStoppoints> findByCspAddresProvince(Object cspAddresProvince) {
		return findByProperty(CSP_ADDRES_PROVINCE, cspAddresProvince);
	}

	public List<TCliStoppoints> findByCspAddresCity(Object cspAddresCity) {
		return findByProperty(CSP_ADDRES_CITY, cspAddresCity);
	}

	public List<TCliStoppoints> findByCspAddressStree(Object cspAddressStree) {
		return findByProperty(CSP_ADDRESS_STREE, cspAddressStree);
	}

	public List<TCliStoppoints> findByCspPostcode(Object cspPostcode) {
		return findByProperty(CSP_POSTCODE, cspPostcode);
	}

	public List<TCliStoppoints> findByCspIsActive(Object cspIsActive) {
		return findByProperty(CSP_IS_ACTIVE, cspIsActive);
	}

	public List findAll() {
		log.debug("finding all TCliStoppoints instances");
		try {
			String queryString = "from TCliStoppoints";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCliStoppoints merge(TCliStoppoints detachedInstance) {
		log.debug("merging TCliStoppoints instance");
		try {
			TCliStoppoints result = (TCliStoppoints) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCliStoppoints instance) {
		log.debug("attaching dirty TCliStoppoints instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TCliStoppoints instance) {
		log.debug("attaching clean TCliStoppoints instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TCliStoppointsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TCliStoppointsDAO) ctx.getBean("TCliStoppointsDAO");
	}
}