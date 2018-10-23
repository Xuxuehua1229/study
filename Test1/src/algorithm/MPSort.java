package algorithm;
/**
 * ð������
 * @author BrainLiu
 *
 */
public class MPSort {
    public static void add(String str,int num) {
    	System.out.println(str+"==="+num);
		str += num;
	}
    //���ַ������з�ת������һ��
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
    
    //jdk�Դ��ķ�������������
    public static String reverse2(String str1){
    	return new StringBuilder(str1).reverse().toString();
    	//return new StringBuffer(str1).reverse().toString();
    }
    
	public static void main(String[] args) {
		//++,--�����ǰ�棬������������ʹ�ã��ں��������ʹ��������
		int j1 = 0;
		for (int i = 1; i < 100; i++) {
			j1 = j1++;
		}
		System.out.println(j1);//�����0
		
		int i = 5;
		String str = new String("abc");
		add(str, i++);
		add(str, i--);
		add(str, i+1);
		add(str, i+1);
		System.out.println(str);//�����abc
		System.out.println("reverse1:"+reverse1("abcde"));
		System.out.println("reverse2:"+reverse2("abcde"));
		
		System.out.println("<------ð�����򣺱Ƚ��������ڵ�Ԫ�أ���ֵ��Ľ������ұ�----->");
		//����һ N������Ҫ������ɣ��ܹ�����N-1������ÿi�˵��������Ϊ(N-i)��
		int[] array1 = {6,4,7,2,9,7,10,45,1,78,0};
		for(int j = 0 ; j < array1.length-1 ; j++){//���ѭ��������������� array1.length-1
			for (int j2 = 0; j2 < array1.length-1-j; j2++) {//�ڲ�ѭ������ÿ������Ĵ��� array1.length-1-j
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
		
		//������
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
        System.out.print("������:");
		for (int j : array2) {
			System.out.print(j+",");
		}
		
		//������
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
		System.out.print("������:");
		for (int j : array3) {
			System.out.print(j+",");
		}
	}
}
