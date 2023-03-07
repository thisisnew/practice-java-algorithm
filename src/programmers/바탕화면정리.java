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
    public int[] solution(String[] wallpaper) {

        //통합
        int lux = getLux(wallpaper);
        int luy = getLuy(wallpaper);

        //통합
        int rdx = getRdx(wallpaper);
        int rdy = getRdy(wallpaper);

        return new int[]{lux, luy, rdx, rdy};
    }

    private int getLux(String[] wallpaper) {

        int result = 0;

        for (String w : wallpaper) {
            for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) != '#') {
                    continue;
                }

                if (i <= result) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }

    private int getLuy(String[] wallpaper) {

        int result = 0;

        for (String w : wallpaper) {
            for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) != '#') {
                    continue;
                }

                if (i <= result) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }

    private int getRdx(String[] wallpaper) {

        int result = 0;

        for (String w : wallpaper) {
            for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) != '#') {
                    continue;
                }

                if (i <= result) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }

    private int getRdy(String[] wallpaper) {

        int result = 0;

        for (String w : wallpaper) {
            for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) != '#') {
                    continue;
                }

                if (i <= result) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }
}