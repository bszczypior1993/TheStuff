public class CurrencyConverter {

    Currency currency;

    enum Currency {
        EUR,
        USD,
        GBP

    }

    BuyOrSellPLN buyOrSellPLN;

    ExchangeRate exchangeRate;

    enum BuyOrSellPLN {
        BUY_PLN,
        SELL_PLN

    }

    public Currency getCurrency() {
        return currency;
    }

    public BuyOrSellPLN getBuyOrSellPLN() {
        return buyOrSellPLN;
    }

    public CurrencyConverter(Currency currency, BuyOrSellPLN buyOrSellPLN, ExchangeRate exchangeRate) {
        this.currency = currency;
        this.buyOrSellPLN = buyOrSellPLN;
        this.exchangeRate = exchangeRate;
    }

    public double returnConversion(double PLNinput) {
        double conversionRate = exchangeRate.returnExchangeRate(currency, buyOrSellPLN);
        switch (buyOrSellPLN) {
            case BUY_PLN:
                return PLNinput * conversionRate;

            case SELL_PLN:
                return PLNinput / conversionRate;
        }
        return -1;
    }
}