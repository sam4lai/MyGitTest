package action;

import java.text.DecimalFormat;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.BookCard;
import service.IndexService;

//����IndexAction(action��)�̳�ActionSupport�ӿ�
public class IndexAction extends ActionSupport {
   
   private static final long serialVersionUID = 1L;
   
   //����service�������������������ʵ�����ʵ����
   private IndexService is = null;
   //���set()����
   public void setIs(IndexService is) {
       this.is = is;
   }
   
   //��дexecute()����
   public String execute() {
       
       //��ȡIndexServiceʵ��������getAllBookCard()����
       //��������浽List������
       List<BookCard> myBookCardList = is.getAllBookCard();
       
       //����ѯ�����Ľṹ����ӡ������̨
       System.out.println("�������"+myBookCardList.size());
       
       //��ȡContext�����Ķ���
       ActionContext ac = ActionContext.getContext();
       //��myBookCardList������ӵ������Ķ�����
       ac.put("myBookCardList", myBookCardList);
       
       //����һ���ַ���
       return "success";
   }
   
   //����ʽת��
   public String formatDouble(double s){
       DecimalFormat fmat=new DecimalFormat("\u00A4##.0"); 
       return fmat.format(s);
   }
   
}