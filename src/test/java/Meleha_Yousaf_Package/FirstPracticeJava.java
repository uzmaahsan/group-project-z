package Meleha_Yousaf_Package;

import java.util.Scanner;

public class FirstPracticeJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Can you please input your name? ");
        int age  = scan.nextInt();
        System.out.println("What is your name?");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println("Hello!! "+name + " nice to meet you! ");
        System.out.println("Welcome to java programming ");
        System.out.println("I can't believe You are "+age+" years old, You look younger than your age!! ");
    }
}
