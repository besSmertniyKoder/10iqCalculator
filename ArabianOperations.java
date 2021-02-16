public class ArabianOperations extends NumbersAbstract {
    public String toString(){
        return getterForResult() + "";
    }

    public static int value1;
    public static int value2;
    public static int result3;

    public ArabianOperations() {
        super();
    }

    void Arabic(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public void plus() {
        this.result3 = value1 + value2;

    }


    public void minus() {
        this.result3 = value1 - value2;
    }


    public void multi() {
        this.result3 = value1 * value2;

    }


    public void divide() {
        try {
            this.result3 = value1 / value2;
        } catch (ArithmeticException e) {
            System.out.println("Вы поделили на ноль!");
        }


    }

    public String getterForString() {
        return "" + result3;

    }

    public int getterForResult() {
        return result3;

    }
    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
    public void setResult(int result3) {
        this.result3 = result3;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }


}
