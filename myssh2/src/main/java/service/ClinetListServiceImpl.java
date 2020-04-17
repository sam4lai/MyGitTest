package service;


import java.util.List;
import dao.TclientsDAO;
import dao.VclientsDAO;
import entity.BookCard;
import entity.Vclients;



public class ClinetListServiceImpl implements ClinetListService {

	  // private TclientsDAO cdao;
	   private VclientsDAO vcdao;
	   //用于注入使用
//	   public void setCdao(TclientsDAO cdao) {
//	       this.cdao = cdao;
//	   }
	   public void setVcdao(VclientsDAO vcdao) {
	       this.vcdao = vcdao;
	   }
	   
	   //"clientname#sa&clienttype@0001"
	   
	   
	   public int getTotalRecord(String ConditionStr) {
		   int count = vcdao.getCountbyCondition(ConditionStr);//cdao.findAll().size();
		   return count;
	   }
	   public List<Vclients> getClientByPage(String conditionStr,int pageNum,int numPerPage) 
	   {
	       //本类应该编写业务逻辑的代码，
	       //但本例没有业务逻辑，就不用写。
	       
	       //访问数据库的代码，不会出现在service这一层
	       //交给dao来操作数据库
		   List<Vclients> myClientList=null;
		   myClientList=vcdao.findbyConditionPage(conditionStr, pageNum, numPerPage);
/*		   if(conditionStr==null)
		   {
			   //int count=cdao.findAll().size();
			   
			   //String hql = "select count(*) from User as user";
			  
			   myClientList = cdao.findAllbyPage(pageNum,numPerPage);
		   }
		   else if(conditionStr.equals(""))
		   {
			   myClientList = cdao.findAllbyPage(pageNum,numPerPage);
			   		   }
		   else {
			   myClientList = cdao.findByExpression(conditionStr); 
		   }
			  */ 
	       
	       
	       //进行其它的业务逻辑操作，比如增加多一个选项，是否过期
	       //本例不需要
	       //....
	       
	       return myClientList;
	   }
}
