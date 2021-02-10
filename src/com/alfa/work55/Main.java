package com.alfa.work55;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inString = scan.nextLine();
        int i=0;
        System.out.println("Unique Bytes: ");
        while(i < inString.length()){
            char chr = inString.charAt(i);
            if(inString.indexOf(chr) == inString.lastIndexOf(chr)) {
                System.out.println(chr+" ");
            }
            i++;
        }
    }
}
