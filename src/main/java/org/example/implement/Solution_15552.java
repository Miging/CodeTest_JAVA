package org.example.implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int a,b;
            String s=br.readLine();
            String[] splited=s.split(" ");
            a=Integer.parseInt(splited[0]);
            b=Integer.parseInt(splited[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();
    }
}
