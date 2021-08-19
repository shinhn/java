package basic;

import java.util.Scanner;

public class if_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		// <switch> 비교대상이 되는 결과값과 선택사항이 많을 경우 주로 사용
		// 각 case에 break문이 없으면 하위 case가 다 실행됨 
		switch (score) {
		case 100: {
			System.out.println("수");
			break;
		}
		case 90: {
			System.out.println("미");
			break;
		}
		case 80: {
			System.out.println("양");
			break;
		}
		case 70: {
			System.out.println("가");
			break;
		}
		default:
			System.out.println("try again!");
			break;
		}
		
		sc.close();
	}
}
