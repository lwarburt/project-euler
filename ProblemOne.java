package com.company;

public class ProblemOne {
    public static void main(String[] args) {
        System.out.println(multOfFive() + multOfThree() - multOfFifteen());
    }

    public static int multOfThree() {
        int n = 1;
        int three = 0;
        while (n * 3 < 1000) {
            three = n * 3 + three;
            n++;
        }
        return three;
    }

    public static int multOfFive() {
        int n = 1;
        int five = 0;
        while (n * 5 < 1000) {
            five = n * 5 + five;
            n++;
        }
        return five;
    }

    public static int multOfFifteen() {
        int n = 1;
        int fifteen = 0;
        while (n * 15 < 1000) {
            fifteen = n * 15 + fifteen;
            n++;
        }
        return fifteen;
    }
}

