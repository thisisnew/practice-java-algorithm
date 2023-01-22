package programmers;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(solution(n, arr1, arr2));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {

        String[][] map = new String[n][n];

        int idx = 0;
        for (int i = 0; i < arr1.length; i++) {
            String bin = Integer.toBinaryString(arr1[i]);

            for (int j = 0; j < bin.length(); j++) {
                //map[idx][j] = bin.charAt(j) - 'A';
            }
            idx++;
        }


        String[] answer = {};
        return answer;
    }
}
