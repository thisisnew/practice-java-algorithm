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

        int[] luValues = getLuValues(wallpaper);
        int lux = luValues[0];
        int luy = luValues[1];

        int[] rdValues = getRdValues(wallpaper);
        int rdx = rdValues[0];
        int rdy = rdValues[1];

        return new int[]{lux, luy, rdx, rdy};
    }

    private int[] getLuValues(String[] wallpaper) {

        int x = 0;
        int y = 0;
        boolean isXPointed = false;
        boolean isYPointed = false;

        for (int i = 0; i < wallpaper.length; i++) {

            String w = wallpaper[i];

            for (int j = 0; j < w.length(); j++) {

                if (isXPointed && isYPointed) {
                    break;
                }

                if (!file.equals(String.valueOf(w.charAt(j)))) {
                    continue;
                }

                x = i;
                isXPointed = true;

                y = j;
                isYPointed = true;
            }
        }

        return new int[]{x, y};
    }

    private int[] getRdValues(String[] wallpaper) {

        int x = 0;
        int y = 0;
        boolean isXPointed = false;
        boolean isYPointed = false;

        for (int i = wallpaper.length - 1; i >= 0; i--) {

            String w = wallpaper[i];

            for (int j = w.length() - 1; j >= 0; j--) {

                if (isXPointed && isYPointed) {
                    break;
                }

                if (!file.equals(String.valueOf(w.charAt(j)))) {
                    continue;
                }

                x = i + 1;
                isXPointed = true;

                y = j + 1;
                isYPointed = true;
            }
        }

        return new int[]{x, y};
    }

}