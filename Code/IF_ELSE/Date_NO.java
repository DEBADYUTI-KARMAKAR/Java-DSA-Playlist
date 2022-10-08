import java.util.Scanner;
public class Date_NO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day Number");
        int no_d = sc.nextInt();
        if(no_d == 1){
            System.out.println("Sunday");
        }
        else if(no_d == 2){
            System.out.println("Monday");
        }
         else if(no_d == 3){
            System.out.println("Tuesday");
        }
         else if(no_d == 4){
            System.out.println("Wednesday");
        }
         else if(no_d == 5){
            System.out.println("Thursday");
        }
         else if(no_d == 6){
            System.out.println("Friday");
        }
         else if(no_d == 7){
            System.out.println("Saturday");
        }else{
            System.out.println("Enter Right choice");
        }

    }
}