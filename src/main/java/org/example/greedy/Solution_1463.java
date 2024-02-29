package org.example.greedy;

import java.util.Scanner;

public class Solution_1463 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int times=0;

        //연산을 사용하는 횟수의 최솟값을 알아내려면??
        //10->5->4->2->1->0
        //10->9->3->1->0
        //3으로 나누는것이 우선순위가 가장 큼.

        while (input!=0){
            if(input%3==0){
                input/=3;
            }else if(input%2==0){
                input/=2;
            }else{
                input--;
            }
            times+=1;
        }
        System.out.println(times);
    }
}
