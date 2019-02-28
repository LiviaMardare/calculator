package Exercises;

public interface BasicCalculator {

    Long add(Integer... array ); //replaced [] with ...
    Long add(Long... array);
    Double add(Double... array);


    Long multiply(Integer... array);
    Long multiply(Long... array);
    Double multiply(Double... array);

    Long subtract(Integer... array);
    Long subtract(Long... array);
    Double subtract(Double... array);

    Long divide(Integer... array);
    Long divide(Long... array);
    Double divide(Double... array);




}
