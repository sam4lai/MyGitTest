package service;

import java.util.List;

import dao.BookcardDAO;
import entity.BookCard;

//����IndexServiceImpl(ʵ����)ʵ��IndexService�ӿ�
public class IndexServiceImpl implements IndexService {

   //daoʵ��ʹ��ע�뷽ʽ
   private BookcardDAO id;
   //����ע��ʹ��
   public void setId(BookcardDAO id) {
       this.id = id;
   }


   //@Override
   public List<BookCard> getAllBookCard() {
       //����Ӧ�ñ�дҵ���߼��Ĵ��룬
       //������û��ҵ���߼����Ͳ���д��
       
       //�������ݿ�Ĵ��룬���������service��һ��
       //����dao���������ݿ�
       List<BookCard> myBookCardList = id.findByExpression("Sam");
       
       //����������ҵ���߼��������������Ӷ�һ��ѡ��Ƿ����
       //��������Ҫ
       //....
       
       return myBookCardList;
   }

}
