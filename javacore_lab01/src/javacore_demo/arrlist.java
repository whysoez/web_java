package javacore_demo;

import java.util.ArrayList;
import java.util.List;

public class arrlist {
	public static void main(String[] args) {
		List<Integer> mangDS = new ArrayList<>();
		mangDS.add(5);
		mangDS.add(6);
		mangDS.add(7);
		mangDS.add(3,15);
		mangDS.set(3, 22);
		mangDS.remove(2);
		mangDS.clear();
		for(int i : mangDS) {
			System.out.print("\t"+i);
		}
//		int i = mangDS.get(0);
//		
//		System.out.println(i);
	}
}
