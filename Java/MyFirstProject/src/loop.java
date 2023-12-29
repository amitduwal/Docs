import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        //for loop
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World " + i);

        for (int i = 1; i <= 5; i++)
            System.out.println("Hello World " + i);
        
        for (int i = 5; i >= 1; i--)
            System.out.println("Hello World " + i);

        //while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello World " + i);
            i++;
        }

        //while loop better for unknown number of iterations
        String input = "";
        Scanner scanner = new Scanner(System.in);//scanner is a resource that needs to be closed
        //so outside the loop
        // while (!input.equals("quit")) {
        //     System.out.print("Input: ");
        //     input = scanner.next().toLowerCase();
        //     System.out.println(input);
        // }
        // scanner.close();

        // do {
        //     System.out.print("Input: ");
        //     input = scanner.next().toLowerCase();
        //     if (!input.equals("quit"))
        //         System.out.println(input);
        // } while (!input.equals("quit"));

        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))//pass not displayed
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        } while (!input.equals("quit"));
        

        while (true) {//make sure break is used for infinite loops
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))//pass not displayed
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        scanner.close();

        //for each loop
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int j = 0; j < fruits.length; j++)
            System.out.println(fruits[j]);

        for (String fruit : fruits)
            System.out.println(fruit);

        //for each loop not suitable to iterate backwards
        for (int j = fruits.length - 1; j >= 0; j--)
            System.out.println(fruits[j]);

        // for (int j = 0; j < fruits.length; j++)
        //     fruits[j] = "Pineapple";

        //for each loop not suitable for modifying array
        // for (String fruit : fruits)
        //     fruit = "Pineapple";

    }
}
