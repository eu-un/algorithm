package programmers;

public class StrangeCounter {
	static long strangeCounter(long t) {
		long time_top = 1;
		long value_top = 3;
		
		// �� �ֱ��� �� ���� �� ���ϱ�
		while(time_top <= t) {
			time_top += value_top;
			value_top = time_top + 2;
		}
		
		// ���ϰ� ���� �ð��� ���� �ֱ� time_top���� ���ϰ� ���� �ð� ���� ��
		return (time_top - t);
    }
}
