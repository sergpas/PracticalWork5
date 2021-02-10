package com.alfa.work53;

public class Main {
    public static void main(String[] args) {
        String inString = "An information  system  is  designed  to  collect,  process, store and distribute information";
        int i = inString.indexOf(' ');
        int j = inString.lastIndexOf(' ');
        String outString = inString.substring(j+1)+inString.substring(i,j+1)+inString.substring(0,i);
        System.out.println(inString);
        System.out.println(outString);
    }
}
