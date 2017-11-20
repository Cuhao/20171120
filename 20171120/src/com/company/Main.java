package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        float v1 = 0.0f;
        for (int i=0;i<10;i++)
        {
        v1 =scn.nextFloat();
        if (max<v1){
            max=v1;
        }
        if (min>v1){
            min=v1;
        }
        }
        System.out.println("min="+min+"\nmax="+max);
    }
}
