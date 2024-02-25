package org.example.implement;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_5597 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<Integer>();

        for (int i = 1; i < 31; i++) {
            nums.add(i);
        }

        for (int i = 0; i < 28; i++) {
            int num=scanner.nextInt();
            int index=nums.indexOf(num);
            nums.remove(index);
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}
