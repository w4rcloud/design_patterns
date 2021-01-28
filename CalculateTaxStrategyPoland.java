package behavioral.strategy3;

import java.util.List;
import java.util.ListIterator;

class CalculateTaxStrategyPoland extends CalculateTaxStrategy {

    @Override
    List<Double> calculateTax(List<Double> prices) {
//        prices.forEach(p -> p += 10);
//        System.out.println(prices.get(0));
        for (int i = 0; i < prices.size(); i++) {
            prices.set(i, prices.get(i) * 100);
//        for (Double d : prices) {
//            prices.s *= 10;
        }
//        System.out.println(prices.get(0));
        return prices;
    }
}

