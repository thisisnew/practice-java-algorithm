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
            String[] entities = getPrivacyEntities(privacies[i]);
            String collectionDate = entities[0];
            String termsType = entities[1];

            if (isAbrogateDate(today, "")) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private Map<String, Integer> getValidityMap(String[] terms) {

        Map<String, Integer> result = new HashMap<>();

        for (String term : terms) {
            String[] t = term.split(" ");
            result.put(t[0], Integer.parseInt(t[1]));
        }

        return result;
    }

//    private String getExpirationDate() {
//
//    }

    private String[] getPrivacyEntities(String privacy) {
        return privacy.split(" ");
    }

    private int[] getDayEntities(String day) {
        String[] entities = day.split("[.]");

        int[] result = new int[entities.length];

        for (int i = 0; i < entities.length; i++) {
            result[i] = Integer.parseInt(entities[i]);
        }

        return result;
    }

    private boolean isAbrogateDate(String today, String expireDate) {

        int[] todayEntities = getDayEntities(expireDate);
        int thisYear = todayEntities[0];
        int thisMonth = todayEntities[1];
        int thisDay = todayEntities[2];

        int[] expireDateEntities = getDayEntities(expireDate);
        int expireYear = expireDateEntities[0];
        int expireMonth = expireDateEntities[1];
        int expireDay = expireDateEntities[2];

        if (thisYear < expireYear) {
            return false;
        }

        if (thisYear == expireYear && thisMonth < expireMonth) {
            return false;
        }

        if (thisYear == expireYear && thisMonth == expireMonth && thisDay < expireDay) {
            return false;
        }

        return true;
    }

}