package org.example.implement;

import java.util.*;
public class Solution_2743 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        for (int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if ((int) c >= 65 && (int) c < 97) {
                System.out.print((char)(c+32));
            }else {
                System.out.print((char)(c-32));
            }
        }
    }
}
