import java.util.Scanner;

public class Count_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Count(n);
    }

    static void Count(int n){

        int count = 0;
        while (n>0){
            count++;
            n=n/10;
        }
        System.out.println("Count is:"+count);
    }
}