import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        
        for(int i=0; i<a.length(); i++){
            
            int tmp = (int)a.charAt(i);
            
            if((tmp>=65)&&(tmp<=90)){ // 대문자일 경우
                output += (char)(tmp+32);
            }
            else if((tmp>=97)&&(tmp<=122)){ // 소문자일 경우
                output += (char)(tmp-32);
            }
            else
                output+=(char)tmp;
        }
        System.out.print(output);
        
        sc.close();
    }
}