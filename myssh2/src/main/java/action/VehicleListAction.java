package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Tallproperties;
import entity.TVehicles;
import service.AllPropertieService;
import service.VehicleListService;

public class VehicleListAction  extends ActionSupport {
	 private static final long serialVersionUID = 1L;
		
	   //����service�������������������ʵ�����ʵ����
	   private VehicleListService vls = null;
	   private AllPropertieService aps = null;

	   private String ConditionStr=null;
	   private int TotalRecord=0;
	   private int numPerPage=3;
	   private int pageNum=1;
	   private List<Tallproperties> listType=null;
	  
	   private String ConVehiclePlate=null;
	   public String getConVehiclePlate() {
		return ConVehiclePlate;
	   }
	   public void setConVehiclePlate(String conVehiclePlate) {
			this.ConVehiclePlate = conVehiclePlate;
	   }
	   
	   
	   public String getConditionStr() {
			//"clientname#sa&clienttype@0001"cliType
			//ConditionStr=String.format("cliName#%s&cliType@%s", this.ConClinetName,this.ConClinetType);
			ConditionStr="";
			if(this.ConVehiclePlate!=null) {
				ConditionStr+=String.format("vehplate#%s",this.ConVehiclePlate);
			}						
			return ConditionStr;
		}
		
	   private String ConVehicleType=null;
		public String getConClinetType() {
			return ConVehicleType;
		}
		public void setConClinetType(String conVehicleType) {
			ConVehicleType = conVehicleType;
		}


	
		   
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


		   //���set()����
		   public void setVls(VehicleListService vls) {
		       this.vls = vls;
		   }
		   
		   public void setAps(AllPropertieService aps) {
		       this.aps = aps;
		   }
		   
		
		   public String execute() {
		       
			   
		       //��ȡIndexServiceʵ��������getAllBookCard()����
		       //��������浽List������
		      List<TVehicles> myVehicleList = vls.getVehicleByPage(this.getConditionStr(), this.pageNum, this.numPerPage);
		      listType =aps.getPropertyByGroup("");
		      
		      
		      this.TotalRecord=vls.getTotalRecord(this.getConditionStr());
		       
		       //����ѯ�����Ľṹ����ӡ������̨
		       System.out.println("Vehicle amount: "+myVehicleList.size());
		       
		       
		       //��ȡContext�����Ķ���
		       ActionContext ac = ActionContext.getContext();
		       //��myBookCardList������ӵ������Ķ�����
		       ac.put("myVehicleList", myVehicleList);
		       
		      
		       //����һ���ַ���
		       
		       //����һ���ַ���
		       return "success";
		   }




		public int getTotalRecord() {
			return TotalRecord;
		}


		public void setTotalRecord(int totalRecord) {
			TotalRecord = totalRecord;
		}
	   
	   
	   
	   
}
