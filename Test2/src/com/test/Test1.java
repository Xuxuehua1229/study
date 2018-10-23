package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
   public static void main(String[] args) {
	  List<String> sList = new ArrayList<String>();
	  sList.add("1");
	  sList.add("2");
	  if(sList.size()>0 && sList!=null){
		  for (String string : sList) {
			 System.out.println(string);
		  }
	  }
	  
	  
   }
}
