package service;


import java.util.List;
import dao.TclientsDAO;
import dao.VclientsDAO;
import entity.BookCard;
import entity.Vclients;



public class ClinetListServiceImpl implements ClinetListService {

	  // private TclientsDAO cdao;
	   private VclientsDAO vcdao;
	   //����ע��ʹ��
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
	       //����Ӧ�ñ�дҵ���߼��Ĵ��룬
	       //������û��ҵ���߼����Ͳ���д��
	       
	       //�������ݿ�Ĵ��룬���������service��һ��
	       //����dao���������ݿ�
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
	       
	       
	       //����������ҵ���߼��������������Ӷ�һ��ѡ��Ƿ����
	       //��������Ҫ
	       //....
	       
	       return myClientList;
	   }
}
