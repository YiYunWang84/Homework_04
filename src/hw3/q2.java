package hw3;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
	
	
//  question 2  請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，
//    猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：	
//    (提示：Scanner，亂數方法，無窮迴圈)
//    (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
		
		
		Scanner sc = new Scanner(System.in);
		int i = (int)(Math.random() * 10) + 1 ;
		
		System.out.print("請輸入0~9之間的數字: ");
		while(true) {
			
			int data = sc.nextInt();
			
			if(data != i){
				System.out.print ("猜錯囉 " );
			
			} else {
				
				System.out.println ("答對啦！答案就是" + i);
				break;
			}
			System.out.println("============");
			
		}



	}
}
