package org.example.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_1546 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        double[] numbers=new double[n];
        double max=0;
        for (int i = 0; i < n; i++) {
            numbers[i]=scanner.nextInt();
            if(max<numbers[i]) max=numbers[i];
        }

        double sum=0;
        for (int i=0;i<n;i++){
            sum+=numbers[i]/max*100.0;
        }
        System.out.println( sum/(double)n);
    }
}
