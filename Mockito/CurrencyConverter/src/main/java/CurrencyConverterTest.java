import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    @Test
    void shouldConfirmCurrencyConversion() {
        //given
        CurrencyConverter testCurrencyConverter = new CurrencyConverter(CurrencyConverter.Currency.EUR, CurrencyConverter.BuyOrSellPLN.SELL_PLN, 3.50);
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        Mockito.when(mockedExchangeRate.returnExchangeRate(testCurrencyConverter.getCurrency(), testCurrencyConverter.getBuyOrSellPLN())).thenReturn(9.00);
        //when
        testCurrencyConverter.returnConversion(testCurrencyConverter)


    }
}