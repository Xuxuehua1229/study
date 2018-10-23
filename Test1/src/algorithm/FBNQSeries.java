package algorithm;

/**
 * 斐波那契 数列{1,1,2,3,5,8,13,21,34,55.....}
 * @author BrainLiu
 *
 */
public class FBNQSeries {
	/*
	 方法一:第i次运算,将第(i-1)次运算得到的thirdNum和secondNum值相加，
	 然后将secondNum值给firstNum，再将相加后的thirdNum值给secondNum，
	 这样以此类推，直到（indexNum-1）次结束（前提：int i=1）
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
     * 方法二
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
        //方法一:
		System.out.println("方法一:"+fbnqSeriesArr1(0));
		//方法二:
		//System.out.println("方法二:"+fbnqSeriesArr1(1));
		//方法三:
		//System.out.println("方法三:"+fbnqSeriesArr3(7));
	}

}
