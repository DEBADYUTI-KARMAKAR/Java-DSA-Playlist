import java.util.*;
public class Using3rd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        System.out.println("Value of A "+a+" Value of B "+b);
        c=a;
        a=b;
        b=c;
        
        System.out.println("Value of A "+a+" Value of B "+ b);

    }
}