package com.example;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // BUG: null pointer risk
    public static String getLength(String s) {
        return "Length: " + s.length();
    }

    // BUG: empty catch block (SonarQube critical issue)
    public static void riskyMethod() {
        try {
            int[] arr = new int[5];
            arr[10] = 1;
        } catch (Exception e) {
            // do nothing - this is intentionally bad
        }
    }

    // BUG: hardcoded credentials (SonarQube security hotspot)
    private static String password = "admin123";
    private static String secretKey = "hardcoded-secret-key-12345";

    // BUG: dead/unreachable code
    public static int deadCode(int x) {
        if (x > 0) {
            return x;
        } else {
            return -x;
        }
        // unreachable
    }

    public static void main(String[] args) {
        System.out.println("CI Demo App");
        System.out.println("2 + 3 = " + add(2, 3));
        riskyMethod();
    }
}
