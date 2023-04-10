package programmers;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        Ternary ternary = new Ternary();
        System.out.println(ternary.solution(45));
    }
}

class Ternary {
    public int solution(int n) {
        return toDecimal(reverse(toTernary(n)));
    }

    private int toTernary(int n) {
        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            return 0;
        }

        while (n > 0) {
            if (n % 3 < 10) {
                sb.append(n % 3);
            } else {
                sb.append((char) (n % 3 - 10 + 'A'));
            }

            n = n / 3;
        }

        return Integer.parseInt(sb.reverse().toString());
    }

    private int reverse(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 10);
            n = n / 10;
        }

        return Integer.parseInt(sb.toString());
    }

    private int toDecimal(int n) {
        int result = 0;
        int idx = 0;
        int share = n;
        int remain = n % 10;

        while (share > 0) {
            result += 10 * idx * remain;
            remain = share % 10;
            share = share / 10;
            idx++;
        }

        return result;
    }


}
