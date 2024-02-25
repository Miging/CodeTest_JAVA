package org.example.implement;


import java.util.Scanner;

//N개의 정수가 주어지고,정수 v가 몇개인가?
public class Solution_10807 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        //개행제거
        scanner.nextLine();

        String[] splited=scanner.nextLine().split(" ");
        int v=scanner.nextInt();
        int answer=0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(splited[i])==v) answer++;
        }
        System.out.println(answer);
    }
}
