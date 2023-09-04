package NewTest;

public class Student {
    int score = 90;
    
//    每休息一個小時，
    public void play(int hours) {
    	 score -= hours; // score = score - hours; 每休息一小時，分數減一分
    	 
    }
    public void study(int hours) {
    	 score += hours; // score = score + hours; 每讀書一小時，分數加一分
    }
    
 // 創建兩個student物件，並藉由呼叫play()與study()模擬兩位學生行為
 // 最後顯示分數觀察是否正確
    
    public static void main(String[] args) {
    	Student mary = new Student();
		Student james = new Student();
    	
    	System.out.println(mary.score);
    	System.out.println(james.score);
    	
    	mary.play(5);     //玩樂5  hour 
    	mary.study(12);   //讀書12 hour
    	
    	james.play(8);
    	james.study(3);
    	
    	System.out.println("=====");
    	
    	System.out.println(mary.score);
		System.out.println(james.score);
    }
}
