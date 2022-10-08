//import java.util.Scanner;
import java.util.*;

public class Userinput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int  a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum is"+c);
    }
}