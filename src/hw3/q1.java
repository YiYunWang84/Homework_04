package hw3;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
//  question 1  請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，
//		        如圖示結果：
//	            (提示：Scanner，三角形成立條件，判斷式if else)
//	            (進階功能：加入直角三角形的判斷) 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a+b+c);
		
		if(a == b && a == c && b == c) {
			//正三角形:三邊都等長且三個角都相等的三角形。
			System.out.println("正三角形");
		}else if (a == b || a == c || c == b) {
			//等腰三角形：兩邊等長或三邊都等長的三角形。
			System.out.println("等腰三角形");
		}else if (a + b < c || a + c < b  || b + c < a) {
			// 不管是哪種三角形（直角、鈍角、銳角等）的兩條邊長相加必定大於第三邊，若是小於第三邊則無法組成一個三角形。
			System.out.println("不是三角形");		
		}
		
		System.out.println("其他三角形");
	
		

	}
}
