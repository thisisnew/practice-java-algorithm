package programmers;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        
        SecretMap scMap = new SecretMap();
        System.out.println(scMap.solution(n, arr1, arr2));
    }
}

class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[][] secretMap = mark(unionBetweenTwoArrays(arr1, arr2), n);

        String[] answer = {};
        return answer;
    }

    private int[] unionBetweenTwoArrays(int[] arr1, int[] arr2) {

        int len = Math.max(arr1.length, arr2.length);

        int[] result = new int[len];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = result[i] == 1 ? result[i] : arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[i] = result[i] == 1 ? result[i] : arr1[i];
        }

        return result;
    }

    private String[][] mark(int[] arr, int n) {

        String[][] result = new String[n][n];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            String bin = Integer.toBinaryString(arr[i]);

            for (int j = 0; j < bin.length(); j++) {
                result[idx][i] = String.valueOf(bin.charAt(j));
            }

            idx++;
        }

        return result;
    }
}