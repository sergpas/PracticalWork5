package com.alfa.work53;

public class Main {
    public static void main(String[] args) {
        String inString = "An information  system  is  designed  to  collect,  process, store and distribute information";
        int idxFirstWorld = inString.indexOf(' ');
        int idxLastWorld = inString.lastIndexOf(' ');
        String lastWorld = inString.substring(idxLastWorld + 1);
        String middleText = inString.substring(idxFirstWorld, idxLastWorld + 1);
        String firstWorld = inString.substring(0, idxFirstWorld);
        String outString =  lastWorld + middleText + firstWorld;
        System.out.println(inString);
        System.out.println(outString);
    }
}
