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

    boolean[][] twoDimensionsPark = null;

    public int[] solution(String[] park, String[] routes) {
        twoDimensionsPark = getTwoDimensionsPark(park);

        for (String route : routes) {
            goStep(route);
        }

        return new int[]{wStart, hStart};
    }

    private boolean[][] getTwoDimensionsPark(String[] park) {

        width = park[0].length();
        height = park.length;

        boolean[][] result = new boolean[width][height];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    wStart = i;
                    hStart = j;
                    result[i][j] = true;
                }

                if (park[i].charAt(j) == 'X') {
                    result[i][j] = true;
                }
            }
        }

        return result;
    }

    private void goStep(String route) {
        StringTokenizer st = new StringTokenizer(route);
        String direction = st.nextToken();
        int steps = Integer.parseInt(st.nextToken());

        switch (direction) {
            case "E":
                if (wStart + steps <= width - 1) {
                    wStart += steps;
                }
                break;
            case "W":
                if (wStart - steps >= 0) {
                    wStart -= steps;
                }
                break;
            case "S":
                if (hStart + steps >= height - 1) {
                    hStart += steps;
                }
                break;
            case "N":
                if (hStart - steps >= 0) {
                    hStart -= steps;
                }
                break;
        }
    }

    private boolean hasObstacle(int start, int steps, String operator) {

        if (operator == "+") {

        } else {

        }


        return false;
    }
}
