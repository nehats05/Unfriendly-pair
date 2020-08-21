package com.learnJava.CodeJam;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Toys {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();       //no of testcases
        while(testcases-- >0)
        {
            int n = scan.nextInt();   // n numbers
            int m = scan.nextInt();   //m unpaired numbers
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> sub = new ArrayList<>();
            for(int i = 0; i < m*2; i++)
            {
                list.add(scan.nextInt());          // to read the console input
            }
            for (int i = 0; i < m*2; i+=2) {
                ArrayList<Integer> subli = new ArrayList<>(list.subList(i,i+2));
                System.out.println(subli);          // divide the input in 2 pairs
                sub.add(subli);
            }
            System.out.println(list);
            System.out.println(sub);
            boolean flag=false;
            if((n%2 == 0))
            {
                for (int i = 0; i < sub.size() ; i++) {
                    if(compareElements(sub.get(i),sub.get(i+1)))        //compare pairs
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                /*if (flag)
                    System.out.println("YES");
                else System.out.println("NO");*/
            }
            else
                System.out.println("NO");
        }
    }

    private static boolean compareElements(ArrayList<Integer> integers, ArrayList<Integer> integers1) {
        if(integers.get(1).equals(integers1.get(0)))
            return true;
        else
            return false;
    }
}
