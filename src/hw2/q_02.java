package hw2;

public class q_02 {

	public static void main(String[] args) {
//        question 1  請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

		int sum = 0;
		for (int i = 2; i <= 1000; i = i + 2) {
			sum += i;
		}
		System.out.println("和 = " + sum);
		System.out.println("===============");

//        question 2  請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int b = 0;
		for (int a = 1; a <= 10; a++) {
			b *= a;
		}
		System.out.println("1~10的連成績 = " + sum);
		System.out.println("===============");

//        question 3  請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int b1 = 1;
		int c1 = 1;
		while (b1 <= 10) {
			c1 *= b1;
			b1++;
		}
		System.out.println("1~10的連乘積 = " + c1);
		System.out.println("===============");
//        question 4  請設計一隻Java程式，輸出結果為以下：
//			      	  1 4 9 16 25 36 49 64 81 100      
		// 間隔為 3 5 7 9 11 13 15 17 19

//		for (int e1 = 1; e1 <= 100; e1++) {
//			if ( e1 + s )
//				System.out.print(e1 + " ");
//		}
		System.out.println("===============");
//		System.out.println();
		
		
//        question 5  阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//			      	  輸出結果為阿文可以選擇的數字有哪些？總共有幾個？	       	
		
		for (int i = 1; i <= 49; i++ ) {
			if(a == 4) {
				
			}
			else 
		}
		
		
		
		
//        question 6  請設計一隻Java程式，輸出結果為以下：
//			      	  1 2 3 4 5 6 7 8 9 10
//			      	  1 2 3 4 5 6 7 8 9
//			      	  1 2 3 4 5 6 7 8
//			      	  1 2 3 4 5 6 7
//			      	  1 2 3 4 5 6 
//			      	  1 2 3 4 5
//			      	  1 2 3 4 
//			      	  1 2 3 
//			      	  1 2 
//			      	  1
		for (int f6=10 ; f6 >= 1;  f6--) {
			for(int g1 = 1; g1 <= f6;  g1++) {
			System.out.print(g1+"\t");
		    }
			System.out.print("\n");  //分行
			
	    }
		
		
		System.out.println("===============");
//        question 7  請設計一隻Java程式，輸出結果為以下：
//			      	  A
//			      	  BB
//			      	  CCC
//			      	  DDDD
//			      	  EEEEE
//			      	  FFFFFF
//		char[] charArr = {'A', 'B', 'C', 'D', 'E', 'F'};
//		for(int i=0; i<6; i++) {
//			
//			char nowChar = charArr[i];
//			
//			for (int j=0; j <= i; j++) {
//				System.out.print(nowChar);
//			}
//			
//			if(i!=5) {
//				System.out.println();
		
		char[] ne1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		for(int i=0; i<=5; i++) {
		    char ne2 = ne1[i];
		    
		    for (int j=0; j<=i; j++) {
		    	System.out.print(ne2);
		    }
		    System.out.println();
		}
//		System.out.println();
//		String test = String.format("%05d", 0).replace('0', 'A');
//		System.out.print(test);
	    }
	}
