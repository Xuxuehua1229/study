package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
class A{
	static{
		System.out.print("1");
	}
	public A(){
		System.out.print("  "+"2");
	}
}
class B extends A{
	static{
		System.out.print("  "+"a");
	}
	public B(){
		System.out.print("  "+"b");
	}
}
public class Test {
	/*class parent{
	    private static  int a=1;
	    private static  int b;
	    private   int c=initc();
	    static {
	        b=1;
	        System.out.println("1.父类静态代码块：赋值b成功");
	        System.out.println("1.父类静态代码块：a的值"+a);
	    }
	    int initc(){
	        System.out.println("3.父类成员变量赋值：---> c的值"+c);
	        this.c=12;
	        System.out.println("3.父类成员变量赋值：---> c的值"+c);
	        return c;
	    }
	    public parent(){
	        System.out.println("4.父类构造方式开始执行---> a:"+a+",b:"+b);
	        System.out.println("4.父类构造方式开始执行---> c:"+c);
	    }
	}

	class son extends parent{
	    private static  int sa=1;
	    private static  int sb;
	    private   int sc=initc2();
	    static {
	        sb=1;
	        System.out.println("2.子类静态代码块：赋值sb成功");
	        System.out.println("2.子类静态代码块：sa的值"+sa);
	    }
	    int initc2(){
	        System.out.println("5.子类成员变量赋值--->：sc的值"+sc);
	        this.sc=12;
	        return sc;
	    }
	    public son(){
	        System.out.println("6.子类构造方式开始执行---> sa:"+sa+",sb:"+sb);
	        System.out.println("6.子类构造方式开始执行---> sc:"+sc);
	    }
	}*/
	public static int binarySearch(int array[],int des) {
		int low = 0;
        
		int hight = array.length-1;
		System.out.println("hight111:"+hight);
		while(low <= hight){
			//int middle = (hight + low)>>>1;
			//System.out.println("middle11111:"+middle1);
			int middle = (hight + low)/2;
			System.out.println("middle111:"+middle);
			System.out.println("middle222:"+array[middle]);
			if(des == array[middle]){
				System.out.println("middle222:"+middle);
				return middle;
			}else if(des < array[middle]){
				System.out.println("middle333:"+middle);
				hight = middle - 1 ; 
				System.out.println("hight222:"+hight);
			}else {
				System.out.println("middle444:"+middle);
				low = middle +1;
				System.out.println("low111:"+low);
			}
			System.out.println("middle5555:"+low+",hight:"+hight);
		}
		System.out.println("middle666:"+low+",hight:"+hight);
		return -1;
	}
	//二分查找 int[] array = {6,12,33,87,90,97,108,561};
	public static int binarySearch1(int array[],int des) {
		int low = 0;
		int hight = array.length-1;
		while (low <= hight) {
			int middle = (low+hight)/2;
			if(des == array[middle]){
				return middle;
			}else if(des < array[middle]){
				hight = middle -1;
			}else {
				low = middle + 1;
			}
		}
		return -1;
	}
	public static int binarySearch2(int[] dataset,int data,int beginIndex,int endIndex){
		int midIndex = (beginIndex + endIndex)/2;
		if(data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex){
			return -1;
		}
		if(data < dataset[midIndex]){
			return binarySearch2(dataset, data, beginIndex, midIndex-1);
		}else if (data > dataset[midIndex]) {
			return binarySearch2(dataset, data, midIndex+1, endIndex);
		}else {
			return midIndex;
		}
	}

	/*快速排序：int[] a={7,10,3,5,4,6,2,8,1,9};  
	QuickSort(a,1,10); */
	public static int Partition(int[] a,int p,int r){ 
		int x = a[r-1];
		System.out.println("第一轮x:"+x);
		int i = p-1;
		System.out.println("第一轮i:"+i);
		int temp;
		for(int j=p;j<=r-1;j++){  
			System.out.println("第一轮j:"+j+",a[j-1]:"+a[j-1]+",x:"+x);
			if(a[j-1]<=x){  
				// 交换(a[j-1],a[i-1]);
				System.out.println("第一轮i:"+j);
				i++;  
				temp=a[j-1];  
				System.out.println("第一轮temp:"+temp);
				a[j-1]=a[i-1];  
				System.out.println("第一轮a[j-1]:"+a[j-1]);
				a[i-1]=temp;  
				System.out.println("第一轮a[i-1]:"+a[i-1]);
			}
		}
		//交换(a[r-1,a[i+1-1]);
		temp=a[r-1];  
		a[r-1]=a[i+1-1];  
		a[i+1-1]=temp;  
		return i+1;  
	}  
	public static void QuickSort(int[] a,int p,int r){  
		if(p<r){  
			int q=Partition(a,p,r);  
			QuickSort(a,p,q-1);  
			QuickSort(a,q+1,r);  
		}  
	}
	public static String reverse(String originStr){
		if(originStr == null || originStr.length() <= 1){
			return originStr;
		}
		return reverse(originStr.substring(1)+originStr.charAt(0));
	}
	public static Integer forloop2(int index){
		//function digui(index){ 
		//index-2=0 index的最小值是3 
		//if (index<0) { //负数为0 我自己写的 return 0; } 
		//if (index<=2) {//第一项 第二项都为1,直接范围内 都返回1 终止条件 这是第二步！！！ return 1; } 
		//return digui(index-1)+digui(index-2);//先看后面的 几项，当前项=前一项+前二项 这是第一步！！！！ } console.log(digui(-1));//0 console.log(digui(7));//13 console.log(digui(8));//21
		if(index<0){
			return 0 ;
		}
		if(index<=2){
			return 1;
		}
		return forloop2(index-1)+forloop2(index-2);
	}
	public static Integer forloop1(int index){
		int firstNum = 1;
		int secondnum = 1;
		int thirdnumResult = 0;
		for (int i = 0; i < index-2; i++) {
			thirdnumResult = firstNum + secondnum;
			firstNum = secondnum;
			secondnum = thirdnumResult;
		}
		return thirdnumResult;
	}
	//快速排序
	public static int getMiddle(int[] list,int low,int high){
		int tmp = list[low];
		while(low<high){
			while (low<high && list[high]>=tmp) {
				high--;
			}
			list[low] = list[high];
			while (low<high && list[low]<=tmp) {
				low++;
			}
			list[high] = list[low];
		}
		list[low] = tmp;
		return low;
	}

	public static void _quickSort(int[] list,int low,int high){
		if(low < high){
			int middle = getMiddle(list, low, high);
			_quickSort(list, low, middle-1);
			_quickSort(list, middle+1, high);
		}
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 4, 5, 7, 4, 5 ,3 ,9 ,0}; 
		_quickSort(a,0,a.length-1);  
		System.out.print("快速排序：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}

		//int[] a={7,10,3,5,4,6,2,8,1,9};  
		//System.out.println(QuickSort(a,1,10)); 
		//斐波那契 数列{1,1,2,3,5,8,13,21,34}
		//System.out.println(forloop2(9));
		//System.out.println(forloop1(9));
		/*int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		for (int i = 0; i < 10; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println(num3);
		}*/


		/*RoomMemberVo memberVo1 = new RoomMemberVo();
		memberVo1.setName("张三");
		memberVo1.setRoomId(Long.valueOf(2));

		RoomMemberVo memberVo2 = new RoomMemberVo();
		memberVo2.setName("李四");
		memberVo2.setRoomId(Long.valueOf(4));

		RoomMemberVo memberVo3 = new RoomMemberVo();
		memberVo3.setName("张三");
		memberVo3.setRoomId(Long.valueOf(2));

		RoomMemberVo memberVo4 = new RoomMemberVo();
		memberVo4.setName("完善的");
		memberVo4.setRoomId(Long.valueOf(5));
		List<RoomMemberVo> list  =   new  ArrayList<RoomMemberVo>(); 
        list.add(memberVo1);
        list.add(memberVo2);
        list.add(memberVo3);
        list.add(memberVo4);

        for (int i = 0; i < list.size(); i++) {
        	System.out.println("111:"+list.get(i).getName());
			for (int j = list.size()-1; j > i; j--) {
				System.out.println("222:"+list.get(j).getName());
				if(list.get(j).getName().equals(list.get(i).getName())){
					list.remove(j);
				}
			}
		}

        System.out.println("去重方法1：");
        for (RoomMemberVo o : list) {
			System.out.println(" "+o.getName());
		}

        Set set1 = new HashSet(list);
        list.clear();
        list.addAll(set1);


        System.out.println("去重方法2：");
        for (RoomMemberVo o : list) {
			System.out.println(" "+o.getName());
		}

        Set set = new HashSet();
        List newList = new ArrayList();
        for(Iterator iter = list.iterator();iter.hasNext();){
        	Object element = iter.next();
        	if(set.add(element)){
        		newList.add(element);
        	}
        }
        list.clear();
        list.addAll(newList);

        System.out.println("去重方法3：");
        for (RoomMemberVo o : list) {
			System.out.println(" "+o.getName());
		}*/
		//现在有100元，要买100只鸡，公鸡5元一只，母鸡3元一只，小鸡1元三只，求公鸡，母鸡，小鸡各几只
		/*int gongji;
		int muji;
		int xiaoji;

		for (gongji = 0; gongji < 20; gongji++) {
			for (muji = 0; muji < 33; muji++) {
				for (xiaoji = 0; xiaoji < 100; xiaoji++) {
					if(gongji*5+muji*3+xiaoji/3 == 100 && gongji + muji + xiaoji ==100 && xiaoji%3==0){
						System.out.println("公鸡是："+gongji+"只，母鸡是"+muji+"只，小鸡是："+xiaoji+"只");
					}
				}
			}
		}

		for (gongji = 0; gongji < 20; gongji++) {
			for (muji = 0; muji < 33; muji++) {
				xiaoji = 100- gongji - muji;
					if(gongji*5+muji*3+xiaoji/3 == 100 && gongji + muji + xiaoji ==100 && xiaoji%3==0){
						System.out.println("公鸡是："+gongji+"只，母鸡是"+muji+"只，小鸡是："+xiaoji+"只");
					}			
			}
		}*/

		/*Calendar cl = Calendar.getInstance();
		System.out.println("Calendar_year:"+cl.get(Calendar.YEAR));
		System.out.println("Calendar_month:"+cl.get(Calendar.MONTH));
		System.out.println("Calendar_date:"+cl.get(Calendar.DATE));
		System.out.println("Calendar_hour:"+cl.get(Calendar.HOUR_OF_DAY));
		System.out.println("Calendar_minute:"+cl.get(Calendar.MINUTE));
		System.out.println("Calendar_secono:"+cl.get(Calendar.SECOND));

		System.out.println("毫秒数1:"+Calendar.getInstance().getTimeInMillis());
		System.out.println("毫秒数2:"+System.currentTimeMillis());*/

		/*String str1="你好！";
		System.out.println("str1:"+str1);
		try {
			String str2 = new String(str1.getBytes("GB2312"),"iso-8859-1");
			System.out.println("str2:"+str2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		//String originStr = "a3";
		//System.out.println(reverse(originStr));
		/*A ab = new B();
		ab = new B();*/
		//Map<String, List<WordsVo>> map = null;
		/*int i = 10;
		System.out.println("i="+i);
		int j = i++;
		System.out.println("i="+i);
		System.out.println("j="+j);
		int a = 10;*/
		//System.out.println("a1:"+a++);
		//System.out.println(++a);
		/*String str = "sddf";
		System.out.println("str:"+str.substring(1,2));*/
		/*int[] a1={7,10,3,56,5,34,6,2,8,34,9};  
		QuickSort(a1,1,11);  
		System.out.println("快速排序：");
		for (int i=0;i<a1.length;i++) {
			if(i>0){
				System.out.print(",");
			}
			System.out.print(a1[i]); 
		}  */
		int[] array = {6,12,33,87,90,97,108,561};
		System.out.println("循环查找："+binarySearch1(array,108));
		//System.out.println("循环查找："+binarySearch1(array,108));
		//System.out.println("递归查找："+binarySearch2(array, 3, 0, array.length-1));
		/*String familyName = "mugoods_gg_familyName_xxh105D1_ss";
       System.out.println("familyName_indexOf:"+familyName.indexOf("_"));
       String familyName1 = familyName.split("_")[3];
       System.out.println("familyName1:"+familyName1);
       System.out.println("familyName2:");*/
		//System.out.println("familyName.substring:"+familyName.substring(familyName.in));

		//System.out.println("------"+familyName.replace(familyName.substring(familyName.lastIndexOf("_")+1), "宅男女神"));
		/*String fn = "宅男女神";
       System.out.println("familyName00:"+familyName.split("_")[3]);
       String familyName1 = familyName.replace(familyName.split("_")[3],fn);
       System.out.println("familyName11:"+familyName);
       //String fn1 = familyName.replace("_","宅男女神");
       System.out.println("familyName22:"+familyName1);

       StringBuffer sBuffer = new StringBuffer(familyName);
       System.out.println("familyName222:"+familyName.lastIndexOf("_"));
       System.out.println("familyName2222:"+familyName.length());
       sBuffer.replace(familyName.lastIndexOf("_")+1,familyName.length(), fn);
       System.out.println("familyName33:"+sBuffer.replace(familyName.lastIndexOf("_")+1,familyName.length(), fn));

       StringBuffer sBuffer1 = new StringBuffer(familyName);
       System.out.println("familyName333:"+familyName.indexOf("_",2));
       System.out.println("familyName3333:"+familyName.length());
       System.out.println("familyName55:"+sBuffer1.replace(familyName.indexOf("_",2),familyName.length(), fn));*/
		//int num = 5;
		// String numStr = String.valueOf(num);
		//System.out.println("numStr:"+numStr.substring(0,1)+"-------"+numStr.substring(1,2)+"----"+numStr.length());

		/*String str = "xxh273_4nlv78efi0sz3bex4anuz9t9t523en的圈";
	   System.out.println("str0000:"+str.length());
	   System.out.println("str1111:"+str.substring(0,str.length()-2));*/
		/*List<String> sortList1 = new ArrayList<String>();
	   List<String> sortList2 = new ArrayList<String>();
	   List<String> sortList3 = new ArrayList<String>();
	   Map<String,Object> map1 = new HashMap<String, Object>();
	   map1.put("username","张三");
	   map1.put("age",18);

	   Map<String,Object> map2 = new HashMap<String, Object>();
	   map2.put("username","李四");
	   map2.put("age",19);

	   Map<String,Object> map3 = new HashMap<String, Object>();
	   map3.put("username","Avhs");
	   map3.put("age",45);

	   Map<String,Object> map4 = new HashMap<String, Object>();
	   map4.put("username","张三");
	   map4.put("age",12);

	   List list = new ArrayList();
	   list.add(map1);
	   list.add(map2);
	   list.add(map3);
	   list.add(map4);

	   List list1 = new ArrayList();

	   Map<String,Object> map5 = null;
	   for (int i = 0; i < list.size(); i++) {
		  // System.out.println("test_map1:"+list.get(i));
		   map5 = (Map<String,Object>)list.get(i);
		   System.out.println("test_map2:"+map5.get("username"));
		   sortList1.add(map5.get("username").toString()+"-"+map5.get("age"));
	   }

	   for (int i = 0; i < sortList1.size(); i++) {
		   System.out.println("test_sortList1:"+sortList1.get(i));
		   String s1 = sortList1.get(i);
			if(s1.substring(0, 1).toCharArray()[0] >= 'A' && s1.substring(0,1).toCharArray()[0] <= 'Z'){
				s1 = s1.substring(0, 1).toLowerCase() + "&" + s1;
			}else if(s1.substring(0, 1).matches("[\\u4e00-\\u9fa5]+")){
				SortVo sVo = new SortVo();
				s1 = sVo.getAlphabet(s1) + "&" + s1;
			}
			sortList2.add(s1);
	   }
	   Collections.sort(sortList2);
	   for (int i = 0; i < sortList2.size(); i++) {
		   System.out.println("test_sortList2:"+sortList2.get(i));
		   String s2 = sortList2.get(i);
			if(s2.split("&").length == 1){
				s2 = s2.split("&")[0];
			}else {
				s2 = s2.split("&")[1];
			} 
			sortList3.add(s2);
	   }

	   for (int i = 0; i < sortList3.size(); i++) {
		   System.out.println("test_sortList3:"+sortList3.get(i));
		   String[] splitMap = sortList3.get(i).split("-");
		   map5 = new HashMap<String, Object>();
		   map5.put("username", splitMap[0]);
		   map5.put("age", splitMap[1]);
		   list1.add(map5);
	   }

	   for (int i = 0; i < list1.size(); i++) {
		   System.out.println("test_sortList3:"+list1.get(i));
	   }*/
		/*float f = (float)3.4;
		short s1 = 1;
		s1 = (short)(s1 + 1);
		s1 += 1;*/
		/*int i1=3;

		if((i1++>5)&(i1++<9)){

			System.out.println(i1);

			System.out.println("恭喜，执行完了条件语句！");

		}

		System.out.println(i1);

		System.out.println("=============&和&&的区别==============");
		int i2=3;
		if((i2++>5)&&(i2++<9)){

			System.out.println(i2);

			System.out.println("恭喜，执行完了条件语句！");

		}    

		System.out.println(i2);*/
		/*String[] str = {"1","2","3"};
	    System.out.println(str.length);
	    String str2 = "sgddgd";
	    System.out.println(str2.length());*/



		//冒泡排序
		/*int array[] = {11,2,5,82,7,0,4,89,72,42,16,34,58,23};
		//System.out.println("array.length:"+array.length);
	    for (int i = 0; i < array.length; i++) {
	    	//System.out.println("i11:"+i);
			for (int j = 0; j < array.length-1-i; j++) {
				//System.out.println("j11:"+j);
				//System.out.println("array[j]:"+array[j]+",array[j+1]:"+array[j+1]);
				if(array[j]>array[j+1]){
					int num = array[j];
					array[j] = array[j+1];
					array[j+1] = num;
				}
				System.out.println("第二轮：");
				if(i==13){
					System.out.println(array[j]);
				}
			}
		}

	    System.out.print("冒泡排序：");
	    for (int i : array) {
			System.out.print(","+i);
		}
	    System.out.print("===冒泡排序：");
	    for (int i : array) {
			if(i>0){
				System.out.print(",");
			}
			System.out.print(i);
		}*/

		//System.out.println(8>>2);
		/*String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Progra" + "ming";
		System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());*/
	}
}

