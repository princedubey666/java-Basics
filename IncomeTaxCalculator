import java.util.*;
public class IncomeTaxCalculator{
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    float i , tax=0;
    System.out.println("Enter your income (in lakhs)");
    i = sc.nextFloat();
    
        if (i<=2.5){
            System.out.println(" you do not have to give tax little poor human.");
        }
        else if (i>2.5 && i<=5){
             tax = (i - 2.5f)*0.05f;
            System.out.println(" you have to give as tax : " + tax);
        }
        else if(i>5 && i<=10){
            tax = (i - 5f)*0.2f;
            System.out.println(" you have to give as tax : " + tax);
        }
        else if(i>10){
            tax = (i - 10f)*0.3f;
            System.out.println(" you have to give as tax : " + tax);
        }
    }
}
