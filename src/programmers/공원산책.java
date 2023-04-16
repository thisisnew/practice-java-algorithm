package programmers;

import java.util.StringTokenizer;

public class 공원산책 {
    public static void main(String[] args) {
        WalkingPark walkingPark = new WalkingPark();
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        System.out.println(walkingPark.solution(park, routes));
    }
}

class WalkingPark {

    public int[] solution(String[] park, String[] routes) {

        for (String route : routes) {


        }

        int[] answer = {};
        return answer;
    }

    private void goStep(String[] park, String route) {
        StringTokenizer st = new StringTokenizer(route);
        String direction = st.nextToken();
        String steps = st.nextToken();

        switch (direction) {
            case "E":
                break;
            case "W":
                break;
            case "S":
                break;
            case "N":
                break;
        }
    }
}
