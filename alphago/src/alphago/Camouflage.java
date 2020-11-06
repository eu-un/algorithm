package alphago;

import java.util.ArrayList;
import java.util.HashMap;

/*
	�׽�Ʈ 1 ��	��� (0.10ms, 52.6MB)
	�׽�Ʈ 2 ��	��� (0.07ms, 52.8MB)
	�׽�Ʈ 3 ��	��� (0.08ms, 53MB)
	�׽�Ʈ 4 ��	��� (0.12ms, 53.3MB)
	�׽�Ʈ 5 ��	��� (0.08ms, 52.2MB)
	�׽�Ʈ 6 ��	��� (0.06ms, 55.9MB)
	�׽�Ʈ 7 ��	��� (0.11ms, 52.5MB)
	�׽�Ʈ 8 ��	��� (0.08ms, 52.8MB)
	�׽�Ʈ 9 ��	��� (0.08ms, 52.5MB)
	�׽�Ʈ 10 ��	��� (0.05ms, 52MB)
	�׽�Ʈ 11 ��	��� (0.06ms, 51.9MB)
	�׽�Ʈ 12 ��	��� (0.09ms, 54.3MB)
	�׽�Ʈ 13 ��	��� (0.10ms, 53.3MB)
	�׽�Ʈ 14 ��	��� (0.09ms, 52.9MB)
	�׽�Ʈ 15 ��	��� (0.06ms, 52MB)
	�׽�Ʈ 16 ��	��� (0.07ms, 52.4MB)
	�׽�Ʈ 17 ��	��� (0.07ms, 51.7MB)
	�׽�Ʈ 18 ��	��� (0.08ms, 52.8MB)
	�׽�Ʈ 19 ��	��� (0.07ms, 53.8MB)
	�׽�Ʈ 20 ��	��� (0.07ms, 53.6MB)
	�׽�Ʈ 21 ��	��� (0.07ms, 53.3MB)
	�׽�Ʈ 22 ��	��� (0.06ms, 52.9MB)
	�׽�Ʈ 23 ��	��� (0.07ms, 52.2MB)
	�׽�Ʈ 24 ��	��� (0.08ms, 52.8MB)
	�׽�Ʈ 25 ��	��� (0.07ms, 53.1MB)
	�׽�Ʈ 26 ��	��� (0.10ms, 53.4MB)
	�׽�Ʈ 27 ��	��� (0.05ms, 52.5MB)
	�׽�Ʈ 28 ��	��� (0.08ms, 53.5MB)
*/

public class Camouflage {
	public int solution(String[][] clothes) {
        int answer = 1;
        int cnt = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < clothes.length; i++) {
        	// ���� �ǻ��� ���� ��� ���� �� type�� ������ + 1
        	// + 1�ϴ� ���� : �ƹ� �͵� �� ���� ���
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
        	answer *= (list.get(i) + 1); // ��� ����� ��
        	if(i == list.size() - 1) { answer -= 1; }
        } // for end
        return answer;
    }
}
