package entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Tallproperties entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tallproperties", catalog = "samdb")

public class Tallproperties extends dao.BaseDAO implements java.io.Serializable {

	// Fields

	private String proCode;
	private String proNameEn;
	private String proNameFr;
	private String proNameCn;
	private String proGroup;
	private Boolean proIsActive;
	private Timestamp creatDate;
	private String creatBy;
	private Timestamp lastUpdate;
	private String lastupdateBy;

	// Constructors

	/** default constructor */
	public Tallproperties() {
	}

	/** full constructor */
	public Tallproperties(String proNameEn, String proNameFr, String proNameCn, String proGroup, Boolean proIsActive,
			Timestamp creatDate, String creatBy, Timestamp lastUpdate, String lastupdateBy) {
		this.proNameEn = proNameEn;
		this.proNameFr = proNameFr;
		this.proNameCn = proNameCn;
		this.proGroup = proGroup;
		this.proIsActive = proIsActive;
		this.creatDate = creatDate;
		this.creatBy = creatBy;
		this.lastUpdate = lastUpdate;
		this.lastupdateBy = lastupdateBy;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "proCode", unique = true, nullable = false, length = 10)

	public String getProCode() {
		return this.proCode;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	@Column(name = "proNameEn", length = 200)

	public String getProNameEn() {
		return this.proNameEn;
		//return this.proNameCn;
	}

	public void setProNameEn(String proNameEn) {
		this.proNameEn = proNameEn;
	}

	@Column(name = "proNameFr", length = 200)

	public String getProNameFr() {
		return this.proNameFr;
	}

	public void setProNameFr(String proNameFr) {
		this.proNameFr = proNameFr;
	}

	@Column(name = "proNameCn", length = 200)

	public String getProNameCn() {
		return this.proNameCn;
	}

	public void setProNameCn(String proNameCn) {
		this.proNameCn = proNameCn;
	}

	@Column(name = "proGroup", length = 20)

	public String getProGroup() {
		return this.proGroup;
	}

	public void setProGroup(String proGroup) {
		this.proGroup = proGroup;
	}

	@Column(name = "proIsActive")

	public Boolean getProIsActive() {
		return this.proIsActive;
	}

	public void setProIsActive(Boolean proIsActive) {
		this.proIsActive = proIsActive;
	}

	@Column(name = "CreatDate", length = 19)

	public Timestamp getCreatDate() {
		return this.creatDate;
	}

	public void setCreatDate(Timestamp creatDate) {
		this.creatDate = creatDate;
	}

	@Column(name = "CreatBy", length = 50)

	public String getCreatBy() {
		return this.creatBy;
	}

	public void setCreatBy(String creatBy) {
		this.creatBy = creatBy;
	}

	@Column(name = "LastUpdate", length = 19)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "LastupdateBy", length = 50)

	public String getLastupdateBy() {
		return this.lastupdateBy;
	}

	public void setLastupdateBy(String lastupdateBy) {
		this.lastupdateBy = lastupdateBy;
	}

}