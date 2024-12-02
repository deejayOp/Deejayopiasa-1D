import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();   
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);

          if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        scanner.close();
    }
}