package behavioral.strategy3;

import java.util.List;

public class CalculateTaxStrategyGermany extends CalculateTaxStrategy {
    
    @Override
    List<Double> calculateTax(List<Double> prices) {
//        prices.stream().forEach(System.out::println);
//        prices.stream().forEach(price -> price = price * -100); // czemu to nie działa? w klasycznym forEach też
//        nie aktualizował wartości
        for (int i = 0; i < prices.size(); i++) {
            prices.set(i, prices.get(i) * -100);
//            prices.stream().forEach(System.out::println);
        }
        return prices;
    }
}
