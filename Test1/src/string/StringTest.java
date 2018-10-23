package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {
	public static void main(String[] args) {
		String str = "  aabbdfggs     ";
		String strTrim = trimStr(str);
		System.out.println("strTrim="+strTrim);
		String str1 = "aabbdfggs";
		String reverseStr1 = reverseStr1(str1, 3, 6);
		System.out.println("reverseStr="+reverseStr1);
		String reverseStr2 = reverseStr2(str1, 2, 8);
		System.out.println("reverseStr2="+reverseStr2);
		System.out.println("===============第三题======================");
		String str2 = "abkkcadkabkebfkabkskab";
		String str3 = "abk";
		System.out.println("strCount:"+strCount(str3,str2));
		System.out.println("================第四题=====================");
		List<String> strList= getMaxSubString("abcwerthelloyuiodef","abcwecvhellobnm");
		for (String str4 : strList) {
			System.out.println("str4="+str4);
		}
		System.out.println("================第五题======================");
		String str5 = "decfabnz";
		System.out.println("str5="+sort(str5));
		System.out.println("=================第六题======================");
		System.out.println("getReverseStr:"+getReverseStr("I am student"));;
	
	}
	//1.模拟一个trim()方法，去除字符串两端的空格
	public static String trimStr(String str){
		int start = 0;
		int end = str.length()- 1;
		while ((start <= end) && (str.charAt(start)) == ' ') {
			start ++;
		}

		while ((start <= end) && (str.charAt(end) == ' ')) {
			end --;
		}
		return str.substring(start,end+1);
	}
	//2.将一个字符串反转。将字符串指定的部分反转。比如：“abcdefg”反转为“abfedcg”
	//方式一：
	public static String reverseStr1(String str,int start,int end){
		char[] array = str.toCharArray();
		for (int i = start,j=end; i<j; i++,j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = (char)temp;
		}
		return new String(array);
	}
	//方式二：
	public static String reverseStr2(String str,int start,int end){
		start = start - 1;
		end = end - 1;
		String str1 = str.substring(0,start);
		System.out.println("str1:"+str1);
		for (int i = end; i >= start; i--) {
			char c = str.charAt(i);
			str1 += c;
		}
		str1 += str.substring(end+1);
		return str1;
	}

	//3.获取一个字符串在另一个字符串中出现的次数 比如：获取“ab”在“abkkcadkabkebfkabkskab”
	public static int strCount(String str1,String str2){
		int count = 0 ;
		int len;
		if(str1.length() < str2.length()){
			while((len = str2.indexOf(str1)) != -1){
				count++;
				str2 = str2.substring(len+str1.length());
			}
		}
		if(str1.length() > str2.length()){
			while ((len = str1.indexOf(str2))!=-1) {
				count++;
				str1 = str1.substring(len+str2.length());
			}
		}
		return count;
	}
	//4.获取两个字符串中最大相同字串 比如：str1="abcwerthelloyuiodef"; str2="cvhellobnm"
    public static List<String> getMaxSubString(String str1,String str2){
    	String maxStr = (str1.length()>str2.length())?str1:str2;
    	String minStr = (str1.length()<str2.length())?str1:str2;
    	List<String> strList = new ArrayList<String>();
    	int len = minStr.length();
    	for (int i = 0; i < len; i++) {
    		System.out.println("i="+i);
			for (int x = 0,y=len-i; y <= len; x++,y++) {
				String str = minStr.substring(x, y);
				System.out.println("getMaxSubString_str:"+str+",x:"+x+",y:"+y);
				if(maxStr.contains(str)){
					strList.add(str);
				}
			}
			if(strList.size()>0){
				return strList;
			}
		}
    	return null;
    }
    
	//5.对字符串中字符进行自然顺序排序
    public static String sort(String str){
    	char[] str1 = str.toCharArray();
    	Arrays.sort(str1);
    	return new String(str1);
    }
	//6.I am student 转换成 student am I
    public static String getReverseStr(String str){
    	String[] str1 = str.split(" ");
    	String str2 = "";
    	for (int i = str1.length-1; i >= 0;i--) {
    		System.out.println(str1[i]);
    		str2 += str1[i] + " ";
		}
    	return new String(str2);
    }
}
