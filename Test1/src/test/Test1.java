package test;
class Test1 {
	//{1,1,2,3,5,8,13,21,34}
    public static int fBNQSort1(int indexNum){
    	int firstNum = 1;
    	int secondNum = 1;
    	int thirtNum = 0;
    	if(indexNum == 0){
    		return 0;
    	}else if(indexNum <= 2){
    		return 1;
    	}else {
			for (int i = 0; i < indexNum-2; i++) {
				thirtNum = firstNum + secondNum;
				firstNum = secondNum;
				secondNum = thirtNum;
			}
		}
    	return thirtNum;
    }
    public static int fBNQSort2(int indexNum){
    	if(indexNum == 0){
    		return 0;
    	}else if (indexNum < 2) {
			return 1;
		}else {
			return fBNQSort1(indexNum-1)+fBNQSort1(indexNum-2);
		}
    }
    public static void mPSort(int[] arr){
    	for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]){
					int num = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = num;
				}
			}
		}
    	
    }
    public static void main(String[] args) {
    	//System.out.println(fBNQSort1(9));
    	//System.out.println(fBNQSort2(9));
    	int[] arr = {3,2,6,1,7,9,0,4,8,30,12,50,5,10};
    	mPSort(arr);
    	for (int i = 0; i < arr.length; i++) {
		   //System.out.print(arr[i] + ",");	
		}
    	for(int i = 1 ; i <= 9;i++){
    		for(int j = 1;j <= i;j++){
    			//System.out.print(j + "*" + i + "=" + (i*j)+"\t");
    		}
    		//System.out.println();
    	}
    	
    	
    	System.out.println();
    	int[] arrays = new int[]{2,1,5,7,5,8,9,10,6};
    	/*for (int i = 0; i < arrays.length/2; i++) {
			int temp = arrays[i];
			arrays[i]=arrays[arrays.length-1-i];
			arrays[arrays.length-1-i] = temp;
		}
    	System.out.println();
    	System.out.println("第一种方法：");
    	for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i]+ "\t");
		}*/
    	
    	for (int i = 0,j = arrays.length - 1; i < j; i++,j--) {
			int temp = arrays[i];
			arrays[i] = arrays[j];
			arrays[j] = temp;
		}
    	
    	System.out.println();
    	System.out.println("第二种方法：");
    	for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i]+ "\t");
		}
    	
    }
    
    public void getNum(String...n1){
    	System.out.println(n1);
    	for (int i = 0; i < n1.length; i++) {
    		System.out.println(n1[i]);
		}
    }
}
