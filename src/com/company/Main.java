package com.company;

import java.util.Scanner;

public class Main {

    char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};

    public int arrayIndexOf(char[] arrayIn, char input){
        for(int i = 0; i < arrayIn.length; i++){
            if (arrayIn[i] == input){
                return i;
            }
        }
        return -1;
    }

    public int charToNum(char input) {
        if (!(input == ' ')) {
            return arrayIndexOf(alphabet, input) + 1;
        } else return 0;
    }

    public char numToChar(int input) {
        if (!(input == 0)) {
            return alphabet[input - 1];
        } else return ' ';
    }

    public void execute(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type character to be converted: ");
        char charInput = sc.nextLine().toUpperCase().charAt(0);
        System.out.println("Character to number: " + charToNum(charInput));
        System.out.print("Type number to be converted: ");
        int intInput = sc.nextInt();
        System.out.println("Number to character: " + numToChar(intInput));
    }

    public static void main(String[] args) {
        new Main().execute();
    }
}
