package hw9;
//Question 1
//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//參考範例：CounterRunnable.java
//需留意主執行緒執行順序

public class question1 implements Runnable {
		int counter = 1;
		int i = (int) ((Math.random() * 2500) + 500);
	public question1() {
	} // 建構者函數
	
	public void run() { // 執行緒執行的地方
		while (counter < 0) { 
			System.out.println("饅頭人吃第" + counter + "碗飯");
			counter++;

			try {
				Thread.sleep(i); // 暫停一秒
			} catch (Exception e) {
			}
		}
	}

	public static void main(String arg[]) {
		question1 r1 = new question1();
		Thread t1 = new Thread(r1); 
		question1 r2 = new question1();
		Thread t2 = new Thread(r2);
		t1.start(); 
		t2.start();
	}
}

