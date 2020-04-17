package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TCliStoppoints entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_cli_stoppoints", catalog = "lab_tms")

public class TCliStoppoints implements java.io.Serializable {

	// Fields

	private Integer cspId;
	private TClients TClients;
	private String cspName;
	private String cspAddresCountry;
	private String cspAddresProvince;
	private String cspAddresCity;
	private String cspAddressStree;
	private String cspPostcode;
	private Boolean cspIsActive;

	// Constructors

	/** default constructor */
	public TCliStoppoints() {
	}

	/** full constructor */
	public TCliStoppoints(TClients TClients, String cspName, String cspAddresCountry, String cspAddresProvince,
			String cspAddresCity, String cspAddressStree, String cspPostcode, Boolean cspIsActive) {
		this.TClients = TClients;
		this.cspName = cspName;
		this.cspAddresCountry = cspAddresCountry;
		this.cspAddresProvince = cspAddresProvince;
		this.cspAddresCity = cspAddresCity;
		this.cspAddressStree = cspAddressStree;
		this.cspPostcode = cspPostcode;
		this.cspIsActive = cspIsActive;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "csp_id", unique = true, nullable = false)

	public Integer getCspId() {
		return this.cspId;
	}

	public void setCspId(Integer cspId) {
		this.cspId = cspId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cli_id")

	public TClients getTClients() {
		return this.TClients;
	}

	public void setTClients(TClients TClients) {
		this.TClients = TClients;
	}

	@Column(name = "csp_name", length = 200)

	public String getCspName() {
		return this.cspName;
	}

	public void setCspName(String cspName) {
		this.cspName = cspName;
	}

	@Column(name = "csp_addres_country", length = 10)

	public String getCspAddresCountry() {
		return this.cspAddresCountry;
	}

	public void setCspAddresCountry(String cspAddresCountry) {
		this.cspAddresCountry = cspAddresCountry;
	}

	@Column(name = "csp_addres_province", length = 10)

	public String getCspAddresProvince() {
		return this.cspAddresProvince;
	}

	public void setCspAddresProvince(String cspAddresProvince) {
		this.cspAddresProvince = cspAddresProvince;
	}

	@Column(name = "csp_addres_city", length = 10)

	public String getCspAddresCity() {
		return this.cspAddresCity;
	}

	public void setCspAddresCity(String cspAddresCity) {
		this.cspAddresCity = cspAddresCity;
	}

	@Column(name = "csp_address_stree", length = 300)

	public String getCspAddressStree() {
		return this.cspAddressStree;
	}

	public void setCspAddressStree(String cspAddressStree) {
		this.cspAddressStree = cspAddressStree;
	}

	@Column(name = "csp_postcode", length = 20)

	public String getCspPostcode() {
		return this.cspPostcode;
	}

	public void setCspPostcode(String cspPostcode) {
		this.cspPostcode = cspPostcode;
	}

	@Column(name = "csp_isActive")

	public Boolean getCspIsActive() {
		return this.cspIsActive;
	}

	public void setCspIsActive(Boolean cspIsActive) {
		this.cspIsActive = cspIsActive;
	}

}