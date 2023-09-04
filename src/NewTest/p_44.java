package NewTest;

public class p_44{
    	
    public static void main(String[] args) {
        for (int i = 0 ; i <= 100; i++) {
            if(i % 4 == 0)
                 System.out.print(i+ " ");
      	    }
           
        	System.out.println();   // 換行方式
        	System.out.print("\n"); // 換行方式
        	
        for (int i = 0; i <= 100;i += 4) {
            	System.out.print(i+ " ");
            }
    }
}
