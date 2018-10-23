package algorithm;

/**
 * ��������
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
	//����һ�ֿ�������ĺ���
    public static int getPartition1(int[] array,int lo,int hi){
    	//�����ȽϵĻ�����������ĵ�һ��Ԫ��
    	int key = array[lo];
    	
    	while (lo < hi) {
    		//�Ӻ���ǰɨ�裨�Ӻ���ǰ���θ��������бȽϣ�
			while (array[hi]>=key && hi>lo) {
               hi--;				
			}
			array[lo] = array[hi];
			//��ǰ���ɨ�裨��ǰ������θ��������бȽϣ�
			while (array[lo]<=key && lo<hi) {
               lo++;				
			}
			array[hi] = array[lo];
		}
    	array[hi] = key;//���ѻ����洢
    	return hi;
    }
    public static void quickSort1(int[] array,int lo,int hi) {
    	if(lo >= hi){//ע�⣺����Ƚϲ�����
    		return;
    	}
    	//���е�һ�������ȡ�ָ��
		int index = getPartition1(array, lo, hi);
		//����ǰ�벿��
		quickSort1(array, lo, index-1);
		//�����벿��
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
