//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int intOperandA = 12;
        int intOperandB = 10;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        double doubleOperandA = 6.5;
        double doubleOperandB = 5.5;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;


        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The Quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        System.out.println("\nBeginning of step 12.");

        int intKids = 2;
        boolean boolRain = true;
        double doubleGas = 5.7;
        int intFav = 7;
        double doubleShoe = 12.5;
        int intBirthMonth = 9;
        String stringName = "Ryan";

        System.out.println("The number of kids in my family: " + intKids);
        System.out.println("Is it raining: " + boolRain);
        System.out.println("The price of a gallon of gas: " + doubleGas);
        System.out.println("My favorite number: " + intFav);
        System.out.println("The size of my shoe: " + doubleShoe);
        System.out.println("My birth month is[1-12]: " + intBirthMonth);
        System.out.println("My name: " + stringName);

    }
}