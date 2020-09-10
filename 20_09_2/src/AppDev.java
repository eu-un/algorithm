import java.util.*;

public class AppDev {
	
	public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 배포되는 일 수
        int[] distribute = new int[progresses.length];
        
        for(int i = 0; i < progresses.length; i++) {
        	
        	// 배포까지 걸리는 일 수
        	distribute[i] = (100 - progresses[i]) / speeds[i];
        	
        	// 만약 나머지가 0이 아니면 기능이 완전히 만들어지지 않은 것이므로
        	// 나머지가 0이 될때까지 날짜(distribute)를 1씩 더해준다
        	if((100 - progresses[i]) % speeds[i] != 0) {
        		distribute[i]++;
        	}
        } // for end
        
        // 배포되는 기능 갯수(최소 1개는 배포됨)
        int output = 1;
        int tmp = 0;
        
        // 같이 배포될 수 있는 기능 찾기
        for(int i = 0; i < distribute.length; i++) {
        	
        	if(i + 1 < distribute.length && distribute[tmp] >= distribute[i + 1]) {
        		output++;
        	} else {
        		tmp = i + 1;
        		list.add(output);
        		output = 1;
        	}
        } // for end
      
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }  
}
