package service;

import java.util.List;

import dao.TallpropertiesDAO;
import entity.TClients;
import entity.Tallproperties;

public class AllPropertieServiceImpl implements AllPropertieService {

	   private TallpropertiesDAO pdao;
	   //用于注入使用
	   public void setPdao(TallpropertiesDAO pdao) {
	       this.pdao = pdao;
	   } 
	   
	public List<Tallproperties> getPropertyByGroup(String group)
	{

		   List<Tallproperties> myPropertyList=null;
		   if(group==null || group.equals("") )
		   {
		  
			   myPropertyList = pdao.findAll();
		   }
		   else {
			   myPropertyList = pdao.findByProGroup(group); 
		   }
			   
	       
	       return myPropertyList;
		   
		
	}
	
	
	
}
