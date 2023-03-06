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
        int startPointOfLine = getStartPointOfLine(wallpaper);
        int startPointOfRow = getStartPointOfRow(wallpaper);

        int endPointOfLine = getEndPointOfLine(wallpaper);
        int endPointOfRow = getEndPointOfRow(wallpaper);

        int[] answer = {};
        return answer;
    }

    private int getStartPointOfLine(String[] wallpaper) {

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

    private int getStartPointOfRow(String[] wallpaper) {

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

    private int getEndPointOfLine(String[] wallpaper) {

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

    private int getEndPointOfRow(String[] wallpaper) {

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