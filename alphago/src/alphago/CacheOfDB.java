package alphago;

import java.util.LinkedList;

/*
	테스트 1 〉	통과 (0.17ms, 52.9MB)
	테스트 2 〉	통과 (0.19ms, 52.8MB)
	테스트 3 〉	통과 (0.17ms, 52.7MB)
	테스트 4 〉	통과 (0.17ms, 54.1MB)
	테스트 5 〉	통과 (0.15ms, 51.9MB)
	테스트 6 〉	통과 (0.09ms, 52MB)
	테스트 7 〉	통과 (0.10ms, 52MB)
	테스트 8 〉	통과 (0.18ms, 52.9MB)
	테스트 9 〉	통과 (0.19ms, 52.3MB)
	테스트 10 〉	통과 (0.43ms, 52.4MB)
	테스트 11 〉	통과 (76.02ms, 82.6MB)
	테스트 12 〉	통과 (0.39ms, 53.8MB)
	테스트 13 〉	통과 (0.73ms, 52.9MB)
	테스트 14 〉	통과 (1.05ms, 53MB)
	테스트 15 〉	통과 (1.36ms, 52.6MB)
	테스트 16 〉	통과 (1.65ms, 53.3MB)
	테스트 17 〉	통과 (0.12ms, 52.6MB)
	테스트 18 〉	통과 (3.28ms, 52.3MB)
	테스트 19 〉	통과 (4.23ms, 52.9MB)
	테스트 20 〉	통과 (4.74ms, 54.3MB)
*/

public class CacheOfDB {
	static final int CACHE_HIT = 1;
	static final int CACHE_MISS = 5;
	
	public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        
        // cacheSize가 0이면 저장 공간이 없는 것이므로 다 + 5 해주어야 함
        if(cacheSize == 0) { return (cities.length * 5); }
        
        for(String city : cities) {
        	city = city.toLowerCase(); // 다 소문자로 변경
        	
        	// cache hit일 때 + 1
        	if(cache.contains(city)) {
        		cache.remove(city); // 먼저 있던 것 지우기
        		cache.add(city); // 다시 추가
        		answer += CACHE_HIT;
        	} else { // cache miss일 때 + 5
        		cache.add(city);
        		if(cache.size() > cacheSize) { // 캐시 개수가 cacheSize보다 커지면
        			cache.poll(); // 가장 먼저 보관한 값 꺼내기
        		} // if end
        		answer += CACHE_MISS;
        	} // if ~ else end
        } // for end
        return answer;
    }
}
