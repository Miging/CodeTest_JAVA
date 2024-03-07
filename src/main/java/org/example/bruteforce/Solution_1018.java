package org.example.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_1018 {

    static final int target_row=8;
    static final int target_col=8;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int m=scanner.nextInt();

        //줄바꿈 제거
        scanner.nextLine();

        char[][] map=new char[n][m];
        for (int i = 0; i < n; i++) {
            String line= scanner.nextLine();
            for (int j = 0; j < m; j++) {
                map[i][j]=line.charAt(j);
            }
        }




        //8*8을 찾기 위한 가로 반복횟수
        int col_count=n-target_col+1;
        int row_count=m-target_row+1;

        int result_change_count=999999999;

        //흰/검 두번 탐색해야함.
        for (int two = 0; two < 2; two++) {
            for (int i = 0; i < col_count; i++) {
                //i는 8*8의 왼쪽 위 포인트의 초기 세로 좌표를 의미.
                for (int j = 0; j < row_count; j++) {
                    //j: 8*8의 왼쪽 위 포인트의 초기 가로 좌표

                    //아래의 반복문은 8*8정사각형 한세트를 검수
                    //검수시 고려할점.
                    //1. 왼쪽 위 좌표가 흰/검정색을 기준으로 검수
                    char initial=map[i][j];
                    int new_change_count=0;
                    for (int k = 0; k < target_col; k++) {
                        //세로 좌표
                        int y=k+i;
                        for (int l = 0; l < target_col; l++) {
                            //가로 좌표
                            int x=l+j;
                            //해당 좌표가 규칙을 잘 지키고 있는지?
                            //initial 좌표: [i][j]

                            if(two==1){
                                if(k%2!=l%2){
                                    if(initial!=map[y][x]) new_change_count+=1;
                                }else{
                                    if(initial==map[y][x]) new_change_count+=1;
                                }
                            }else{
                                if(k%2==l%2){
                                    if(initial!=map[y][x]) new_change_count+=1;
                                }else{
                                    if(initial==map[y][x]) new_change_count+=1;
                                }
                            }
                        }
                    }

                    //검수를 다했을때, 변경해야하는 횟수가 result보다 작으면 result를 갱신.
                    if(new_change_count<result_change_count) result_change_count=new_change_count;
                }
            }
        }


        System.out.println(result_change_count);
    }
}
