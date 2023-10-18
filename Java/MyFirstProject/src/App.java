import java.util.Arrays;
import java.util.Date;
import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        byte age = 30;
        int viewsCount = 123_456_789;
        long viewsCountLong = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        Date now = new Date();
        now.getTime();

        System.out.println(now);

        String message = "Hello World" + "!!";
        //methods return new string object and do not modify the original string
        //strings are immutable
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message);

        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));  
        System.out.println(message.replace("!", "*"));

        //escape sequences
        // \n new line
        // \t tab
        // \\ backslash
        System.out.println("C:\\Windows\\...");

        //arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); //prints memory address
        System.out.println(numbers[0]); //prints 1
        System.out.println(numbers[1]); //prints 2
        System.out.println(numbers[2]); //prints 0 set to 0 by default

        int[] numbers2 = { 2, 3, 5, 1, 4 };
        System.out.println(numbers2.length); //prints 5

        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); //prints [1, 2, 3, 4, 5]

        //multi-dimensional arrays
        int[][] numbers3 = new int[2][3];
        numbers3[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3)); //prints [[1, 0, 0], [0, 0, 0]] deep to string for multi-dimensional arrays

        int[][] numbers4 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(numbers4)); //prints [[1, 2, 3], [4, 5, 6]]

        //constants
        final float PI = 3.14F;//final makes it a constant

        //arithmetic expressions
        int result = 10 / 3;
        System.out.println(result); //prints 3

        double result2 = (double)10 / (double)3;
        System.out.println(result2); //prints 3.3333333333333335

        int x = 1;
        int y = x++;
        System.out.println(x); //prints 2
        System.out.println(y); //prints 1

        int x2 = 1;
        int y2 = ++x2;
        System.out.println(x2); //prints 2
        System.out.println(y2); //prints 2

        //augmented assignment operator
        // int x3 = 1;
        // x3 += 2; //x = x + 2

        //order of operations
        int x3 = 10 + 3 * 2;//order of operations is * then + so 16
        int x4 = (10 + 3) * 2;//order of operations is () then * so 26
        
        //implicit casting
        //byte > short > int > long > float > double
        short x5 = 1;
        int y5 = x5 + 2;
        System.out.println(y5); //prints 3

        double x6 = 1.1;
        double y6 = x6 + 2; //2 is implicitly cast to 2.0
        System.out.println(y6); //prints 3.1

        //explicit casting
        double x7 = 1.1;
        int y7 = (int)x7 + 2; //1.1 is explicitly cast to 1
        System.out.println(y7); //prints 3

        String x8 = "1";
        int y8 = Integer.parseInt(x8) + 2;//str 1 is explicitly cast to int 1
        System.out.println(y8); //prints 3

        String x9 = "1.1";
        double y9 = Double.parseDouble(x9) + 2;//str 1.1 is explicitly cast to double 1.1
        System.out.println(y9); //prints 3.1

        //Math class
        int result3 = Math.round(1.1F);//rounds to nearest int
        //returns long

        System.out.println(result3); //prints 1

        int result4 = (int)Math.ceil(1.1F);//rounds up to higher int
        System.out.println(result4); //prints 2

        int result5 = (int)Math.floor(1.1F);//rounds down to lower int
        System.out.println(result5); //prints 1

        int result6 = Math.max(1, 2);//returns higher number
        int result7 = Math.min(1, 2);//returns lower number
        double result8 = Math.random();//returns random number between 0 and 1

        int result9 = (int)Math.round(Math.random() * 100);//returns random number between 0 and 100
        //int casting as Math.round returns long

        System.out.println(result9); //prints random number between 0 and 100

        int result10 = (int)Math.random() * 100;//returns 0 as int casting happens first

        System.out.println(result10); //prints 0

        //formatting numbers
        // NumberFormat currency = new NumberFormat();// NumberFormat is abstract so cannot be instantiated 
        // NumberFormat currency = new NumberFormat.getCurrencyInstance();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result11 = currency.format(1234567.891);
        System.out.println(result11); //prints $1,234,567.89

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result12 = percent.format(0.1);
        System.out.println(result12); //prints 10%

        String percent2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent2); //prints 10%

        // reading input
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Age: ");
        // // System.out.println("Age:");//not used because newline is added from println
        // byte age2 = scanner.nextByte();
        // System.out.println("You are " + age2);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name: ");
        //next takes first word only
        String name = scanner2.nextLine().trim();//trim removes whitespace
        System.out.println("You are " + name);





        
    }
}
