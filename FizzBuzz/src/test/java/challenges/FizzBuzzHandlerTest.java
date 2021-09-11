package challenges;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzHandlerTest
{
    @Autowired
    FizzBuzzHandler fizzBuzzHandler;

    @ParameterizedTest
    @CsvSource({
            "3",
            "6",
    })
    void returnFizzBuzz_Fizz(int number)
    {
        assertEquals("Fizz", fizzBuzzHandler.returnFizzBuzz(number));
    }

    @ParameterizedTest
    @CsvSource({
            "5",
            "10",
    })
    void returnFizzBuzz_Buzz(int number)
    {
        assertEquals("Buzz", fizzBuzzHandler.returnFizzBuzz(number));
    }

    @ParameterizedTest
    @CsvSource({
            "15",
            "30",
    })
    void returnFizzBuzz_FizzBuzz(int number)
    {
        assertEquals("FizzBuzz", fizzBuzzHandler.returnFizzBuzz(number));
    }

    @ParameterizedTest
    @CsvSource({
            "1",
            "7",
    })
    void returnFizzBuzz_Number(int number)
    {
        assertEquals(String.valueOf(number), fizzBuzzHandler.returnFizzBuzz(number));
    }
}