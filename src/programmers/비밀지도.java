package programmers;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(solution(n, arr1, arr2));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {

        String[][] secretMap = new String[n][n];

        int idx = 0;
        for (int i = 0; i < arr1.length; i++) {
            String bin = Integer.toBinaryString(arr1[i]);

            for (int j = 0; j < bin.length(); j++) {
                secretMap[idx][i] = String.valueOf(bin.charAt(j));
            }

            idx++;
        }


        String[] answer = {};
        return answer;
    }

    private static
}

class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[][] secretMap = new String[n][n];

        String[] answer = {};
        return answer;
    }

    private int[] unionBetweenTwoArrays(int[] arr1, int[] arr2){

        int len = Math.max(arr1.length, arr2.length);

        int[] result = new int[len];

        for(int i=0; i<arr1.length; i++){
            result[i] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++){

        }

        return result;
    }

    private void mark(String[][] secretMap, int[] arr) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            String bin = Integer.toBinaryString(arr[i]);

            for (int j = 0; j < bin.length(); j++) {
                secretMap[idx][i] = String.valueOf(bin.charAt(j));
            }

            idx++;
        }
    }
}