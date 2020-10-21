package alphago;

import java.util.ArrayList;

/*
	�׽�Ʈ 1 ��	��� (0.09ms, 51.7MB)
	�׽�Ʈ 2 ��	��� (0.06ms, 51.9MB)
	�׽�Ʈ 3 ��	��� (0.08ms, 52.8MB)
	�׽�Ʈ 4 ��	��� (0.07ms, 51.9MB)
	�׽�Ʈ 5 ��	��� (0.07ms, 52MB)
	�׽�Ʈ 6 ��	��� (0.06ms, 52.6MB)
	�׽�Ʈ 7 ��	��� (0.08ms, 52.3MB)
	�׽�Ʈ 8 ��	��� (0.06ms, 52.8MB)
	�׽�Ʈ 9 ��	��� (0.06ms, 52.5MB)
	�׽�Ʈ 10 ��	��� (0.07ms, 52.2MB)
	�׽�Ʈ 11 ��	��� (0.09ms, 52.6MB)
	�׽�Ʈ 12 ��	��� (0.09ms, 52.5MB)
	�׽�Ʈ 13 ��	��� (0.09ms, 52.5MB)
	�׽�Ʈ 14 ��	��� (0.07ms, 52MB)
 */


public class SkillTree {
	public static int solution(String skill, String[] skill_trees) {
		int answer = skill_trees.length;
		int val;
		ArrayList<String> list = new ArrayList<>();
		        
		// list �ȿ� skill ������ �ϳ��� �־���
		for(int i = 0; i < skill.length(); i++) {
			list.add(skill.substring(i, i + 1));
		} // for end
		        
		// ��ų Ʈ�� �� 1���� ��ų Ʈ���� �����ͼ�
		for(int i = 0; i < skill_trees.length; i++) {
			val = 0;
			// �ش� ��ų�� ������ �� �Ǿ��ִ��� Ȯ��
			for(int j = 0; j < skill_trees[i].length(); j++) {
				if(list.contains(skill_trees[i].substring(j, j + 1))) {
					// ���������� ��ų Ʈ�� ����Ǵ� ���
					if(val == list.indexOf(skill_trees[i].substring(j, j + 1))) {
						val++;
					} else { // ���� �߸��� ���
						answer -= 1;
						break; // ������ ���� ��ųƮ�� �˻��Ϸ�
					} // if ~ else end
				} // if end
			} // for(j) end
		} // for(i) end
		return answer;
    }
}
