package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No18063 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int totalSeconds = 0;

        // 모든 노래의 길이를 초 단위로 합산
        for (int i = 0; i < n; i++) {
            String timeStr = br.readLine();
            String[] parts = timeStr.split(":");
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);
            totalSeconds += minutes * 60 + seconds;
        }

        // 크로스페이드 시간 차감 (n-1)번의 크로스페이드가 발생
        totalSeconds -= (n - 1) * c;

        // 시, 분, 초로 변환
        int hours = totalSeconds / 3600;
        int remainingMinutes = (totalSeconds % 3600) / 60;
        int remainingSeconds = totalSeconds % 60;

        // hh:mm:ss 형식으로 출력
        System.out.printf("%02d:%02d:%02d%n", hours, remainingMinutes, remainingSeconds);

        br.close();
    }
}
