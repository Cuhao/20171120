package com.company;

import java.util.Scanner;

public class hw03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str =scn.nextLine();
        int length = str.length(),sum=0;
        for (int i=0;i<length;i++){
         sum=sum+(str.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}