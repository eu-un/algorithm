package alphago;

import java.util.LinkedList;

/*
	�׽�Ʈ 1 ��	��� (0.17ms, 52.9MB)
	�׽�Ʈ 2 ��	��� (0.19ms, 52.8MB)
	�׽�Ʈ 3 ��	��� (0.17ms, 52.7MB)
	�׽�Ʈ 4 ��	��� (0.17ms, 54.1MB)
	�׽�Ʈ 5 ��	��� (0.15ms, 51.9MB)
	�׽�Ʈ 6 ��	��� (0.09ms, 52MB)
	�׽�Ʈ 7 ��	��� (0.10ms, 52MB)
	�׽�Ʈ 8 ��	��� (0.18ms, 52.9MB)
	�׽�Ʈ 9 ��	��� (0.19ms, 52.3MB)
	�׽�Ʈ 10 ��	��� (0.43ms, 52.4MB)
	�׽�Ʈ 11 ��	��� (76.02ms, 82.6MB)
	�׽�Ʈ 12 ��	��� (0.39ms, 53.8MB)
	�׽�Ʈ 13 ��	��� (0.73ms, 52.9MB)
	�׽�Ʈ 14 ��	��� (1.05ms, 53MB)
	�׽�Ʈ 15 ��	��� (1.36ms, 52.6MB)
	�׽�Ʈ 16 ��	��� (1.65ms, 53.3MB)
	�׽�Ʈ 17 ��	��� (0.12ms, 52.6MB)
	�׽�Ʈ 18 ��	��� (3.28ms, 52.3MB)
	�׽�Ʈ 19 ��	��� (4.23ms, 52.9MB)
	�׽�Ʈ 20 ��	��� (4.74ms, 54.3MB)
*/

public class CacheOfDB {
	static final int CACHE_HIT = 1;
	static final int CACHE_MISS = 5;
	
	public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        
        // cacheSize�� 0�̸� ���� ������ ���� ���̹Ƿ� �� + 5 ���־�� ��
        if(cacheSize == 0) { return (cities.length * 5); }
        
        for(String city : cities) {
        	city = city.toLowerCase(); // �� �ҹ��ڷ� ����
        	
        	// cache hit�� �� + 1
        	if(cache.contains(city)) {
        		cache.remove(city); // ���� �ִ� �� �����
        		cache.add(city); // �ٽ� �߰�
        		answer += CACHE_HIT;
        	} else { // cache miss�� �� + 5
        		cache.add(city);
        		if(cache.size() > cacheSize) { // ĳ�� ������ cacheSize���� Ŀ����
        			cache.poll(); // ���� ���� ������ �� ������
        		} // if end
        		answer += CACHE_MISS;
        	} // if ~ else end
        } // for end
        return answer;
    }
}
