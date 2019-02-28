package Exercises;

//Create an application that simulates a calculator:
//
//        The application should have two modes: Basic and Expert
//        The application should be able to add/substract/multiply/divide any number of integers, longs, doubles
//        The expert calculator should have the pow, root, n factorial; extra from the basic one
//        The calculators can be started with a desired number of floating points. By default it starts with 10 floating points
//        The advanced calculator can also evaluate string expressions, eg: 3+2*4


public class BasicCalculatorImpl implements BasicCalculator{

// 1st way
//    @Override
//    public Long add(Integer a, Integer b) {
//        return Long.valueOf(a+b);
//    }

    @Override
    public Long add(Integer... array) {  //replaced [] with ...  -> variable list
        Long sum = 0L;
        for (Integer number: array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Long add(Long... array) {
        Long sum = 0L;
        for (Long number: array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Double add(Double... array) {
        Double sum = 0d;
        for (Double number: array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Long multiply(Integer... array) {
        Long multiply = 1L;
        for (Integer number: array) {
            multiply *= number;
        }
        return multiply;
    }

    @Override
    public Long multiply(Long... array) {
        Long multiply = 1L;
        for (Long number: array) {
            multiply *= number;
        }
        return multiply;
    }

    @Override
    public Double multiply(Double... array) {
        Double multiply = 1d;
        for (Double number: array) {
            multiply *= number;
        }
        return Double.valueOf(multiply);
    }

    @Override
    public Long subtract(Integer... array) {
        Long subs = 0L;
        for (Integer number: array) {
            subs -= number;
        }
        return subs;
    }

    @Override
    public Long subtract(Long... array) {
        Long subs = 0L;
        for (Long number: array) {
            subs -= number;
        }
        return subs;
    }

    @Override
    public Double subtract(Double... array) {
        Double subs = array[0];
        for (int i=1; i<array.length; i++) {
            subs -= array[i];
        }
        return Double.valueOf(subs);

    }

    @Override
    public Long divide(Integer... array) {
        Long div = 1L;
        for (Integer number: array) {
            div /= number;
        }
        return div;
    }

    @Override
    public Long divide(Long... array) {
        Long div = 1L;
        for (Long number: array) {
            div /= number;
        }
        return div;
    }

    @Override
    public Double divide(Double... array) {
        Double div = 1d;
        for (Double number: array) {
            div /= number;
        }
        return div;
    }

}

