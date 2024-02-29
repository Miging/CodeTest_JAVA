package org.example.greedy;

import java.util.Scanner;

public class Solution_5585 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int charge=1000-input;
        int[] cointypes={500,100,50,10,5};
        int result=0;
        for (int i = 0; i < cointypes.length; i++) {
            int coin=cointypes[i];
            result+=charge/coin;
            charge%=coin;
        }
        result+=charge;
        System.out.println(result);


    }
}
