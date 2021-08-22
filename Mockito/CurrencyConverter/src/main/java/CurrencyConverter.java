public class CurrencyConverter implements ExchangeRate {

//    public static void main(String[] args) {
//        CurrencyConverter currencyConverter = new CurrencyConverter(Currency.EUR, BuyOrSellPLN.BUY_PLN, 4);
//        System.out.println(currencyConverter.returnConversion());
//    }

    Currency currency;

    enum Currency {
        EUR,
        USD,
        GBP

    }

    BuyOrSellPLN buyOrSellPLN;

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

    public double getPLNinput() {
        return PLNinput;
    }

    public CurrencyConverter(Currency currency, BuyOrSellPLN buyOrSellPLN, double PLNinput) {
        this.PLNinput = PLNinput;
        this.currency = currency;
        this.buyOrSellPLN = buyOrSellPLN;
    }

    double PLNinput;
    double EURSellRate;
    double EURBuyRate;
    double USDSellRate;
    double USDBuyRate;
    double GBPSellRate;

    double GBPBuyRate;

    double conversionRate;

    @Override
    public double returnExchangeRate(Currency currency, BuyOrSellPLN buyOrSellPLN) {

        if (currency == Currency.EUR && buyOrSellPLN == BuyOrSellPLN.BUY_PLN) {
            conversionRate = EURSellRate;
        } else if (currency == Currency.EUR && buyOrSellPLN == BuyOrSellPLN.SELL_PLN) {
            conversionRate = EURBuyRate;
        } else if (currency == Currency.USD && buyOrSellPLN == BuyOrSellPLN.BUY_PLN) {
            conversionRate = USDSellRate;
        } else if (currency == Currency.USD && buyOrSellPLN == BuyOrSellPLN.SELL_PLN) {
            conversionRate = USDBuyRate;
        } else if (currency == Currency.GBP && buyOrSellPLN == BuyOrSellPLN.BUY_PLN) {
            conversionRate = GBPSellRate;
        } else if (currency == Currency.GBP && buyOrSellPLN == BuyOrSellPLN.SELL_PLN) {
            conversionRate = GBPBuyRate;
        }
        return conversionRate;
    }
    public double getConversionRate(){
        return conversionRate;
    }

    public double returnConversion(Currency currency, BuyOrSellPLN buyOrSellPLN, double PLNinput) {
        returnExchangeRate(currency, buyOrSellPLN);
        double conversionResult = 0;
        switch (buyOrSellPLN) {
            case BUY_PLN:
                conversionResult = PLNinput * conversionRate;
                return conversionResult;

            case SELL_PLN:
                conversionResult = PLNinput / conversionRate;
                return conversionResult;
        }
        return conversionResult;
    }
}