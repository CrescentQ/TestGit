package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<Integer> listTestIntegers = new ArrayList<Integer>();
		
		listTestIntegers.add(1);
		listTestIntegers.add(5);
		listTestIntegers.add(6);
		listTestIntegers.add(2);
		listTestIntegers.add(4);
		listTestIntegers.add(3);
		
		Collections.sort(listTestIntegers);
		
		for(Integer i: listTestIntegers) {
			System.out.println(i);
		}				
		
		ObjectCompare obj1 = new ObjectCompare(12,"Viet");
		ObjectCompare obj2 = new ObjectCompare(2,"Nam");
		ObjectCompare obj3 = new ObjectCompare(5,"LongName");
		ObjectCompare obj4 = new ObjectCompare(59,"LongName");
		
		List<ObjectCompare> list = new ArrayList<ObjectCompare>();
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		Collections.sort(list);
		
		for(ObjectCompare o: list) {
			System.out.println(o.getId() + " " + o.getName());
		}
		
		list.sort(new Comparator<ObjectCompare>() {

			@Override
			public int compare(ObjectCompare o1, ObjectCompare o2) {
				if(o1.getId() > o2.getId()) {
				return 1;
			} else if (o1.getId() < o2.getId()) {
				return -1;
			} else 
				return 0;
			}
			
		});
		for(ObjectCompare o: list) {
			System.out.println(o.getId() + " " + o.getName());
		}
					
		
	}

}
