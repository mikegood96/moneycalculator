package moneycalculator.persistence;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

/**
 * @author Michael Bueno
 */
public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to);
}
