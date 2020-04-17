package entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Bookcard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bookcard", catalog = "test")

public class BookCard implements java.io.Serializable {

	// Fields

	private Short cid;
	private String name;
	private String sex;
	private Timestamp cardDate;
	private Double deposit;

	// Constructors

	/** default constructor */
	public BookCard() {
	}

	/** full constructor */
	public BookCard(String name, String sex, Timestamp cardDate, Double deposit) {
		this.name = name;
		this.sex = sex;
		this.cardDate = cardDate;
		this.deposit = deposit;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "cid", unique = true, nullable = false)

	public Short getCid() {
		return this.cid;
	}

	public void setCid(Short cid) {
		this.cid = cid;
	}

	@Column(name = "name", length = 100)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sex", length = 10)

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "cardDate", length = 19)

	public Timestamp getCardDate() {
		return this.cardDate;
	}

	public void setCardDate(Timestamp cardDate) {
		this.cardDate = cardDate;
	}

	@Column(name = "deposit", precision = 10)

	public Double getDeposit() {
		return this.deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

}