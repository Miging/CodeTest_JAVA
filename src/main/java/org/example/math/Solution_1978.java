package org.example.math;

import java.util.Scanner;


public class Solution_1978 {

    static boolean judge_decimal(int num){
        if(num==1) return false;
        for (int j = 2; j < num; j++) {
            if(num%j==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int num=scanner.nextInt();
            if(judge_decimal(num)) count++;
        }

        System.out.println(count);
    }
}
