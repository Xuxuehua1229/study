package algorithm;

public class Test {

	public static void main(String[] args) {
       //��ˮ�ɻ�����һ����λ���������λ�����������͵����䱾��
	   int baiWei = 0;
	   int shiWei = 0;
	   int geWei = 0;
	   System.out.println("����λ��Ϊˮ�ɻ�����");
	   for (int i = 100; i < 1000; i++) {
		  baiWei = i / 100 ;
		  shiWei = (i - baiWei*100)/10;
		  geWei = i%10;
		  if(i == baiWei*baiWei*baiWei + shiWei*shiWei*shiWei+geWei*geWei*geWei){
			  System.out.print(i+"\t");
		  }
	   }
	   
	   System.out.println();
	   //��100���ڵ���������(ָ����1���ϵ���Ȼ�������ܱ�1���䱾�������û���ٳ��ľ�����)
	   System.out.println("������100�������е�������");
	   boolean flag = false;
	   for (int i = 2; i <= 100; i++) {
		  for (int j = 2; j < Math.sqrt(i); j++) {
			 if(i%j == 0){
				 flag = true;
				 break;
			 }
		  }
		  if(!flag){
			 System.out.println(i);
		  }
		  flag =  false;
	   }
	}
}
