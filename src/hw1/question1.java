package hw1;

public class question1 {
	public static void main(String[] args) {
		int num1 = 6, num2 = 12;
		int num3 = num1 + num2;
		int num4 = num1 * num2;
//		System.out.println(num1 + num2);
//		System.out.println(num1 * num2);
		System.out.println("和為" + num3);
		System.out.println("積為" + num4);
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
     	System.out.println("===============");
	
//	   Quention 5
/*	複利的計算公式是
    本利和 = 本金 × (1 + 年利率)^期間
    符號I代表利息，P代表本金，n代表期數，i代表利率，S代表本利和 */
		int p = 1500000;   //本金
		int n = 10;   //期數
		double i = 0.02;   //利率
		double ii = p * i * n ;  //利息
		double money1 = p * (Math.pow(1 + i,n));
     	System.out.printf("本金加上利息為%.2f元",money1);
     	
     	System.out.println("===============");
     	
// 	   Quention 6
     	// 5 + 5為整數相加
     	System.out.println(5+5);  
     	// 第一個5為整數,第二個'5'為字元,Unicode編碼=53 5 + 53 = 58
     	System.out.println(5+'5');
     	// 第一個5為整數,第二個"5"為字串，因此 5會直接串接文字5
     	System.out.println(5+"5");
		
     	
		


	}
}
