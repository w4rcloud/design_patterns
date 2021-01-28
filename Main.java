package behavioral.strategy3;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(new CalculateTaxStrategyPoland());
        Order order2 = new Order(new CalculateTaxStrategyGermany());
        order.calculateTax();
        System.out.println();
        order2.calculateTax();

//        Double d = 10.0;
//        System.out.println(d + 10);
    }
}
