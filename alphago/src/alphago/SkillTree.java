package alphago;

import java.util.ArrayList;

/*
	테스트 1 〉	통과 (0.09ms, 51.7MB)
	테스트 2 〉	통과 (0.06ms, 51.9MB)
	테스트 3 〉	통과 (0.08ms, 52.8MB)
	테스트 4 〉	통과 (0.07ms, 51.9MB)
	테스트 5 〉	통과 (0.07ms, 52MB)
	테스트 6 〉	통과 (0.06ms, 52.6MB)
	테스트 7 〉	통과 (0.08ms, 52.3MB)
	테스트 8 〉	통과 (0.06ms, 52.8MB)
	테스트 9 〉	통과 (0.06ms, 52.5MB)
	테스트 10 〉	통과 (0.07ms, 52.2MB)
	테스트 11 〉	통과 (0.09ms, 52.6MB)
	테스트 12 〉	통과 (0.09ms, 52.5MB)
	테스트 13 〉	통과 (0.09ms, 52.5MB)
	테스트 14 〉	통과 (0.07ms, 52MB)
 */


public class SkillTree {
	public static int solution(String skill, String[] skill_trees) {
		int answer = skill_trees.length;
		int val;
		ArrayList<String> list = new ArrayList<>();
		        
		// list 안에 skill 값들을 하나씩 넣어줌
		for(int i = 0; i < skill.length(); i++) {
			list.add(skill.substring(i, i + 1));
		} // for end
		        
		// 스킬 트리 중 1개의 스킬 트리를 가져와서
		for(int i = 0; i < skill_trees.length; i++) {
			val = 0;
			// 해당 스킬의 순서가 잘 되어있는지 확인
			for(int j = 0; j < skill_trees[i].length(); j++) {
				if(list.contains(skill_trees[i].substring(j, j + 1))) {
					// 정상적으로 스킬 트리 진행되는 경우
					if(val == list.indexOf(skill_trees[i].substring(j, j + 1))) {
						val++;
					} else { // 순서 잘못된 경우
						answer -= 1;
						break; // 끝내고 다음 스킬트리 검사하러
					} // if ~ else end
				} // if end
			} // for(j) end
		} // for(i) end
		return answer;
    }
}
