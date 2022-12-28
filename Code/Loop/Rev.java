import java.util.Scanner;

public class Rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Reverse(n);
    }

    static void Reverse(int n){
        while(n>0){
            int rem = n%10;
            System.out.println(rem);

            n=n/10;
        }
        
    }
}