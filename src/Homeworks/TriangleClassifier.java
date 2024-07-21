package Homeworks;


import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side one length");
        int side_a = sc.nextInt();
        System.out.println("Enter side two length");
        int side_b = sc.nextInt();
        System.out.println("Enter side three length");
        int side_c = sc.nextInt();
        if(side_a == side_b && side_a == side_c){
            System.out.println("equilateral triangle");

        }else if(side_a == side_b || side_a == side_c || side_b == side_c){
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Scalene Triangle");
        }

        sc.close();
    }
}
