package java_grammar;

import java.util.Arrays;
import java.util.Scanner;


public class array {
	public static void main(String[] args) {
		/*
		// <배열 선언 및 초기화> 
		int[] arr = new int[5]; // 배열 선언 
		arr[0] = 1; // 초기화 
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		int[] arr2 = {10,20,30,40,50}; // 배열 선언 및 초기화 
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		System.out.println();
		*/
		
		
		/*
		// <정수 입력> 
		// 입력을 받기 위한 Scanner 선언 
		Scanner sc = new Scanner(System.in);
		// 배열 선언 
		int[] arr3 = new int[5];
		// 정수 입력 
		arr3[0] = sc.nextInt();
		// 출력 
		System.out.println(arr3[0]);
		System.out.println();
		
		
		// 문자 입력 (Scanner에는 문자를 입력 받는 기능이 없으므로 문자열로 입력 받은 다음 문자 꺼내오면 됨)
		// 방법1 
		String s;
		s = sc.next();
		char c = s.charAt(0);
		System.out.println(c);
		
		// 방법2
		char c2 = sc.next().charAt(0);
		System.out.println(c2);
		*/
		
		
		// <배열 기본속성> 
		int[] array1 = {10,20,30,40,50,60};
		int[] array2 = null;
		int[] array3 = null;
		
		// 길이 
		System.out.println("길이 : " + array1.length);
		
		// 요소 출력 
		System.out.println("요소 출력 : " + Arrays.toString(array1));
		
		// 요소 복사 
		array3 = Arrays.copyOf(array1, array1.length);
		System.out.println("요소 복사후 출력 : " + Arrays.toString(array3));
		
		// 레퍼런스 
		array2 = array1;
		System.out.println("array1 : " + array1);
		System.out.println("array2 : " + array2); // array2에 array1 레퍼런스 했기 때문에 레퍼런스 값(주소) 값 자체가 같음 
		System.out.println("array3 : " + array3); // array3에 array1 요소만 복사 했기 때문에 레퍼런스 값(주소) 자체는 다름 
		
	}
}
