import java.util.Scanner;

class StrDecoding {
    public String solution(int n, String s) {
        String answer="";
        for(int i=0; i<n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        StrDecoding T = new StrDecoding();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
