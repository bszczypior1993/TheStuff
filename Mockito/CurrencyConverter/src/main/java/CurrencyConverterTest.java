import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CurrencyConverterTest {

    @Test
    void shouldConfirmCurrencyConversion() {
        //given
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        CurrencyConverter testCurrencyConverter = new CurrencyConverter(CurrencyConverter.Currency.EUR, CurrencyConverter.BuyOrSellPLN.SELL_PLN, mockedExchangeRate);
        Mockito.when(mockedExchangeRate.returnExchangeRate(testCurrencyConverter.getCurrency(), testCurrencyConverter.getBuyOrSellPLN())).thenReturn(3.00);
        //when
        double result = testCurrencyConverter.returnConversion(9);
        Assertions.assertEquals(result, 3);

    }
}