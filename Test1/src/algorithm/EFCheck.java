package algorithm;

public class EFCheck {
    public static int binarySearch1(int[] arr,int searchNum){
    	int low = 0;
    	int top = arr.length-1;
    	while (low<=top) {
			int middle = (low+top)/2;
			if(searchNum == arr[middle]){
				return middle;
			}else if(searchNum < arr[middle]){
				top = middle - 1;
			}else {
				low = middle + 1;
			}
		}
    	return -1;
    } 
    
    public static int binarySearch2(int[] arr,int searchNum,int minIndexNum,int maxIndexNum){
    	int middleNum = (minIndexNum+maxIndexNum)/2;
    	System.out.println(middleNum);
    	if(searchNum<arr[minIndexNum] || searchNum > arr[maxIndexNum] || maxIndexNum < minIndexNum){
    		return -1;
    	}
    	if(searchNum == arr[middleNum]){
    		return middleNum;
    	}else if(searchNum < arr[middleNum]){
    		return binarySearch2(arr, searchNum, minIndexNum, middleNum-1);
    	}else {
			return binarySearch2(arr, searchNum, middleNum+1, maxIndexNum);
		}
    }
	public static void main(String[] args) {
		int[] arr = {5,6,10,30,60,68,80,88,89,99,109};
		//System.out.println(arr.length);
        //System.out.println(binarySearch1(arr,109));
		System.out.println(binarySearch2(arr,89,0,arr.length-1));
	}

}
