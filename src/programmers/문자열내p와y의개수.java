package programmers;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }

    private static boolean solution(String s) {

        int pCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'p':
                    pCnt++;
                    break;
                case 'P':
                    pCnt++;
                    break;
                case 'y':
                    yCnt++;
                    break;
                case 'Y':
                    yCnt++;
                    break;
            }

        }


        return pCnt == yCnt;
    }
}
