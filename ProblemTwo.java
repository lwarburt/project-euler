package com.company;

public class ProblemTwo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int total = 2;
        while (a < 4000000) {
            int c = a + b;
            if (c % 2 == 0) {
                total = c + total;
            }
            a = b;
            b = c;
        }
        System.out.println(total);
    }
}

