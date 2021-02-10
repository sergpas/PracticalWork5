package com.alfa.work46;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int inValue = scan.nextInt();
        int outSumValue=0;
        while (inValue>0){
            int tmpValue=inValue%10;
            outSumValue+=tmpValue*tmpValue;
            inValue=inValue/10;
        }
        System.out.println("Sum Square of Digits Value: "+outSumValue);
    }
}
