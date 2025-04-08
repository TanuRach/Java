import java.util.Scanner;

public class ArithCalculator {
     public static void main(String[] args) {
        int x,y,z=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        x=scan.nextInt();
        System.out.println("Enter second number");
        y=scan.nextInt();
        System.out.println("Enter operator");
        String op=scan.next();
        scan.close();
        switch(op) {
            case "+":
            z=x+y;
            System.out.println("Result is "+z);
            break;
            case "-":
            z=x-y;
            System.out.println("Result is "+z);
            break;
            case "*":
            z=x*y;
            System.out.println("Result is "+z);
            break;
            case "/":
            if(y!=0){
                System.out.println("Division by zero not possible");
            }
            else{
                z=x/y;
                System.out.println("Result is "+z);
                break;
            }
                default:
                System.out.println("Error!");
                break;
     }
}
     }
    