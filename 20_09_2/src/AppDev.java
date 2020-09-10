import java.util.*;

public class AppDev {
	
	public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // �����Ǵ� �� ��
        int[] distribute = new int[progresses.length];
        
        for(int i = 0; i < progresses.length; i++) {
        	
        	// �������� �ɸ��� �� ��
        	distribute[i] = (100 - progresses[i]) / speeds[i];
        	
        	// ���� �������� 0�� �ƴϸ� ����� ������ ��������� ���� ���̹Ƿ�
        	// �������� 0�� �ɶ����� ��¥(distribute)�� 1�� �����ش�
        	if((100 - progresses[i]) % speeds[i] != 0) {
        		distribute[i]++;
        	}
        } // for end
        
        // �����Ǵ� ��� ����(�ּ� 1���� ������)
        int output = 1;
        int tmp = 0;
        
        // ���� ������ �� �ִ� ��� ã��
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
