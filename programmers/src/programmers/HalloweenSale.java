package programmers;

public class HalloweenSale {
	
	int howManyGames(int p, int d, int m, int s) {
		// ������ ���� ����
        int game_count = 0;       
        
        // ���� �� ������ �� ���� �ݺ�
        while(s >= 0) {
        	s = s - p; // ���� �����ϰ� ���� ��
        	
        	if(p - d >= m) {
        		p = p - d;
        		game_count++;
        	} else {
        		p = m;
        		// ���� ���� -�� game_count�� ������Ű�� ����
        		if(s > 0) {
        			game_count++;
        		} 
        	}
        }
		return game_count;
    }
}
