package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 방배정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Room room = new Room();
        if (room.isPossibleReservationRoom(arr)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}


class Room {

    public boolean isPossibleReservationRoom(int arr[]) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int n = arr[3];

        for (int i = 0; i <= 50; i++) {
            for (int j = 0; j <= 50; j++) {
                for (int k = 0; k <= 50; k++) {
                    if ((a * i) + (b * j) + (c * k) == n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}