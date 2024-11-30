package com.esde.classifier;

import com.esde.type.TriangleType;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
        //usage example
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();
        System.out.println(classifyTriangle(a, b ,c));
    }

    public static TriangleType classifyTriangle(int a, int b, int c) {

        if (a + b <= c || a + c <= b || b + c <= a) {
            return TriangleType.NOT_TRIANGLE;
        }

        if (a == b && b == c){
            return TriangleType.EQUILATERAL_TRIANGLE;
        }

        if (a == b || b == c || a == c) {
            return TriangleType.ISOSCELES_TRIANGLE;
        }

        return TriangleType.SCALENE_TRIANGLE;
    }

}
