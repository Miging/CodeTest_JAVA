package org.example.implement;

import java.util.*;

public class Solution_9086 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            String s=scanner.next();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
        }
    }
}
