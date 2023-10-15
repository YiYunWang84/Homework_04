package hw3;

import java.util.Scanner;

public class q3 {

	
	public static void main(String[] args) {
	
	//question 3  阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
//  但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)
//  ，畫面會顯示他可以選擇的號碼與總數，如圖：

		Scanner sc = new Scanner(System.in);
		int i = (int)(Math.random() * 49) + 1 ;
		System.out.print("請輸入0~9之間不喜歡的數字: ");
		
		int data = sc.nextInt();
		while(true) {
			if (data > 9 ) {
			System.out.print("請輸入0~9之間不喜歡的數字: ");
			}
			
		}
		
		
		
		
	}
	
}
