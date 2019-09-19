
import java.util.Scanner;

public class Ch5 {
    public static void main(String[] args) {
        
       addTwoNumbersAndPrint(1,2);
       
       addTwoNumbersAndPrint(5,5);
       
       System.out.print("Enter two numbers to add together: ");
       Scanner keyboard = new Scanner(System.in);
       
       double firstNumber = keyboard.nextDouble();
       double secondNumber = keyboard.nextDouble();
       
       addTwoNumbersAndPrint(firstNumber, secondNumber);
       
        
    }
    
    public static void addTwoNumbersAndPrint(double firstNumber, double secondNumber)
    {
        double sum = firstNumber + secondNumber;
        
        System.out.println("The sum is: " + sum);
                
    }
}
