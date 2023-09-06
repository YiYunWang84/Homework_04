package hw1;

public class question2 {
	public static void main(String[] args) {
		// question 1 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		
  	  int sum = 0;
  	  for (int i=2; i<= 1000; i=i+2) {
  	  	  sum +=  i; 
  	  }
  	  System.out.println("和 = " + sum);
  	  System.out.println("===============");
//  	 question 2 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
  	  int  b = 0;
  	  for (int a=1; a<=10; a++) {
  		 b *= a;
  	  }
  		 System.out.println("1~10的連成績 = " + sum);
     	  System.out.println("===============");
//   	 question 3  請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
     	  int  b1 = 1;
//     	  while ()
		}
}