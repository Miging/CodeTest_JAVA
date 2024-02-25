package org.example.implement;

import java.util.Scanner;

public class Solution_2738 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] splited=scanner.nextLine().split(" ");
        int n,m;
        n=Integer.parseInt(splited[0]);
        m=Integer.parseInt(splited[1]);

        int[][] matrixA =new int[n][m];
        int[][] matrixB =new int[n][m];
        //A입력
        for (int i = 0; i < n; i++) {
            splited=scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixA[i][j]=Integer.parseInt(splited[j]);
            }
        }
        //B입력
        for (int i = 0; i < n; i++) {
            splited=scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixB[i][j]=Integer.parseInt(splited[j]);
            }
        }
        //행렬 덧셈
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixA[i][j]+matrixB[i][j]+" ");
            }
            System.out.println();
        }
    }
}
