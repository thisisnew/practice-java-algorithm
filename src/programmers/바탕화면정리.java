package programmers;

import java.util.Arrays;

public class 바탕화면정리 {
    public static void main(String[] args) {
        WallPaper wallPaper = new WallPaper();
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(wallPaper.solution(wallpaper)));
    }
}

class WallPaper {

    private static final String file = "#";

    public int[] solution(String[] wallpaper) {

        //통합
        int[] luValues = getLuValues(wallpaper);
        int lux = luValues[0];
        int luy = luValues[1];

        //통합
        int[] rdValues = getRdValues(wallpaper);
        int rdx = rdValues[0];
        int rdy = rdValues[1];

        return new int[]{lux, luy, rdx, rdy};
    }

    private int[] getLuValues(String[] wallpaper) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < wallpaper.length; i++) {

            String w = wallpaper[i];

            for (int j = 0; j < w.length(); j++) {
                if (!file.equals(String.valueOf(w.charAt(j)))) {
                    continue;
                }

                if (i <= x) {
                    x = i;
                }

                if (j <= y) {
                    y = j;
                }
            }

        }

        return new int[]{x, y};
    }

    private int[] getRdValues(String[] wallpaper) {
        return new int[]{};
    }

}