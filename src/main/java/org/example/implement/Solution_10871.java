package org.example.implement;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_10871 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] list;
        ArrayList<String> result=new ArrayList<String>();
        int n,x;
        list=input.split(" ");
        n= Integer.parseInt(list[0]);
        x=Integer.parseInt(list[1]);


        String a;
        a=scanner.nextLine();
        String[] k;
        k=a.split(" ");

        //x보다 작을경우에 대한 처리
        for (int i=0;i<k.length;i++){
            int num=Integer.parseInt(k[i]);
            if (num<x){
                result.add(String.valueOf(num));
            }
        }

        //출력
        System.out.println(String.join(" ",result));
    }
}