public class Practicebusiness {

    public static void main(String[] args) {

        // 한줄 복사 ctrl + D   한줄 이동 alt + shift + up or down

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double VAT = valueOfSupply * vatRate;
        double total = valueOfSupply + VAT;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double divided1 = income * 0.5;
        double divided2 = income * 0.3;
        double divided3 = income * 0.2;

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + VAT);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + divided1);
        System.out.println("Dividend 2 : " + divided2);
        System.out.println("Dividend 3 : " + divided3);

    }
}
