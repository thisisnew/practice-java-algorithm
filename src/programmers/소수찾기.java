package programmers;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (!isPrimeNumber(i)) {
                continue;
            }

            answer++;
        }

        return answer;
    }

    private static boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

