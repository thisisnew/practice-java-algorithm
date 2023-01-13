package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보수집유효기간 {
    public static void main(String[] args) {
        Privacy privacy = new Privacy();
        System.out.println(privacy.solution("", new String[]{}, new String[]{}));
    }


}

class Privacy {
    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Integer> termsMap = getValidityMap(terms);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {


            result.add(i + 1);
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public Map<String, Integer> getValidityMap(String[] terms) {

        Map<String, Integer> result = new HashMap<>();

        for (String term : terms) {
            String[] t = term.split(" ");
            result.put(t[0], Integer.parseInt(t[1]));
        }

        return result;
    }

}