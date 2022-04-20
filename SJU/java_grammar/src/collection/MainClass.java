package collection;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		
		// ArrayList 생성  
		ArrayList<String> list = new ArrayList<String>();
		
		// 데이터 추가
		list.add("hello");
		list.add("java");
		System.out.println(list);
		
		list.add(2, "programming");
		System.out.println(list);
		
		// 변경 
		list.set(1, "java2");
		System.out.println(list);
		
		// 추출 
		String str = list.get(1);
		System.out.println(str);
		
		// 삭제 
		list.remove(0);
		System.out.println(list);
		
		// 전체삭제 
		list.clear();
		System.out.println(list);
		
		// 존재 유무 
		boolean b = list.isEmpty();
		System.out.println(b);
	}
}
