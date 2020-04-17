package service;

import java.util.List;
import dao.TVehiclesDAO;
import entity.TVehicles;

public class VehicleListServiceImpl implements VehicleListService {
	  
	// private TclientsDAO cdao;
	   private TVehiclesDAO vehdao;
	   
	   //用于注入使用
	   public void setVehdao(TVehiclesDAO vehdao) {
	       this.vehdao = vehdao;
	   }
	   
	   public int getTotalRecord(String ConditionStr) {
		   int count = vehdao.getCountbyCondition(ConditionStr);//cdao.findAll().size();
		   return count;
	   }
	   
	   public List<TVehicles> getVehicleByPage(String conditionStr,int pageNum,int numPerPage) 
	   {		   
		   List<TVehicles> myVehicleList=null;
		   myVehicleList=vehdao.findbyConditionPage(conditionStr, pageNum, numPerPage);	       
	       return myVehicleList;
	   }
	
}
