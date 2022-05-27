class MyAccounting {
    public static double valueOfSupply;
    public static double vatRate = 0.1;
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class Practicebusiness3 {
    public static void main(String[] args) {
        MyAccounting.valueOfSupply = 10000.0;
        System.out.println("Value of Supply : " + MyAccounting.valueOfSupply);
        System.out.println("VAT: " + MyAccounting.getVAT());
        System.out.println("Total: " + MyAccounting.getTotal());
    }
}
