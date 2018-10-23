package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//list.add(1,56);
		for (Integer integer : list) {
			System.out.print(integer+"\t");
		}
		List list2 = Arrays.asList(new Object[list.size()]);
		Collections.copy(list2, list);
		System.out.println(list2);
	}
}
