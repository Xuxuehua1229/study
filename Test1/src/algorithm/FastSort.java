package algorithm;

/**
 * 快速排序
 * @author BrainLiu
 *
 */
public class FastSort {
	/*{9,3,2,8,10,89,1,39,0,5,99,30}
	{5,3,2,8,10,89,1,39,0,9,99,30}
	{5,3,2,8,9,89,1,39,0,10,99,30}
	{5,3,2,8,0,89,1,39,9,10,99,30}
	{5,3,2,8,0,9,1,39,89,10,99,30}
	{5,3,2,8,0,1,9,39,89,10,99,30}
	
	{1,3,2,8,0,5,9,39,89,10,99,30}
	{1,3,2,5,0,8,9,39,89,10,99,30}
	{1,3,2,0,5,8,9,39,89,10,99,30}
	
	{0,3,2,1,5,8,9,39,89,10,99,30}
	{0,1,2,3,5,8,9,39,89,10,99,30}
	*/
	//进行一轮快速排序的函数
    public static int getPartition1(int[] array,int lo,int hi){
    	//用来比较的基数及是数组的第一个元素
    	int key = array[lo];
    	
    	while (lo < hi) {
    		//从后向前扫描（从后向前依次跟基数进行比较）
			while (array[hi]>=key && hi>lo) {
               hi--;				
			}
			array[lo] = array[hi];
			//从前向后扫描（从前向后依次跟基数进行比较）
			while (array[lo]<=key && lo<hi) {
               lo++;				
			}
			array[hi] = array[lo];
		}
    	array[hi] = key;//最后把基数存储
    	return hi;
    }
    public static void quickSort1(int[] array,int lo,int hi) {
    	if(lo >= hi){//注意：这个比较不可少
    		return;
    	}
    	//进行第一轮排序获取分割点
		int index = getPartition1(array, lo, hi);
		//排序前半部分
		quickSort1(array, lo, index-1);
		//排序后半部分
		quickSort1(array, index+1, hi);
	}
	
	public static void main(String[] args) {
		int[] array = {9,3,2,8,10,89,1,39,0,5,99,30};
		quickSort1(array, 0, array.length-1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
