package programmers;

import java.util.Arrays;
import java.util.StringTokenizer;

public class 공원산책 {
    public static void main(String[] args) {
        WalkingPark walkingPark = new WalkingPark();
        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        System.out.println(Arrays.toString(walkingPark.solution(park, routes)));
    }
}

class WalkingPark {

    int wStart = 0;
    int hStart = 0;
    int width = 0;
    int height = 0;

    String[][] twoDimensionsPark = null;

    public int[] solution(String[] park, String[] routes) {
        twoDimensionsPark = getTwoDimensionsPark(park);

        for (String route : routes) {
            goStep(route, twoDimensionsPark);
        }

        return new int[]{wStart, hStart};
    }

    private String[][] getTwoDimensionsPark(String[] park) {

        width = park[0].length();
        height = park.length;

        String[][] result = new String[width][height];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                String v = String.valueOf(park[i].charAt(j));
                result[i][j] = v;

                if (v == "S") {
                    wStart = i;
                    hStart = j;
                }
            }
        }

        return result;
    }

    private void goStep(String route, String[][] twoDimensionsPark) {
        StringTokenizer st = new StringTokenizer(route);
        String direction = st.nextToken();
        int steps = Integer.parseInt(st.nextToken());

        switch (direction) {
            case "E":
                if (isOverLimit(wStart, steps, "+")) {
                    wStart += steps;
                }
                break;
            case "W":
                if (isOverLimit(wStart, steps, "-")) {
                    wStart -= steps;
                }
                break;
            case "S":
                if (isOverLimit(hStart, steps, "+")) {
                    hStart += steps;
                }
                break;
            case "N":
                if (isOverLimit(hStart, steps, "-")) {
                    hStart -= steps;
                }
                break;
        }
    }

    private boolean hasObstacle(int start, int steps, String operator) {

        if (operator.equals("+")) {

        }

        if (operator.equals("-")) {

        }


        return false;
    }

    private boolean isOverLimit(int start, int steps, String operator) {
        boolean result = false;

        if (operator.equals("+")) {
            result = start + steps <= steps - 1;
        }

        if (operator.equals("-")) {
            result = start - steps >= 0;
        }

        return result;
    }
}
