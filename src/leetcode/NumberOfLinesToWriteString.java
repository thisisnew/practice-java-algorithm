package leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfLinesToWriteString {

    private static final int MAX_PIXEL = 100;

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz")));
    }

    private static int[] numberOfLines(int[] widths, String s) {

        var characters = new CharacterList(new ArrayList<>());

        for (int i = 0; i < s.length(); i++) {
            var pixel = widths[s.charAt(i) - 'a'];

            if (characters.sumPixels() > MAX_PIXEL - pixel) {
                characters.refresh();
            }

            characters.add(pixel);
        }

        return new int[]{characters.countPixels(), characters.sumPixels()};
    }
}

class CharacterList {

    private int countPixels = 0;
    private final List<Integer> pixels;

    CharacterList(List<Integer> pixels) {
        this.pixels = pixels;
    }

    public int sumPixels() {
        return pixels.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public void add(int pixel) {
        pixels.add(pixel);
    }

    public void refresh() {
        countPixels++;
        pixels.clear();
    }

    public int countPixels() {
        if (!pixels.isEmpty()) {
            countPixels++;
        }

        return countPixels;
    }
}
