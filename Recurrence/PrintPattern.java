/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        while(test > 0){
            int patternN = s.nextInt();
            num.add(patternN);
            test--;
        }
        for (Integer num1:num ) {
            PrintPattern(num1);
            System.out.println();
        }
    }

    public static void PrintPattern(int n){
        if(n > 0){
            //first half
            System.out.print(n+" ");
            PrintPattern(n-5);
            //second half
            System.out.print(n+" ");
        }
        else
            //Base condition
            System.out.print(n+" ");
    }   
    
}
