package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        SecretMap scMap = new SecretMap();
        System.out.println(Arrays.toString(scMap.solution(n, arr1, arr2)));
    }
}

class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[][] result = new String[n][n];
        mark(result, arr1, n);
        mark(result, arr2, n);

        return getSecretMapProperty(result);
    }

    private void mark(String[][] result, int[] arr, int n) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            String bin = paddingZero(Integer.toBinaryString(arr[i]), n);

            for (int j = 0; j < bin.length(); j++) {
                result[idx][j] = bin.charAt(j) == '1' || result[idx][j] == "#" ? "#" : " ";
            }

            idx++;
        }
    }

    private String paddingZero(String bin, int n) {

        if (bin.length() == n) {
            return bin;
        }

        int len = n - bin.length();
        for (int i = 0; i < len; i++) {
            bin = "0" + bin;
        }

        return bin;
    }

    private String[] getSecretMapProperty(String[][] secretMap) {
        List<String> list = new ArrayList<>();

        for (String[] sc : secretMap) {
            StringBuilder sb = new StringBuilder();

            for (String n : sc) {
                sb.append(n);
            }

            list.add(sb.toString());
        }

        return list.toArray(new String[list.size()]);
    }
}