package Algorithms;

import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        String num=input.nextLine();
        String reversed = new StringBuilder(num).reverse().toString();
        
        System.out.println(reversed);
        input.close();
    }
}