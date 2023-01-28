package programmers;

public class 다트게임 {
    public static void main(String[] args) {
        DartGame dart = new DartGame();
        System.out.println(dart.solution("1S2D*3T"));
    }
}

class DartGame {
    public int solution(String dartResult) {

        int[] points = new int[3];
        int idx = -1;

        for (int i = 0; i < dartResult.length(); i++) {

            String s = Character.toString(dartResult.charAt(i));

            if (isNumeric(s)) {
                idx++;
                points[idx] = Integer.parseInt(s);
                continue;
            }

            int p = points[idx];

            switch (s) {
                case "S":
                    points[idx] = getPowNum(p, 1);
                    break;
                case "D":
                    points[idx] = getPowNum(p, 2);
                    break;
                case "T":
                    points[idx] = getPowNum(p, 3);
                    break;
                case "*":
                    attachDoubleAllPoints(points, idx);
                    break;
                case "#":
                    points[idx] = attachMinusPoints(points[idx]);
                    break;
            }
        }

        return sum(points);
    }

    private boolean isNumeric(String s) {

        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }

        return true;
    }


    private int getPowNum(int n, int cnt) {
        int result = n;

        for (int i = 0; i < cnt - 1; i++) {
            result *= n;
        }

        return result;
    }

    private void attachDoubleAllPoints(int[] points, int idx) {
        for (int i = idx; i > idx - 2 || i > 0; i--) {
            points[i] *= 2;
        }
    }

    private int attachMinusPoints(int p) {
        return p * -1;
    }

    private int sum(int[] points) {
        int result = 0;

        for (int p : points) {
            result += p;
        }

        return result;
    }
}

