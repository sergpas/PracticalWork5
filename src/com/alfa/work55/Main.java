package com.alfa.work55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inString = scan.nextLine();
        int idxCurChar = 0;
        System.out.println("Unique Bytes: ");
        while (idxCurChar < inString.length()) {
            char curChar = inString.charAt(idxCurChar);
            if (inString.indexOf(curChar) == inString.lastIndexOf(curChar)) {
                System.out.println(curChar + " ");
            }
            idxCurChar++;
        }
    }
}
