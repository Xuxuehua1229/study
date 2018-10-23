package algorithm;
/**
 * 冒泡排序
 * @author BrainLiu
 *
 */
public class MPSort {
    public static void add(String str,int num) {
    	System.out.println(str+"==="+num);
		str += num;
	}
    //将字符串进行反转（方法一）
    public static String reverse1(String str1){
    	System.out.println("reverse_str:"+str1);
    	char[] array = str1.toCharArray();
    	System.out.println(array);
    	String str2 = "";
    	for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
			str2 += array[i];
		}
    	return str2;
    }
    
    //jdk自带的方法（方法二）
    public static String reverse2(String str1){
    	return new StringBuilder(str1).reverse().toString();
    	//return new StringBuffer(str1).reverse().toString();
    }
    
	public static void main(String[] args) {
		//++,--如果在前面，就是先自增再使用，在后面就是先使用再自增
		int j1 = 0;
		for (int i = 1; i < 100; i++) {
			j1 = j1++;
		}
		System.out.println(j1);//结果：0
		
		int i = 5;
		String str = new String("abc");
		add(str, i++);
		add(str, i--);
		add(str, i+1);
		add(str, i+1);
		System.out.println(str);//结果：abc
		System.out.println("reverse1:"+reverse1("abcde"));
		System.out.println("reverse2:"+reverse2("abcde"));
		
		System.out.println("<------冒泡排序：比较两个相邻的元素，将值大的交换到右边----->");
		//方法一 N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次
		int[] array1 = {6,4,7,2,9,7,10,45,1,78,0};
		for(int j = 0 ; j < array1.length-1 ; j++){//外层循环控制排序的趟数 array1.length-1
			for (int j2 = 0; j2 < array1.length-1-j; j2++) {//内层循环控制每趟排序的次数 array1.length-1-j
				if(array1[j2] > array1[j2+1]){
					int num = array1[j2];
					array1[j2] = array1[j2+1];
					array1[j2+1] = num;
				}
			}
		}
		for (int j = 1; j < array1.length; j++) {
			System.out.println(array1[j]);
		}
		
		//方法二
		int[] array2 = {6,4,7,2,9,7,10,45,1,78,0};
		boolean flag = true;
		int k = array2.length;
		while (flag) {
			flag = false;
			for (int j = 1; j < k; j++) {
				if(array2[j-1]>array2[j]){
					int temp = array2[j-1];
					array2[j-1] = array2[j];
					array2[j] = temp;
					flag = true;
				}
			}
			k--;
		}
        System.out.print("方法二:");
		for (int j : array2) {
			System.out.print(j+",");
		}
		
		//方法三
		int[] array3 = {6,4,7,2,9,7,10,45,1,78,0};
		int aLength = array3.length;
		int k1;
		while (aLength > 0) {
			k1 = aLength;
			aLength = 0;
			for (int j = 1; j < k1; j++) {
				if(array3[j-1]>array3[j]){
					int temp = array3[j-1];
					array3[j-1] = array3[j];
					array3[j] = temp;
					aLength = j;
				}
			}
		}
		System.out.print("方法三:");
		for (int j : array3) {
			System.out.print(j+",");
		}
	}
}
