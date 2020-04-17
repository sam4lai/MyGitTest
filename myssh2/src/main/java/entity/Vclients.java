package entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vclients entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "vclients")

public class Vclients extends dao.BaseDAO implements java.io.Serializable {

	// Fields

	private VclientsId id;

	// Constructors

	/** default constructor */
	public Vclients() {
	}

	/** full constructor */
	public Vclients(VclientsId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "cliId", column = @Column(name = "cliId", nullable = false)),
			@AttributeOverride(name = "cliCode", column = @Column(name = "cliCode", length = 50)),
			@AttributeOverride(name = "cliName", column = @Column(name = "cliName", length = 200)),
			@AttributeOverride(name = "cliType", column = @Column(name = "cliType", length = 10)),
			@AttributeOverride(name = "cliConnector", column = @Column(name = "cliConnector", length = 50)),
			@AttributeOverride(name = "cliTelnum", column = @Column(name = "cliTelnum", length = 50)),
			@AttributeOverride(name = "cliFax", column = @Column(name = "cliFax", length = 50)),
			@AttributeOverride(name = "cliEmail", column = @Column(name = "cliEmail", length = 200)),
			@AttributeOverride(name = "cliBank", column = @Column(name = "cliBank", length = 10)),
			@AttributeOverride(name = "cliBankAccount", column = @Column(name = "cliBankAccount", length = 50)),
			@AttributeOverride(name = "cliAddrescountry", column = @Column(name = "cliAddrescountry", length = 10)),
			@AttributeOverride(name = "cliAddresprovince", column = @Column(name = "cliAddresprovince", length = 10)),
			@AttributeOverride(name = "cliAddrescity", column = @Column(name = "cliAddrescity", length = 10)),
			@AttributeOverride(name = "cliAddressstree", column = @Column(name = "cliAddressstree", length = 300)),
			@AttributeOverride(name = "cliPostcode", column = @Column(name = "cliPostcode", length = 20)),
			@AttributeOverride(name = "cliSubsidiaryId", column = @Column(name = "cliSubsidiaryId")),
			@AttributeOverride(name = "cliPassword", column = @Column(name = "cliPassword", length = 50)),
			@AttributeOverride(name = "cliIsActive", column = @Column(name = "cliIsActive")),
			@AttributeOverride(name = "creatDate", column = @Column(name = "CreatDate", length = 19)),
			@AttributeOverride(name = "creatBy", column = @Column(name = "CreatBy", length = 50)),
			@AttributeOverride(name = "lastUpdate", column = @Column(name = "LastUpdate", length = 19)),
			@AttributeOverride(name = "lastupdateBy", column = @Column(name = "LastupdateBy", length = 50)),
			@AttributeOverride(name = "proCode", column = @Column(name = "proCode", nullable = false, length = 10)),
			@AttributeOverride(name = "proNameEn", column = @Column(name = "proNameEn", length = 200)),
			@AttributeOverride(name = "proNameFr", column = @Column(name = "proNameFr", length = 200)),
			@AttributeOverride(name = "proNameCn", column = @Column(name = "proNameCn", length = 200)) })

	public VclientsId getId() {
		return this.id;
	}

	public void setId(VclientsId id) {
		this.id = id;
	}

}