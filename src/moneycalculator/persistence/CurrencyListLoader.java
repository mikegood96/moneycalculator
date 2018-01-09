package moneycalculator.persistence;

import moneycalculator.model.Currency;

/**
 * @author Michael Bueno
 */
public interface CurrencyListLoader {
    Currency[] currencies();
}
