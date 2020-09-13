package programmers;

public class HalloweenSale {
	
	int howManyGames(int p, int d, int m, int s) {
		// 구매한 게임 갯수
        int game_count = 0;       
        
        // 돈이 다 떨어질 때 까지 반복
        while(s >= 0) {
        	s = s - p; // 게임 구매하고 남은 돈
        	
        	if(p - d >= m) {
        		p = p - d;
        		game_count++;
        	} else {
        		p = m;
        		// 남은 돈이 -면 game_count를 증가시키지 않음
        		if(s > 0) {
        			game_count++;
        		} 
        	}
        }
		return game_count;
    }
}
