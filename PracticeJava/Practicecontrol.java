public class Practicecontrol {

    public static void main(String[] args) {

        // 한줄 복사 ctrl + D   줄 이동 alt + shift + up or down

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double VAT = valueOfSupply * vatRate;
        double total = valueOfSupply + VAT;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        double[] dividedRates = new double[3];
        dividedRates[0] = 0.5;
        dividedRates[1] = 0.3;
        dividedRates[2] = 0.2;

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + VAT);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);

        int i = 0;
        if (income < 10000.0) {
            System.out.println("Dividend" + i + " : " + income);
            i = 1;
            while (i < dividedRates.length) {
                System.out.println("Dividend" + i + " : " + 0);
                i++;
            }
        } else {
            while (i < dividedRates.length) {
                System.out.println("Dividend" + i + " : " + income * dividedRates[i]);
                i++;
            }
        }
    }

}

