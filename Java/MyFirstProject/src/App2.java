public class App2 {
    public static void main(String[] args) throws Exception {

        //comparison operators
        int x = 1;
        int y = 2;
        System.out.println(x <= y); //prints true
        System.out.println(x == y); //prints false
        System.out.println(x != y); //prints true
        System.out.println(x > y); //prints false

        //logical operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm); //prints true

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible2 = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible2); //prints true

        //if statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }

        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } 
        else if (temp > 20) // temp<=30 not necessary as failing 1st condition automatically implies it
            System.out.println("Beautiful day");
        else 
            System.out.println("Cold day");

            // {} can be avoided if only one statement in if


        int income = 120_000;
        boolean hasHighIncome2;
        if (income > 100_000)
            hasHighIncome2 = true;
        else
            hasHighIncome2 = false;

        hasHighIncome2 = (income > 100_000); //same as above
        System.out.println(hasHighIncome2); //prints true
        
        //ternary operator
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);//prints First
        
        //switch statement
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        } 
    }
}
