import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum is :"+sum);
    }
}
