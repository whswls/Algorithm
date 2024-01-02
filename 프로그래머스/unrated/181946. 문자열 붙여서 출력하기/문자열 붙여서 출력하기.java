import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String tmp1 = a.replace(" ","");
        String tmp2 = b.replace(" ","");
        
        System.out.print(tmp1);
        System.out.print(tmp2);
    }
}