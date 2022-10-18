public class MethodEx{
    public static void main(String[] args) {
        //call
        // P();
        // System.out.println("///////////////////////////////////");
        // P();
        Sum();
        int c = Sum1();
        System.out.println("Sum1:"+c);

        /*------ */

        int k = 45;
        int z = 45;
        Sum2(k,z);

        /*----------------- */

        int g = Sum3(k, z);
        System.out.println("Takes something returns something (Sum)"+g);


    }
    // takes nothing returns nothing
    // function/methon define
    public static void P(){
        System.out.println("Debadyuti");
    }

    public static void Sum(){
        int a = 10;
        int b = 5;
        int c = a+b;
        System.out.println("Sum is"+c);
    }

    //takes nothing returns something

    public static int Sum1(){
        int a = 10;
        int b = 1;
        // int c = a+b;
        // return c;
        return a+b;
    }

    // takes something returns nothing
    public static void Sum2(int a,int b){
        int k = a+b;
        System.out.println(k);
        System.out.println(a+b);
       
    }

    // takes something returns returns something

    public static int Sum3(int a,int b){
        int k = a+b;
        return k;
       
    }


}