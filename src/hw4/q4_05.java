package hw4;

import java.util.*;
import java.util.Scanner;


public class q4_05 {
//		Question 5  請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，
//					執行後會顯示是該年的第幾天
//					例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//					(提示1：Scanner，陣列)
//					(提示2：需將閏年條件加入)
//					(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
		public static void main(String args[] {
			Scanner sc = new Scanner(System.in);
			int[][] a = new int[12][]; 
			
			 for(int i = 0; i < 12; i++) {
				 if(i != 1 && i < 7 && i % 2 == 0) {   
		                a[i] = new int[31];
				 } else if(i != 1 && i < 7 && i % 2 == 1) {
		                a[i] = new int[30];
		         } else if(i >= 7 && i % 2 == 0) {
		                a[i] = new int[30];
		          } else if(i >= 7 && i % 2 == 1) {
		                a[i] = new int[31];
		          }
		        }      
			 
			
			System.out.println("請輸入日期(年月日，例如20110131)");		
//	。	。Calendar cal = new q4_05(sc);
//			System.out.println(cal.get(Calender.DAY_OF_YEAR));
		}
		public static void main(String args[] {
	}	
}
