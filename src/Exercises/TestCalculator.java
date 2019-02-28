package Exercises;

public class TestCalculator {

    public static void main(String[] args) {
        BasicCalculator bCalc = new BasicCalculatorImpl();

        //  System.out.println("= " + bCalc.add(1,2)); - 1st way

        // Integer[] array = {1,2,3};
        // Long result = bCalc.add(array);

        //using ... we can declare easier the array:
        Long result = bCalc.add(1, 2, 3);
        System.out.println("= " + result);

        //---------------Expert
        System.out.println("-------------Expert calculator ---------------");
        ExpertCalculator exCalc = new ExpertCalculatorImpl();

        System.out.println("= " + exCalc.pow(2,3));

        System.out.println("factorial de 3 = " + exCalc.factorial(3));
        System.out.println("= " + exCalc.root(9));

        Double div = bCalc.divide(4.0,2.0);
        System.out.println("= " +div);

        Long div1 = bCalc.divide(4,2);
        System.out.println("= " +div1);

        //---------------Expert - string
        //The advanced calculator can also evaluate string expressions, eg: 3+2*4
        System.out.println("------------String evaluate--------------");
        System.out.println("2+3 = " + exCalc.evaluate("2+3"));
        System.out.println("3*4 = " + exCalc.evaluate("3*4"));
        System.out.println("2/5 = " + exCalc.evaluate("2/5"));
        System.out.println("4-2 = " + exCalc.evaluate("4-2"));
        System.out.println("2+3+4 = " + exCalc.evaluate("2+3+4"));
        System.out.println("2*3-4 = " + exCalc.evaluate("2*3-4"));
        System.out.println("4*2-3 = " + exCalc.evaluate("4*2-3"));
        System.out.println("2+3*4 = " + exCalc.evaluate("2+3*4"));
        System.out.println("(2+3)*4 = " + exCalc.evaluate("(2+3)*4"));


    }




}
