package alphago;

import java.util.ArrayList;
import java.util.HashMap;

/*
	테스트 1 〉	통과 (0.10ms, 52.6MB)
	테스트 2 〉	통과 (0.07ms, 52.8MB)
	테스트 3 〉	통과 (0.08ms, 53MB)
	테스트 4 〉	통과 (0.12ms, 53.3MB)
	테스트 5 〉	통과 (0.08ms, 52.2MB)
	테스트 6 〉	통과 (0.06ms, 55.9MB)
	테스트 7 〉	통과 (0.11ms, 52.5MB)
	테스트 8 〉	통과 (0.08ms, 52.8MB)
	테스트 9 〉	통과 (0.08ms, 52.5MB)
	테스트 10 〉	통과 (0.05ms, 52MB)
	테스트 11 〉	통과 (0.06ms, 51.9MB)
	테스트 12 〉	통과 (0.09ms, 54.3MB)
	테스트 13 〉	통과 (0.10ms, 53.3MB)
	테스트 14 〉	통과 (0.09ms, 52.9MB)
	테스트 15 〉	통과 (0.06ms, 52MB)
	테스트 16 〉	통과 (0.07ms, 52.4MB)
	테스트 17 〉	통과 (0.07ms, 51.7MB)
	테스트 18 〉	통과 (0.08ms, 52.8MB)
	테스트 19 〉	통과 (0.07ms, 53.8MB)
	테스트 20 〉	통과 (0.07ms, 53.6MB)
	테스트 21 〉	통과 (0.07ms, 53.3MB)
	테스트 22 〉	통과 (0.06ms, 52.9MB)
	테스트 23 〉	통과 (0.07ms, 52.2MB)
	테스트 24 〉	통과 (0.08ms, 52.8MB)
	테스트 25 〉	통과 (0.07ms, 53.1MB)
	테스트 26 〉	통과 (0.10ms, 53.4MB)
	테스트 27 〉	통과 (0.05ms, 52.5MB)
	테스트 28 〉	통과 (0.08ms, 53.5MB)
*/

public class Camouflage {
	public int solution(String[][] clothes) {
        int answer = 1;
        int cnt = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < clothes.length; i++) {
        	// 현재 의상의 종류 상관 없이 옷 type이 같으면 + 1
        	// + 1하는 이유 : 아무 것도 안 입은 경우
        	if(hm.get(clothes[i][1]) != null) {
        		cnt = hm.get(clothes[i][1]) + 1;
        	} else {
        		cnt = 1;
        	} // if ~ else end
        	hm.put(clothes[i][1], cnt);
        } // for end
        
        for(String key : hm.keySet()) {
        	list.add(hm.get(key));
        } // for end
        
        for(int i = 0; i < list.size(); i++) {
        	answer *= (list.get(i) + 1); // 모든 경우의 수
        	if(i == list.size() - 1) { answer -= 1; }
        } // for end
        return answer;
    }
}
