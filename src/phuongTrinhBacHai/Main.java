package phuongTrinhBacHai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Quadratic Equation: ");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);
        double delta = ptb2.getDiscriminant();
        if (delta>0){
            System.out.println("The Quadratic Equation has 2 roots:");
            System.out.printf("Root 1 = %.2f\n",ptb2.getRoot1());
            System.out.printf("Root 2 = %.2f\n",ptb2.getRoot2());
        } else if (delta==0) {
            System.out.printf("The Quadratic Equation has 1 roots is: %f",ptb2.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}