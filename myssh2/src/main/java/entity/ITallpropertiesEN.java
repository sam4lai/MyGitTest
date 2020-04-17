package entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

public interface ITallpropertiesEN {

	public String getProCode();
		

	public void setProCode(String proCode) ;
	

	public String getProName() ;

	public void setProName(String proName) ;


	public String getProNameEn() ;

	public void setProNameEn(String proNameEn) ;

	public String getProNameFr() ;

	public void setProNameFr(String proNameFr) ;

	

	public String getProNameCn() ;

	public void setProNameCn(String proNameCn) ;


	public String getProGroup() ;

	public void setProGroup(String proGroup) ;


	public Boolean getProIsActive() ;

	public void setProIsActive(Boolean proIsActive) ;


	public Timestamp getCreatDate() ;
	public void setCreatDate(Timestamp creatDate) ;



	public String getCreatBy() ;

	public void setCreatBy(String creatBy) ;



	public Timestamp getLastUpdate() ;

	public void setLastUpdate(Timestamp lastUpdate) ;


	public String getLastupdateBy() ;

	public void setLastupdateBy(String lastupdateBy) ;
}
