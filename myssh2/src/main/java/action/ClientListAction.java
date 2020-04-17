package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Vclients;
import entity.Tallproperties;
import service.ClinetListService;
import service.AllPropertieService;

public class ClientListAction extends ActionSupport {

	 private static final long serialVersionUID = 1L;
	
	   //声明service，但不给它创建具体的实现类的实例，
	   private ClinetListService cls = null;
	   private AllPropertieService aps = null;
	   private String CondClientName=null;
	   private String ConditionStr=null;
	   private int TotalRecord=0;
	   private int numPerPage=3;
	   private int pageNum=1;
	   private List<Tallproperties> listType=null;
	   private String ConClinetName=null;
	   public String getConClinetName() {
		return ConClinetName;
	}


	public void setConClinetName(String conClinetName) {
		ConClinetName = conClinetName;
	}


	public String getConditionStr() {
		//"clientname#sa&clienttype@0001"cliType
		//ConditionStr=String.format("cliName#%s&cliType@%s", this.ConClinetName,this.ConClinetType);
		ConditionStr="";
		if(this.ConClinetName!=null) {
			ConditionStr+=String.format("cliName#%s",this.ConClinetName);
		}
		
		if(this.ConClinetType!=null) {
			ConditionStr+=String.format("&cliType@%s",this.ConClinetType);
		}
		
		return ConditionStr;
	}
	
	public String getConClinetType() {
		return ConClinetType;
	}


	public void setConClinetType(String conClinetType) {
		ConClinetType = conClinetType;
	}


	private String ConClinetType=null;
	
	   
	   public int getNumPerPage() {
		return numPerPage;
	}


	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}


	public List<Tallproperties> getListType() {
		return listType;
	}


	public void setListType(List<Tallproperties> listType) {
		this.listType = listType;
	}


	public int getPageNum() {
		return pageNum;
	}


	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}


	   //添加set()方法
	   public void setCls(ClinetListService cls) {
	       this.cls = cls;
	   }
	   
	   public void setAps(AllPropertieService aps) {
	       this.aps = aps;
	   }
	   
	
	   public String execute() {
	       
		   
	       //获取IndexService实例，调用getAllBookCard()方法
	       //将结果保存到List集合里
	      List<Vclients> myClientList = cls.getClientByPage(this.getConditionStr(), this.pageNum, this.numPerPage);
	      listType =aps.getPropertyByGroup("");
	      
	      
	      this.TotalRecord=cls.getTotalRecord(this.getConditionStr());
	       
	       //将查询出来的结构集打印到控制台
	       System.out.println("client amount: "+myClientList.size());
	       
	       //获取Context上下文对象
	       ActionContext ac = ActionContext.getContext();
	       //将myBookCardList集合添加到上下文对象里
	       ac.put("myClientList", myClientList);
	       
	      
	       //返回一个字符串
	       
	       //返回一个字符串
	       return "success";
	   }


	public String getCondClientName() {
		return CondClientName;
	}


	public void setCondClientName(String condClientName) {
		this.CondClientName = condClientName;
	}


	public int getTotalRecord() {
		return TotalRecord;
	}


	public void setTotalRecord(int totalRecord) {
		TotalRecord = totalRecord;
	}



}
