package hw10;

import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class q2_homework {
// 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
//	(1)千分位
//	(2)百分比
//	(3)科學記號
//	而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入數字:");
		int data = sc.nextInt();
		data = "^[0-9]*$";
		
		
		if(false){
			System.out.print ("數字格式不正確，請再輸入一次" );
		
		} else {
			System.out.print ("欲格式化成(1)千分位(2)百分比(3)科學記號");
		}
			Scanner num = new Scanner(System.in);
		if{
				
			}
		}
	}
	
	
}
