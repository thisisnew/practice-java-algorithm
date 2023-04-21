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

    int wStart = 0;
    int hStart = 0;

    public int[] solution(String[] park, String[] routes) {

        boolean[][] twoDimensionsPark = getTwoDimensionsPark(park);

        for (String route : routes) {
            goStep(park, route);
        }

        int[] answer = {};
        return answer;
    }

    private boolean[][] getTwoDimensionsPark(String[] park) {

        int width = park[0].length();
        int height = park.length;

        boolean[][] result = new boolean[width][height];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    wStart = i;
                    hStart = j;
                    result[i][j] = true;
                }
            }
        }

        return result;
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
