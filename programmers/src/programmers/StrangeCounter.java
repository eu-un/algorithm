package programmers;

public class StrangeCounter {
	static long strangeCounter(long t) {
		long time_top = 1;
		long value_top = 3;
		
		// 각 주기의 맨 위의 값 구하기
		while(time_top <= t) {
			time_top += value_top;
			value_top = time_top + 2;
		}
		
		// 구하고 싶은 시간의 다음 주기 time_top에서 구하고 싶은 시간 빼면 됨
		return (time_top - t);
    }
}
