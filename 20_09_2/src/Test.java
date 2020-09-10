import java.util.*;

public class Test {
	
	

	public static void main(String[] args) {
		
			int[] progresses = {93, 30, 55};
			int[] speeds = {1, 30, 5};
			
			
			// 배포되는 일 수
	        int[] distribute = new int[progresses.length];
	        
	        for(int i = 0; i < progresses.length; i++) {
	        	
	        	// 배포까지 걸리는 일 수
	        	distribute[i] = (100 - progresses[i]) / speeds[i];
	        	System.out.println("위에 distribute[" + i + "] :" + distribute[i]);
	        	System.out.println("위에 progresses[" + i + "] :" + progresses[i]);
	        	System.out.println("위에 speeds[" + i + "] :" + speeds[i]);
	        	
	        	
	        	// 만약 나머지가 0이 아니면 기능이 완전히 만들어지지 않은 것이므로
	        	// 나머지가 0이 될때까지 날짜(distribute)를 1씩 더해준다
	        	if((100 - progresses[i]) % speeds[i] != 0) {
	        		distribute[i]++;
	        		System.out.println("ㅇ아ㅇ아아ㅏㅏ래 distribute[" + i + "] :" + distribute[i]);
		        	System.out.println("ㅇ아ㅇ아아ㅏㅏ래 progresses[" + i + "] :" + progresses[i]);
		        	System.out.println("ㅇ아ㅇ아아ㅏㅏ래 speeds[" + i + "] :" + speeds[i]);
	        	}
	        } // for end
	        
	      
			
	       
		

	}

}
