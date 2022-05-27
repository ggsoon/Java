


public class Practicemethod {


    public static void main(String[] args) {
        // 한줄 복사 ctrl + D   줄 이동 alt + shift + up or down   정렬 ctrl + alt + l
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;
        print();
        // 다른 변수와 메소드가 있다면 생산성 저하 할수 있으므로 클래스 분리 필요.
    }

    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    public static void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDivided1());
        System.out.println("Dividend 2 : " + getDivided2());
        System.out.println("Dividend 3 : " + getDivided3());
    }

    public static double getDivided3() {
        return getIncome() * 0.2;
    }

    public static double getDivided2() {
        return getIncome() * 0.3;
    }

    public static double getDivided1() {
        return getIncome() * 0.5;
    }

    public static double getIncome() {
        return valueOfSupply - getExpense();
    }

    public static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
}