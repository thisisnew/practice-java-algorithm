package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class No10931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-384");
            byte[] hash = digest.digest(s.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            System.out.println(hexString);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        br.close();
    }

}