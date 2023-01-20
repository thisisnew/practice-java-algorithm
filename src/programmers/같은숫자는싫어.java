package programmers;

import java.util.Arrays;
import java.util.List;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        같은숫자는싫어solution(arr);
    }

    private static int[] 같은숫자는싫어solution(int[] arr) {
        List<Integer> list = Arrays.asList(arr[0]);

        int std = list.get(0);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != std) {
                list.add(arr[i]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
