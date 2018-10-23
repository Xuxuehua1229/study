package algorithm;

public class Test {

	public static void main(String[] args) {
       //求水仙花数（一个三位数，其各个位上数字立方和等于其本身）
	   int baiWei = 0;
	   int shiWei = 0;
	   int geWei = 0;
	   System.out.println("该三位数为水仙花数：");
	   for (int i = 100; i < 1000; i++) {
		  baiWei = i / 100 ;
		  shiWei = (i - baiWei*100)/10;
		  geWei = i%10;
		  if(i == baiWei*baiWei*baiWei + shiWei*shiWei*shiWei+geWei*geWei*geWei){
			  System.out.print(i+"\t");
		  }
	   }
	   
	   System.out.println();
	   //求100以内的所有质数(指大于1以上的自然数除了能被1和其本身除尽外没有再除的尽的数)
	   System.out.println("该数是100以内所有的质数：");
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
