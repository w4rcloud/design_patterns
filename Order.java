package behavioral.strategy3;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Double> aListOfPrices;
    CalculateTaxStrategy taxStrategy;

    public Order(CalculateTaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
        aListOfPrices = new ArrayList<>();
        aListOfPrices.add(12.25);
        aListOfPrices.add(22.75);
        aListOfPrices.add(50.99);
        aListOfPrices.add(120.00);
        aListOfPrices.add(125.50);
    }

    public List<Double> calculateTax(){
        aListOfPrices.forEach(System.out::println);
        taxStrategy.calculateTax(aListOfPrices);
        aListOfPrices.forEach(System.out::println);
        return aListOfPrices;
    }
}
