package algorithm;

/**
 * 쳲����� ����{1,1,2,3,5,8,13,21,34,55.....}
 * @author BrainLiu
 *
 */
public class FBNQSeries {
	/*
	 ����һ:��i������,����(i-1)������õ���thirdNum��secondNumֵ��ӣ�
	 Ȼ��secondNumֵ��firstNum���ٽ���Ӻ��thirdNumֵ��secondNum��
	 �����Դ����ƣ�ֱ����indexNum-1���ν�����ǰ�᣺int i=1��
	 */
    public static int fbnqSeriesArr1(int indexNum){
    	int firstNum = 1;
    	int secondNum = 1;
    	int thirdNum = 0;
    	if(indexNum == 1 || indexNum == 2){
    		return 1;
    	}else{
    		for (int i = 1; i < indexNum-1; i++) {
				thirdNum = firstNum + secondNum;
    			firstNum = secondNum;
    			secondNum = thirdNum;
    		}
		}
    	return thirdNum;
    } 
    
    /*
     * ������
     */
    public static int fbnqSeriesArr2(int indexNum){
    	 switch(indexNum) {
			case 1:
				return 0;
			case 2:
    	    	return 1;
    	    default:
    	    	return fbnqSeriesArr2(indexNum-1)+fbnqSeriesArr2(indexNum-2);
		}
    } 
    public static int fbnqSeriesArr3(int indexNum){
       int num = 0;
   	   if(indexNum < 0){
   		   return 0;
   	   }
   	   if(indexNum<=2){
		   return 1;
	   }
   	   if(indexNum>2){
   		  num = fbnqSeriesArr3(indexNum-1)+fbnqSeriesArr3(indexNum-2);
   	   }
   	   return num;
    } 
    
	public static void main(String[] args) {
        //����һ:
		System.out.println("����һ:"+fbnqSeriesArr1(0));
		//������:
		//System.out.println("������:"+fbnqSeriesArr1(1));
		//������:
		//System.out.println("������:"+fbnqSeriesArr3(7));
	}

}
