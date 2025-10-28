package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, 0, 0);
        System.out.println(dateTime.getDayOfWeek());
    }
}
