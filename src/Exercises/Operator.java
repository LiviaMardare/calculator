package Exercises;

public enum Operator {
    ADD("\\+"),
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    PARENTHESES("(",")");

    private  String startSign;
    private  String endSign;
    private String sign;

    private Operator(String sign) {
        this.sign = sign;
    }

    private Operator(String startSign, String endSign) {
        this.startSign = startSign;
        this.endSign = endSign;
    }

    public String getSign() {
        return sign;
    }

    public static Operator[] getValues() {
        return new Operator[] {PARENTHESES,ADD,SUBTRACT,MULTIPLY,DIVIDE} ;
    }

    public String getStartSign() {
        return startSign;
    }

    public String getEndSign() {
        return endSign;
    }
}