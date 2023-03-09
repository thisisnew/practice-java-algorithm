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
        return new int[]{};
    }

    private int[] getRdValues(String[] wallpaper) {
        return new int[]{};
    }
    
}