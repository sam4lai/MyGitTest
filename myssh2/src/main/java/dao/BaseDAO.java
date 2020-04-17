package dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
public class BaseDAO {

	protected Map<String,String> ConditionToMap(String Condition) {

	       //Condition="clientname#sa&clienttype@0001";
			
			String[] ConStr=Condition.split("&");
			Map<String,String> ConHash=new HashMap<String,String>();
			
			for(int i=0;i<ConStr.length;i++) {
				if(ConStr[i].contains("#")) {
				
				String[] TempStr=ConStr[i].split("#");
				ConHash.put(TempStr[0], TempStr[1]);
				ConHash.put(TempStr[0]+"_Restriction", "like");
				
				
				} 
				if(ConStr[i].contains("@")) {
					
					String[] TempStr=ConStr[i].split("@");
					ConHash.put(TempStr[0], TempStr[1]);
					ConHash.put(TempStr[0]+"_Restriction", "equate");
				}
				
				
			}
		
		
		return ConHash;
	}
	
	
	/**
	 * split conition string to sql/hql string
	 * @param Condition, condition string
	 * @return  sql/hql string
	 */
	protected String ConditionToSql(String Condition)
	{
		String[] ConStr=Condition.split("&");
		String SqlStr="";
		String[] TempStr;
		for(int i=0;i<ConStr.length;i++) {
			if(ConStr[i].contains("#")) {
				
			TempStr=ConStr[i].split("#");
			if(TempStr.length==2)
			{
			    if(SqlStr.equals(""))
			    {
			    	SqlStr=" Where 1=1 ";
			    }
			    
			    SqlStr+=String.format(" and %s like '%% %s %%'", TempStr[0],TempStr[1]);
			    
			}
			
			}
		       
			
			if(ConStr[i].contains("@")) {
				TempStr=ConStr[i].split("@");
				if(TempStr.length==2)
				{
				    if(SqlStr.equals(""))
				    {
				    	SqlStr=" Where 1=1 ";
				    }
				    
				    SqlStr+=String.format(" and %s =  %s ", TempStr[0],TempStr[1]);
				    
				}

			}
			
			
	   }
		return SqlStr;
	}
	
	
}
