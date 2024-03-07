package org.example.stack;

import java.util.Scanner;

public class Solution_9012 {

    static final char left_braket='(';
    static final char right_braket=')';


    static boolean check_braket_count(String line){
        int count_left_bracket=0;
        for (int j = 0; j < line.length(); j++) {
            char c=line.charAt(j);
            if(c==left_braket) count_left_bracket++;
            else {
                if(count_left_bracket<=0) {
                    return false;
                }else count_left_bracket--;
            }
        }
        if (count_left_bracket>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();

        //개행 제거
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String line=scanner.nextLine();
            if (check_braket_count(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
