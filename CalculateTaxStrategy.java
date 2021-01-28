package behavioral.strategy3;

import java.util.List;

public abstract class CalculateTaxStrategy {

    abstract List<Double> calculateTax(List<Double> prices);
}
