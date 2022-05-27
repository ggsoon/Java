class Accounting {
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    public void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDivided1());
        System.out.println("Dividend 2 : " + getDivided2());
        System.out.println("Dividend 3 : " + getDivided3());
    }

    public double getDivided3() {
        return getIncome() * 0.2;
    }

    public double getDivided2() {
        return getIncome() * 0.3;
    }

    public double getDivided1() {
        return getIncome() * 0.5;
    }

    public double getIncome() {
        return valueOfSupply - getExpense();
    }

    public double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }

    public double getVAT() {
        return valueOfSupply * vatRate;
    }
}

public class Practiceinstance {


    public static void main(String[] args) {
        // 한줄 복사 ctrl + D   줄 이동 alt + shift + up or down   정렬 ctrl + alt + l

        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();

        // 다른 변수와 메소드가 있다면 생산성 저하 할수 있으므로 클래스 분리 필요.
    }
}