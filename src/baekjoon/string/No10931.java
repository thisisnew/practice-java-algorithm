package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class No10931 {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        MessageDigest digest = MessageDigest.getInstance("SHA-384");
        byte[] hash = digest.digest(s.getBytes());
        StringBuilder sb = new StringBuilder();

        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);

            if (hex.length() == 1) {
                sb.append('0');
            }

            sb.append(hex);
        }

        System.out.println(sb);
        br.close();
    }

}