import java.util.*;

public class Test {
	
	

	public static void main(String[] args) {
		
			int[] progresses = {93, 30, 55};
			int[] speeds = {1, 30, 5};
			
			
			// �����Ǵ� �� ��
	        int[] distribute = new int[progresses.length];
	        
	        for(int i = 0; i < progresses.length; i++) {
	        	
	        	// �������� �ɸ��� �� ��
	        	distribute[i] = (100 - progresses[i]) / speeds[i];
	        	System.out.println("���� distribute[" + i + "] :" + distribute[i]);
	        	System.out.println("���� progresses[" + i + "] :" + progresses[i]);
	        	System.out.println("���� speeds[" + i + "] :" + speeds[i]);
	        	
	        	
	        	// ���� �������� 0�� �ƴϸ� ����� ������ ��������� ���� ���̹Ƿ�
	        	// �������� 0�� �ɶ����� ��¥(distribute)�� 1�� �����ش�
	        	if((100 - progresses[i]) % speeds[i] != 0) {
	        		distribute[i]++;
	        		System.out.println("���Ƥ��ƾƤ����� distribute[" + i + "] :" + distribute[i]);
		        	System.out.println("���Ƥ��ƾƤ����� progresses[" + i + "] :" + progresses[i]);
		        	System.out.println("���Ƥ��ƾƤ����� speeds[" + i + "] :" + speeds[i]);
	        	}
	        } // for end
	        
	      
			
	       
		

	}

}
