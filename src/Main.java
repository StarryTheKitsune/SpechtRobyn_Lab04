public class Main {
    public static void main(String[] args)
    {
        int intOperandA = 44;
        int intOperandB = 23;

        int intSum = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intDifference = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleOperandA = 44.44;
        double doubleOperandB = 23.23;

        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleQuotient = 0;
        double doubleDifference = 0;
        double doubleModulo = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The remainder of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

        //currency is not done in int, it is done in double
        //examples of variables

        double subscriptionCost = 14.00;
        boolean isSubscribed = true;
        int numOfFreeCompanyMembers = 6;

        //I couldn't find out how to use String variable type.

    }
}