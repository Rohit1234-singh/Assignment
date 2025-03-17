package com.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isAngrm(String str1, String str2){
        str1=str1.toLowerCase().replace("\\s","");
        str2=str2.toLowerCase().replace("\\s","");

        if(str1.length()!=str2.length()){
            return false;
        }

        char[]charArry1=str1.toCharArray();
        char[]charArry2=str2.toCharArray();

        Arrays.sort(charArry1);
        Arrays.sort(charArry2);

        return Arrays.equals(charArry1,charArry2);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First String here");
        // listen
        String str1= sc.nextLine();

        System.out.println("Enter the second String here");
        String str2= sc.nextLine();
        //silent

        if(isAngrm(str1,str2)){
            System.out.println(" this is an Angram String");
        } else{
            System.out.println("this is not an Angram String");
        }
    }
}
