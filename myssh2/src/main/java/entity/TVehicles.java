package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TVehicles" , catalog = "samdb")
public class TVehicles implements java.io.Serializable {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "vehid", unique = true, nullable = false)
	    private int vehid;
	    @Column(name = "vehcode", length = 20)
	    private String vehcode;
	    @Column(name = "vehplate", length = 10)
	    private String vehplate;
	    @Column(name = "vehtype", length = 10)
	    private String vehtype;
	    @Column(name = "vehowner", length = 50)
	    private String vehowner;
	    public TVehicles() {
	    }
	    public TVehicles( String vehcode, String vehplate, String vehtype, String vehowner) {

	        this.vehcode = vehcode;
	        this.vehplate = vehplate;
	        this.vehtype = vehtype;
	        this.vehowner = vehowner;
	    }
	    public int getVehid() {
	        return vehid;
	    }
	    public void setId(int vehid) {
	        this.vehid = vehid;
	    }
	    public String getVehcode() {
	        return vehcode;
	    }
	    public void setVehcode(String vehcode) {
	        this.vehcode = vehcode;
	    }
	    public String getVehplate() {
	        return vehplate;
	    }
	    public void setVehplate(String vehplate) {
	        this.vehplate = vehplate;
	    }
	    public String getVehtype() {
	        return vehtype;
	    }
	    public void setVehtype(String vehtype) {
	        this.vehtype = vehtype;
	    }
	    public String getVehowner() {
	        return vehowner;
	    }
	    public void setVehowner(String vehowner) {
	        this.vehowner = vehowner;
	    }
}
