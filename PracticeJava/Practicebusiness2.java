public class Practicebusiness2 {
    public static void main(String[] args) {

        double expenserate = 0.3; // 비용비율
        double vatrate = 0.1; // 이익비율

        Seller Seller1 = new Seller(Double.parseDouble(args[0])); // 판매자
        Taxservice ts = new Taxservice(Seller1.ValueOfsupply * vatrate); // 국세청
        Buyer buyer1 = new Buyer(Seller1.ValueOfsupply + ts.VAT); // 소비자
        double expense = Seller1.ValueOfsupply * expenserate; // 비용
        double income = Seller1.ValueOfsupply - expense; // 이익
        double total = Seller1.ValueOfsupply + ts.VAT; // 공급가 + 부가세

        Dividened dividend1 = new Dividened(income * Double.parseDouble(args[1])); // 배당을 받는 사람1
        Dividened dividend2 = new Dividened(income * Double.parseDouble(args[2])); // 배당을 받는 사람2
        Dividened dividend3 = new Dividened(income * Double.parseDouble(args[3])); // 배당을 받는 사람3


        System.out.println("Value of supply : " + Seller1.ValueOfsupply);
        System.out.println("VAT : " + ts.VAT);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1.Dividend);
        System.out.println("Dividend 2 : " + dividend2.Dividend);
        System.out.println("Dividend 3 : " + dividend3.Dividend);

    }
}

class Buyer {
    public double money; // 소비자의 돈

    public Buyer(double _money) {
        this.money = _money;
    }
}

class Seller {
    public double ValueOfsupply; // 공급가

    public Seller(double _ValueOfsupply) {
        this.ValueOfsupply = _ValueOfsupply;
    }
}

class Taxservice { // 국세청
    public double VAT; // 부가세

    public Taxservice(double _VAT) {
        this.VAT = _VAT;
    }
}

class Dividened {
    public double Dividend;

    public Dividened(double _dividend) {
        this.Dividend = _dividend;
    }
}