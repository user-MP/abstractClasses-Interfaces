package org.example;

public class Main {
    public static void main(String[] args) {


        BackSequence backWord=new BackSequence("United States");


        System.out.println(backWord.toString());

        System.out.println(backWord.charAt(1));

        System.out.println(backWord.subSequence(4,11));

        System.out.println(backWord.length());


    }
}