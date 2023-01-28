package programmers;

public class 다트게임 {
    public static void main(String[] args) {
        DartGame dart = new DartGame();
        System.out.println(dart.solution(""));
    }
}

class DartGame {
    public int solution(String dartResult) {

        int[] points = new int[3];
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {

            String s = Character.toString(dartResult.charAt(i));

            if(isNumeric(s)) {
               points[idx] = Integer.parseInt(s);
               continue;
            }



        }

        int answer = 0;
        return answer;
    }

    private boolean isNumeric(String s) {

        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }

        return true
    }

}

