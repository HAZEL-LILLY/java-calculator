
import java.util.Scanner; 
public class calculator {
    public static void main(String[] args){
        for (int i=0;i<=100;i++){
            Scanner myobject =new Scanner(System.in);
        System.out.println("1.additional ");
        System.out.println("2.multiplication ");
        System.out.println("3.subtraction ");
        System.out.println("4.division ");
        System.out.print("Enter choise your number: ");
        int  choise = myobject.nextInt();
        System.out.print("Enter first intiger number: ");
        int  n = myobject.nextInt();
        System.out.print("Enter secount intiger number: ");
        int x = myobject.nextInt();
        if (choise==1){
            add(n,x);
        }
        else if (choise==2){
            multple(n,x);
        }
        else if (choise==3){
            sub(n,x);
        }
        else if (choise==4){
            division(n,x);
        }
        
        else{
            System.out.println("invilit number:");
        }



        }
        
}
    public static void add (int a , int b){
        System.out.print("result is = ");
         System.out.println( a+b);

}
public static void multple (int a , int b){
         
    System.out.println("result is = "+a*b);

}
public static void sub (int a , int b){
    System.out.print("result is = ");
    System.out.println(a-b);

}
public static void division (int a , int b){
         
    System.out.println("result is = " +a/b);

}

}