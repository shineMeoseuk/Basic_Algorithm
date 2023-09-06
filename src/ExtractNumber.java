import java.util.Scanner;

class ExtractNumber {
    public int solution(String s){
        //int answer=0;
        String answer="";
        for(char x : s.toCharArray()){
            //if(x>=48 && x<=57) answer=answer*10+(x-48);
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        ExtractNumber T = new ExtractNumber();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
