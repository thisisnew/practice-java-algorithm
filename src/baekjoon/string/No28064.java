package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class No28064 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int res = 0;

        for (int i=0; i< arr.length-1; i++) {
            for (int j=1; j<arr.length; j++) {
                String pre = arr[i];
                String post = arr[j];

                if (availableToConnect(pre, post) || availableToConnect(post, pre)) {
                    res++;
                }
            }
        }

        System.out.println(res);
        br.close();
    }

    private static boolean availableToConnect(String pre, String post) {
        if (Objects.equals(pre, post)) {
            return false;
        }

        int idx = 0;
        for (int i = pre.length() - 1; i >=0; i--) {
            String subPre = pre.substring(i);
            String subPost = post.substring(0, idx);

            if (subPre.equals(subPost)) {
                return true;
            }

            idx++;
        }

        return false;
    }
}