package entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VclientsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class VclientsId extends dao.BaseDAO implements java.io.Serializable {

	// Fields

	private Integer cliId;
	private String cliCode;
	private String cliName;
	private String cliType;
	private String cliConnector;
	private String cliTelnum;
	private String cliFax;
	private String cliEmail;
	private String cliBank;
	private String cliBankAccount;
	private String cliAddrescountry;
	private String cliAddresprovince;
	private String cliAddrescity;
	private String cliAddressstree;
	private String cliPostcode;
	private Integer cliSubsidiaryId;
	private String cliPassword;
	private Boolean cliIsActive;
	private Timestamp creatDate;
	private String creatBy;
	private Timestamp lastUpdate;
	private String lastupdateBy;
	private String proCode;
	private String proNameEn;
	private String proNameFr;
	private String proNameCn;

	// Constructors

	/** default constructor */
	public VclientsId() {
	}

	/** minimal constructor */
	public VclientsId(Integer cliId, String proCode) {
		this.cliId = cliId;
		this.proCode = proCode;
	}

	/** full constructor */
	public VclientsId(Integer cliId, String cliCode, String cliName, String cliType, String cliConnector,
			String cliTelnum, String cliFax, String cliEmail, String cliBank, String cliBankAccount,
			String cliAddrescountry, String cliAddresprovince, String cliAddrescity, String cliAddressstree,
			String cliPostcode, Integer cliSubsidiaryId, String cliPassword, Boolean cliIsActive, Timestamp creatDate,
			String creatBy, Timestamp lastUpdate, String lastupdateBy, String proCode, String proNameEn,
			String proNameFr, String proNameCn) {
		this.cliId = cliId;
		this.cliCode = cliCode;
		this.cliName = cliName;
		this.cliType = cliType;
		this.cliConnector = cliConnector;
		this.cliTelnum = cliTelnum;
		this.cliFax = cliFax;
		this.cliEmail = cliEmail;
		this.cliBank = cliBank;
		this.cliBankAccount = cliBankAccount;
		this.cliAddrescountry = cliAddrescountry;
		this.cliAddresprovince = cliAddresprovince;
		this.cliAddrescity = cliAddrescity;
		this.cliAddressstree = cliAddressstree;
		this.cliPostcode = cliPostcode;
		this.cliSubsidiaryId = cliSubsidiaryId;
		this.cliPassword = cliPassword;
		this.cliIsActive = cliIsActive;
		this.creatDate = creatDate;
		this.creatBy = creatBy;
		this.lastUpdate = lastUpdate;
		this.lastupdateBy = lastupdateBy;
		this.proCode = proCode;
		this.proNameEn = proNameEn;
		this.proNameFr = proNameFr;
		this.proNameCn = proNameCn;
	}

	// Property accessors

	@Column(name = "cliId", nullable = false)

	public Integer getCliId() {
		return this.cliId;
	}

	public void setCliId(Integer cliId) {
		this.cliId = cliId;
	}

	@Column(name = "cliCode", length = 50)

	public String getCliCode() {
		return this.cliCode;
	}

	public void setCliCode(String cliCode) {
		this.cliCode = cliCode;
	}

	@Column(name = "cliName", length = 200)

	public String getCliName() {
		return this.cliName;
	}

	public void setCliName(String cliName) {
		this.cliName = cliName;
	}

	@Column(name = "cliType", length = 10)

	public String getCliType() {
		return this.cliType;
	}

	public void setCliType(String cliType) {
		this.cliType = cliType;
	}

	@Column(name = "cliConnector", length = 50)

	public String getCliConnector() {
		return this.cliConnector;
	}

	public void setCliConnector(String cliConnector) {
		this.cliConnector = cliConnector;
	}

	@Column(name = "cliTelnum", length = 50)

	public String getCliTelnum() {
		return this.cliTelnum;
	}

	public void setCliTelnum(String cliTelnum) {
		this.cliTelnum = cliTelnum;
	}

	@Column(name = "cliFax", length = 50)

	public String getCliFax() {
		return this.cliFax;
	}

	public void setCliFax(String cliFax) {
		this.cliFax = cliFax;
	}

	@Column(name = "cliEmail", length = 200)

	public String getCliEmail() {
		return this.cliEmail;
	}

	public void setCliEmail(String cliEmail) {
		this.cliEmail = cliEmail;
	}

	@Column(name = "cliBank", length = 10)

	public String getCliBank() {
		return this.cliBank;
	}

	public void setCliBank(String cliBank) {
		this.cliBank = cliBank;
	}

	@Column(name = "cliBankAccount", length = 50)

	public String getCliBankAccount() {
		return this.cliBankAccount;
	}

	public void setCliBankAccount(String cliBankAccount) {
		this.cliBankAccount = cliBankAccount;
	}

	@Column(name = "cliAddrescountry", length = 10)

	public String getCliAddrescountry() {
		return this.cliAddrescountry;
	}

	public void setCliAddrescountry(String cliAddrescountry) {
		this.cliAddrescountry = cliAddrescountry;
	}

	@Column(name = "cliAddresprovince", length = 10)

	public String getCliAddresprovince() {
		return this.cliAddresprovince;
	}

	public void setCliAddresprovince(String cliAddresprovince) {
		this.cliAddresprovince = cliAddresprovince;
	}

	@Column(name = "cliAddrescity", length = 10)

	public String getCliAddrescity() {
		return this.cliAddrescity;
	}

	public void setCliAddrescity(String cliAddrescity) {
		this.cliAddrescity = cliAddrescity;
	}

	@Column(name = "cliAddressstree", length = 300)

	public String getCliAddressstree() {
		return this.cliAddressstree;
	}

	public void setCliAddressstree(String cliAddressstree) {
		this.cliAddressstree = cliAddressstree;
	}

	@Column(name = "cliPostcode", length = 20)

	public String getCliPostcode() {
		return this.cliPostcode;
	}

	public void setCliPostcode(String cliPostcode) {
		this.cliPostcode = cliPostcode;
	}

	@Column(name = "cliSubsidiaryId")

	public Integer getCliSubsidiaryId() {
		return this.cliSubsidiaryId;
	}

	public void setCliSubsidiaryId(Integer cliSubsidiaryId) {
		this.cliSubsidiaryId = cliSubsidiaryId;
	}

	@Column(name = "cliPassword", length = 50)

	public String getCliPassword() {
		return this.cliPassword;
	}

	public void setCliPassword(String cliPassword) {
		this.cliPassword = cliPassword;
	}

	@Column(name = "cliIsActive")

	public Boolean getCliIsActive() {
		return this.cliIsActive;
	}

	public void setCliIsActive(Boolean cliIsActive) {
		this.cliIsActive = cliIsActive;
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

	@Column(name = "proCode", nullable = false, length = 10)

	public String getProCode() {
		return this.proCode;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	@Column(name = "proNameEn", length = 200)

	public String getProNameEn() {
		return this.proNameEn;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VclientsId))
			return false;
		VclientsId castOther = (VclientsId) other;

		return ((this.getCliId() == castOther.getCliId()) || (this.getCliId() != null && castOther.getCliId() != null
				&& this.getCliId().equals(castOther.getCliId())))
				&& ((this.getCliCode() == castOther.getCliCode()) || (this.getCliCode() != null
						&& castOther.getCliCode() != null && this.getCliCode().equals(castOther.getCliCode())))
				&& ((this.getCliName() == castOther.getCliName()) || (this.getCliName() != null
						&& castOther.getCliName() != null && this.getCliName().equals(castOther.getCliName())))
				&& ((this.getCliType() == castOther.getCliType()) || (this.getCliType() != null
						&& castOther.getCliType() != null && this.getCliType().equals(castOther.getCliType())))
				&& ((this.getCliConnector() == castOther.getCliConnector())
						|| (this.getCliConnector() != null && castOther.getCliConnector() != null
								&& this.getCliConnector().equals(castOther.getCliConnector())))
				&& ((this.getCliTelnum() == castOther.getCliTelnum()) || (this.getCliTelnum() != null
						&& castOther.getCliTelnum() != null && this.getCliTelnum().equals(castOther.getCliTelnum())))
				&& ((this.getCliFax() == castOther.getCliFax()) || (this.getCliFax() != null
						&& castOther.getCliFax() != null && this.getCliFax().equals(castOther.getCliFax())))
				&& ((this.getCliEmail() == castOther.getCliEmail()) || (this.getCliEmail() != null
						&& castOther.getCliEmail() != null && this.getCliEmail().equals(castOther.getCliEmail())))
				&& ((this.getCliBank() == castOther.getCliBank()) || (this.getCliBank() != null
						&& castOther.getCliBank() != null && this.getCliBank().equals(castOther.getCliBank())))
				&& ((this.getCliBankAccount() == castOther.getCliBankAccount())
						|| (this.getCliBankAccount() != null && castOther.getCliBankAccount() != null
								&& this.getCliBankAccount().equals(castOther.getCliBankAccount())))
				&& ((this.getCliAddrescountry() == castOther.getCliAddrescountry())
						|| (this.getCliAddrescountry() != null && castOther.getCliAddrescountry() != null
								&& this.getCliAddrescountry().equals(castOther.getCliAddrescountry())))
				&& ((this.getCliAddresprovince() == castOther.getCliAddresprovince())
						|| (this.getCliAddresprovince() != null && castOther.getCliAddresprovince() != null
								&& this.getCliAddresprovince().equals(castOther.getCliAddresprovince())))
				&& ((this.getCliAddrescity() == castOther.getCliAddrescity())
						|| (this.getCliAddrescity() != null && castOther.getCliAddrescity() != null
								&& this.getCliAddrescity().equals(castOther.getCliAddrescity())))
				&& ((this.getCliAddressstree() == castOther.getCliAddressstree())
						|| (this.getCliAddressstree() != null && castOther.getCliAddressstree() != null
								&& this.getCliAddressstree().equals(castOther.getCliAddressstree())))
				&& ((this.getCliPostcode() == castOther.getCliPostcode())
						|| (this.getCliPostcode() != null && castOther.getCliPostcode() != null
								&& this.getCliPostcode().equals(castOther.getCliPostcode())))
				&& ((this.getCliSubsidiaryId() == castOther.getCliSubsidiaryId())
						|| (this.getCliSubsidiaryId() != null && castOther.getCliSubsidiaryId() != null
								&& this.getCliSubsidiaryId().equals(castOther.getCliSubsidiaryId())))
				&& ((this.getCliPassword() == castOther.getCliPassword())
						|| (this.getCliPassword() != null && castOther.getCliPassword() != null
								&& this.getCliPassword().equals(castOther.getCliPassword())))
				&& ((this.getCliIsActive() == castOther.getCliIsActive())
						|| (this.getCliIsActive() != null && castOther.getCliIsActive() != null
								&& this.getCliIsActive().equals(castOther.getCliIsActive())))
				&& ((this.getCreatDate() == castOther.getCreatDate()) || (this.getCreatDate() != null
						&& castOther.getCreatDate() != null && this.getCreatDate().equals(castOther.getCreatDate())))
				&& ((this.getCreatBy() == castOther.getCreatBy()) || (this.getCreatBy() != null
						&& castOther.getCreatBy() != null && this.getCreatBy().equals(castOther.getCreatBy())))
				&& ((this.getLastUpdate() == castOther.getLastUpdate()) || (this.getLastUpdate() != null
						&& castOther.getLastUpdate() != null && this.getLastUpdate().equals(castOther.getLastUpdate())))
				&& ((this.getLastupdateBy() == castOther.getLastupdateBy())
						|| (this.getLastupdateBy() != null && castOther.getLastupdateBy() != null
								&& this.getLastupdateBy().equals(castOther.getLastupdateBy())))
				&& ((this.getProCode() == castOther.getProCode()) || (this.getProCode() != null
						&& castOther.getProCode() != null && this.getProCode().equals(castOther.getProCode())))
				&& ((this.getProNameEn() == castOther.getProNameEn()) || (this.getProNameEn() != null
						&& castOther.getProNameEn() != null && this.getProNameEn().equals(castOther.getProNameEn())))
				&& ((this.getProNameFr() == castOther.getProNameFr()) || (this.getProNameFr() != null
						&& castOther.getProNameFr() != null && this.getProNameFr().equals(castOther.getProNameFr())))
				&& ((this.getProNameCn() == castOther.getProNameCn()) || (this.getProNameCn() != null
						&& castOther.getProNameCn() != null && this.getProNameCn().equals(castOther.getProNameCn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCliId() == null ? 0 : this.getCliId().hashCode());
		result = 37 * result + (getCliCode() == null ? 0 : this.getCliCode().hashCode());
		result = 37 * result + (getCliName() == null ? 0 : this.getCliName().hashCode());
		result = 37 * result + (getCliType() == null ? 0 : this.getCliType().hashCode());
		result = 37 * result + (getCliConnector() == null ? 0 : this.getCliConnector().hashCode());
		result = 37 * result + (getCliTelnum() == null ? 0 : this.getCliTelnum().hashCode());
		result = 37 * result + (getCliFax() == null ? 0 : this.getCliFax().hashCode());
		result = 37 * result + (getCliEmail() == null ? 0 : this.getCliEmail().hashCode());
		result = 37 * result + (getCliBank() == null ? 0 : this.getCliBank().hashCode());
		result = 37 * result + (getCliBankAccount() == null ? 0 : this.getCliBankAccount().hashCode());
		result = 37 * result + (getCliAddrescountry() == null ? 0 : this.getCliAddrescountry().hashCode());
		result = 37 * result + (getCliAddresprovince() == null ? 0 : this.getCliAddresprovince().hashCode());
		result = 37 * result + (getCliAddrescity() == null ? 0 : this.getCliAddrescity().hashCode());
		result = 37 * result + (getCliAddressstree() == null ? 0 : this.getCliAddressstree().hashCode());
		result = 37 * result + (getCliPostcode() == null ? 0 : this.getCliPostcode().hashCode());
		result = 37 * result + (getCliSubsidiaryId() == null ? 0 : this.getCliSubsidiaryId().hashCode());
		result = 37 * result + (getCliPassword() == null ? 0 : this.getCliPassword().hashCode());
		result = 37 * result + (getCliIsActive() == null ? 0 : this.getCliIsActive().hashCode());
		result = 37 * result + (getCreatDate() == null ? 0 : this.getCreatDate().hashCode());
		result = 37 * result + (getCreatBy() == null ? 0 : this.getCreatBy().hashCode());
		result = 37 * result + (getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode());
		result = 37 * result + (getLastupdateBy() == null ? 0 : this.getLastupdateBy().hashCode());
		result = 37 * result + (getProCode() == null ? 0 : this.getProCode().hashCode());
		result = 37 * result + (getProNameEn() == null ? 0 : this.getProNameEn().hashCode());
		result = 37 * result + (getProNameFr() == null ? 0 : this.getProNameFr().hashCode());
		result = 37 * result + (getProNameCn() == null ? 0 : this.getProNameCn().hashCode());
		return result;
	}

}