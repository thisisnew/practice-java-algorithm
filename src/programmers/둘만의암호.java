package programmers;

public class 둘만의암호 {
    public static void main(String[] args) {
        PassWord passWord = new PassWord();
        System.out.println(passWord.solution("aukks", "wbqd", 5));
    }
}

class PassWord {
    public String solution(String s, String skip, int index) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(getCharacterAfterIndex(s.charAt(i), index, skip));
        }

        return sb.toString();
    }

    private String getCharacterAfterIndex(char c, int index, String skip) {
        char result = c;
        int cnt = 0;

        while (cnt < index) {
            result += 1;

            if (result > 'z') {
                result = 'a';
            }

            if (isContainsSkip(skip, result)) {
                continue;
            }

            cnt++;
        }

        return String.valueOf(result);
    }

    private boolean isContainsSkip(String skip, char c) {
        return skip.contains(String.valueOf(c));
    }
}
