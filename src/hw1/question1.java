package hw1;

public class question1 {
	public static void main(String[] args) {
		int num1 = 6, num2 = 12;
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println("===============");

//	  Quention 2
		double egg1 = 200, dozen1 = 12;
		double dozen2 = egg1 / dozen1;
		System.out.println((int) dozen2 + "打");
		System.out.println(egg1 % dozen1 + "顆");
		System.out.println("===============");

//    Quention 3    
		int sec1 = 256559;
		int min1 =  60;
		int hour1 = 60;
		int day1  = 24;
        
     	int q3 = (sec1 / ( min1 * hour1 * day1) ) ;
     	int q3_d = sec1 - (  min1 * hour1 * day1 * q3); //256559-2天會用到的秒數=剩餘秒數
     	
     	int q4 = ( q3_d / ( min1 * hour1 ) );
     	int q4_d = q3_d -  ( min1 * hour1 * q4);
     	
     	int q5 = ( q4_d /  min1  );
     	int q6 = q4_d - ( min1 * q5);
     	
     	System.out.println(q3 + "天");
//     	System.out.println(q3_d);
     	System.out.println(q4 + "時");
//     	System.out.println(q4_d);
     	System.out.println(q5 + "分");
     	System.out.println(q6 + "秒");
     	System.out.println("===============");
//      Quention 4 
     	double c = 3.1415;
     	int c1 = 5;
     	double area =  (c1 * c1 * c);
     	double l1 =  ((c1 * 2) * c);
     	
//     	System.out.println(Math.round(aren * 100.0) / 100.0);
//     	System.out.println(area);
     	System.out.println("半徑為5的圓面積為" + area);
     	System.out.println("半徑為5的圓周長為" + l1);
	
//	   Quention 5
/*	複利的計算公式是：S = P(I + i)n。
    符號I代表利息，P代表本金，n代表期數，i代表利率，S代表本利和 */
		


	}
}
