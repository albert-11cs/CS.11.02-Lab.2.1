/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Albert
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int methodOne = add(3, 8);
        System.out.println(methodOne);

        int methodTwo = add(3,8,4,9);
        System.out.println(methodTwo);

        String methodThree = morningGreeting("Toby Fox");
        System.out.println(methodThree);

        String methodFour = afternoonGreeting("Mac Miller");
        System.out.println(methodFour);

        String methodFive = triple("oohbaby");
        System.out.println(methodFive);

        double methodSix = half(17);
        System.out.println(methodSix);

        int methodSeven1 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(methodSeven1);
        int methodSeven2 = roundPositiveValueToNearestInteger(8.5);
        System.out.println(methodSeven2);

        int methodEight1 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(methodEight1);
        int methodEight2 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(methodEight2);

    }

    // 1. add

    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add

    public static int add(int w, int x, int y, int z) {
        return w + x + y + z;
    }

    // 3. morningGreeting

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting

    public static String afternoonGreeting(String nameTwo) {
        return "下午好, " + nameTwo + "!";
    }

    // 5. triple

    public static String triple(String inputOne) {
        return inputOne + inputOne + inputOne;
    }

    // 6. half

    public static double half(int skibidi) {
        return skibidi / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger

    public static int roundPositiveValueToNearestInteger(double positive) {
        return (int) Math.round(positive);
    }

    // 8. roundNegativeValueToNearestInteger

    public static int roundNegativeValueToNearestInteger(double negative) {
        negative = negative - 0.5;
        return (int) negative;
    }

}
