import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 5 == 0 && number % 3 == 0)//most specific condition first
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        //alternative with less repitition but hard to read
        if (number % 5 == 0){
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        
    }
}
