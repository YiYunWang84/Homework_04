package hw2;


		// question 1 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		public class q_02 {

			public static void main(String[] args) {
				 int sum = 0;
		    	  for (int i=2; i<= 1000; i=i+2) {
		    	  	  sum +=  i; 
		    	  }
		    	  System.out.println("和 = " + sum);
		    	  System.out.println("===============");
//		    	 question 2 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		    	  int  b = 1;
		    	  int  c = 1;
		    	  for ( b = 1;  b <= 10; b++) {
		    		 c *= b;
		    	  }
		    		 System.out.println("1~10的連乘積 = " + c);
		       	  System.out.println("===============");
		       	  
//		     	 question 3  請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		       	  int b1 = 1;
		       	  int c1 = 1;		     
		       	  while (b1 <= 10) {
		       		  c1 *= b1;
					  b1++;		    
		       	  }
		       	System.out.println("1~10的連乘積 = " + c1);
		       	System.out.println("===============");
//		     	 question 4  • 請設計一隻Java程式，輸出結果為以下：
//		       	1 4 9 16 25 36 49 64 81 100
		       	int q4 = 1;
		       	int q5 = 3;
		       	int q6 = q5 * 2;
		       	for (q4=1; q4<=100; q4++) {
		       		q4++;
		       	
		       	}
		       	System.out.println();
//		     	 question 5  阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		       	輸出結果為阿文可以選擇的數字有哪些？總共有幾個？	       	
		       	
		       	
		       	
		       	
//		     	question 6• 請設計一隻Java程式，輸出結果為以下：
//		       	1 2 3 4 5 6 7 8 9 10
//		       	1 2 3 4 5 6 7 8 9
//		       	1 2 3 4 5 6 7 8
//		       	1 2 3 4 5 6 7
//		       	1 2 3 4 5 6 
//		       	1 2 3 4 5
//		       	1 2 3 4 
//		       	1 2 3 
//		       	1 2 
//		       	1
		       	for (int num = 10; num <= 1; num--) {
					for(int j= 10; j <= num; j--) {
					    System.out.print("*");
					}
					System.out.println();
		       	}

		       	
		       	
		       	
		       	
		       	
		       	
		    	System.out.println("===============");
//		     	question 7請設計一隻Java程式，輸出結果為以下：
//		       	A
//		       	BB
//		       	CCC
//		       	DDDD
//		       	EEEEE
//		       	FFFFFF
		    	
				for (int i_1 = 1; i_1 <= 5; i_1++) {
						for(int j_1= 1; j_1 <= i_1; j_1++) {
						    System.out.print("A");
						}
						System.out.println();
				}
		       	
		       	
		       	
		       	
				}
		}