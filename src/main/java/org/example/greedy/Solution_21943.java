package org.example.greedy;

import java.util.Scanner;


class Matching{
    int[] nums;
    Boolean[] poses;
    Matching() {}

}
public class Solution_21943 {
    public static void main(String[] args) {
        //연산의 결과가 최대가 나오려면?
        //곱하기 양 옆 숫자가 비슷해야함
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
        int p= scanner.nextInt();
        int q=scanner.nextInt();
        //결국 곱하기의 개수가 중요하다.
        //곱하기 개수를 구하고 위치를 설정한다
        //모든 경우의 수를 찾을때까지 반복.
        int answer=0;
        while (true){
            int result;
            //곱하기 위치를 어떻게 판단할 것인가?
            Boolean[] pos=new Boolean[n-1];

        }
    }
}
