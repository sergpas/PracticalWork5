package com.alfa.work45;

public class Main {
    public static void main(String[] args) {
        int curNumber=0;
        System.out.print("* |");
        while (++curNumber < 10){
            System.out.print("  "+curNumber);
        }
        System.out.print("\n------------------------------");
        curNumber=0;
        while(++curNumber < 10){
            System.out.print("\n"+curNumber+" |");
            int tmpNumber=0;
            while(++tmpNumber < 10){
                if(tmpNumber*curNumber < 10) System.out.print(" ");
                System.out.print(" "+ tmpNumber*curNumber);
            }
        }
    }
}