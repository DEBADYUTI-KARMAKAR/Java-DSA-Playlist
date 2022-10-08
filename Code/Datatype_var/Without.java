import java.util.*;
public class Without{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Value of A "+a+" Value of B "+b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("Value of A "+a+" Value of B "+ b);

    }
}