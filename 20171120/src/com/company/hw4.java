package com.company;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 =scn.nextInt();
        boolean flag =true;
        int i=2;
        while (i<=v1/2 &&  flag){
            if (v1%i==0){
                flag=false;
            }
            i++;
        }
        if (flag==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
