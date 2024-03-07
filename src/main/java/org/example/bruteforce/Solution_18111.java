package org.example.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Solution_18111 {

    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int[][] map =new int[n][m];
        int min = 256;
        int max = 0;
        for (int i = 0; i < n; i++) {
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j]= Integer.parseInt(st.nextToken());
                if(min>map[i][j]) min=map[i][j];
                if(max<map[i][j]) max=map[i][j];
            }
        }

        int final_times=999999999;
        int final_target=-1;
        //min~max까지 목표층수를 1씩 늘려가며 반복
        for (int target=min; target <= max; target++) {
            //시간이 줄어들때마다 저장
            int new_times=0;
            int inven=b;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int d=target-map[i][j];
                    //목표 층수에서 블럭을 추가해야하는 경우
                    if(d>0){
                        inven-=d;
                        new_times+=d;
                    }//블럭을 제거해야하는 경우
                    else if (d<0){
                        inven+=-d;
                        new_times+=-2*d;
                    }
                }
            }
            //만약 인벤토리가 음수라면
            if (inven<0) {
                break;
            }
            if(new_times<=final_times){
                final_times=new_times;
                final_target=target;
            }
        }

        System.out.print(final_times);
        System.out.println(" "+ final_target);


    }
}

