package entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TClients entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tClients")

public class TClients implements java.io.Serializable {

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
	private String cliAddresCountry;
	private String cliAddresProvince;
	private String cliAddresCity;
	private String cliAddressStree;
	private String cliPostcode;
	private Integer cliSubsidiaryId;
	private String cliPassword;
	private Boolean cliIsActive;
	private Set<TCliStoppoints> TCliStoppointses = new HashSet<TCliStoppoints>(0);

	// Constructors

	/** default constructor */
	public TClients() {
	}

	/** full constructor */
	public TClients(String cliCode, String cliName, String cliType, String cliConnector, String cliTelnum,
			String cliFax, String cliEmail, String cliBank, String cliBankAccount, String cliAddresCountry,
			String cliAddresProvince, String cliAddresCity, String cliAddressStree, String cliPostcode,
			Integer cliSubsidiaryId, String cliPassword, Boolean cliIsActive, Set<TCliStoppoints> TCliStoppointses) {
		this.cliCode = cliCode;
		this.cliName = cliName;
		this.cliType = cliType;
		this.cliConnector = cliConnector;
		this.cliTelnum = cliTelnum;
		this.cliFax = cliFax;
		this.cliEmail = cliEmail;
		this.cliBank = cliBank;
		this.cliBankAccount = cliBankAccount;
		this.cliAddresCountry = cliAddresCountry;
		this.cliAddresProvince = cliAddresProvince;
		this.cliAddresCity = cliAddresCity;
		this.cliAddressStree = cliAddressStree;
		this.cliPostcode = cliPostcode;
		this.cliSubsidiaryId = cliSubsidiaryId;
		this.cliPassword = cliPassword;
		this.cliIsActive = cliIsActive;
		this.TCliStoppointses = TCliStoppointses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "cliid", unique = true, nullable = false)

	public Integer getCliId() {
		return this.cliId;
	}

	public void setCliId(Integer cliId) {
		this.cliId = cliId;
	}

	@Column(name = "clicode", length = 50)

	public String getCliCode() {
		return this.cliCode;
	}

	public void setCliCode(String cliCode) {
		this.cliCode = cliCode;
	}

	@Column(name = "cliname", length = 200)

	public String getCliName() {
		return this.cliName;
	}

	public void setCliName(String cliName) {
		this.cliName = cliName;
	}

	@Column(name = "clitype", length = 10)

	public String getCliType() {
		return this.cliType;
	}

	public void setCliType(String cliType) {
		this.cliType = cliType;
	}

	@Column(name = "cliconnector", length = 50)

	public String getCliConnector() {
		return this.cliConnector;
	}

	public void setCliConnector(String cliConnector) {
		this.cliConnector = cliConnector;
	}

	@Column(name = "clitelnum", length = 50)

	public String getCliTelnum() {
		return this.cliTelnum;
	}

	public void setCliTelnum(String cliTelnum) {
		this.cliTelnum = cliTelnum;
	}

	@Column(name = "clifax", length = 50)

	public String getCliFax() {
		return this.cliFax;
	}

	public void setCliFax(String cliFax) {
		this.cliFax = cliFax;
	}

	@Column(name = "cliemail", length = 200)

	public String getCliEmail() {
		return this.cliEmail;
	}

	public void setCliEmail(String cliEmail) {
		this.cliEmail = cliEmail;
	}

	@Column(name = "clibank", length = 10)

	public String getCliBank() {
		return this.cliBank;
	}

	public void setCliBank(String cliBank) {
		this.cliBank = cliBank;
	}

	@Column(name = "clibankAccount", length = 50)

	public String getCliBankAccount() {
		return this.cliBankAccount;
	}

	public void setCliBankAccount(String cliBankAccount) {
		this.cliBankAccount = cliBankAccount;
	}

	@Column(name = "cliaddrescountry", length = 10)

	public String getCliAddresCountry() {
		return this.cliAddresCountry;
	}

	public void setCliAddresCountry(String cliAddresCountry) {
		this.cliAddresCountry = cliAddresCountry;
	}

	@Column(name = "cliaddresprovince", length = 10)

	public String getCliAddresProvince() {
		return this.cliAddresProvince;
	}

	public void setCliAddresProvince(String cliAddresProvince) {
		this.cliAddresProvince = cliAddresProvince;
	}

	@Column(name = "cliaddrescity", length = 10)

	public String getCliAddresCity() {
		return this.cliAddresCity;
	}

	public void setCliAddresCity(String cliAddresCity) {
		this.cliAddresCity = cliAddresCity;
	}

	@Column(name = "cliaddressstree", length = 300)

	public String getCliAddressStree() {
		return this.cliAddressStree;
	}

	public void setCliAddressStree(String cliAddressStree) {
		this.cliAddressStree = cliAddressStree;
	}

	@Column(name = "clipostcode", length = 20)

	public String getCliPostcode() {
		return this.cliPostcode;
	}

	public void setCliPostcode(String cliPostcode) {
		this.cliPostcode = cliPostcode;
	}

	@Column(name = "clisubsidiaryId")

	public Integer getCliSubsidiaryId() {
		return this.cliSubsidiaryId;
	}

	public void setCliSubsidiaryId(Integer cliSubsidiaryId) {
		this.cliSubsidiaryId = cliSubsidiaryId;
	}

	@Column(name = "clipassword", length = 50)

	public String getCliPassword() {
		return this.cliPassword;
	}

	public void setCliPassword(String cliPassword) {
		this.cliPassword = cliPassword;
	}

	@Column(name = "cliisActive")

	public Boolean getCliIsActive() {
		return this.cliIsActive;
	}

	public void setCliIsActive(Boolean cliIsActive) {
		this.cliIsActive = cliIsActive;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TClients")

	public Set<TCliStoppoints> getTCliStoppointses() {
		return this.TCliStoppointses;
	}

	public void setTCliStoppointses(Set<TCliStoppoints> TCliStoppointses) {
		this.TCliStoppointses = TCliStoppointses;
	}

}