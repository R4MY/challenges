package challenges;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzHandler
{
    private final String fizzMessage;
    private final String buzzMessage;
    private final String fizzBuzzMessage;
    private final int fizzNum;
    private final int buzzNum;

    public FizzBuzzHandler(@Value("${outputMessages.fizz}") String fizzMessage,
                           @Value("${outputMessages.buzz}") String buzzMessage,
                           @Value("${outputMessages.fizzBuzz}") String fizzBuzzMessage,
                           @Value("${divisibleByNumbers.fizz}") Integer fizzNum,
                           @Value("${divisibleByNumbers.buzz}") Integer buzzNum)
    {
        this.fizzMessage = fizzMessage;
        this.buzzMessage = buzzMessage;
        this.fizzBuzzMessage = fizzBuzzMessage;
        this.fizzNum = fizzNum;
        this.buzzNum = buzzNum;
    }

    public String returnFizzBuzz(int number)
    {
        boolean isFizzable = number % fizzNum == 0;
        boolean isBuzzable = number % buzzNum == 0;

        if (isFizzable && isBuzzable)
            return fizzBuzzMessage;
        else if (isBuzzable)
            return buzzMessage;
        else if (isFizzable)
            return fizzMessage;
        else
            return String.valueOf(number);
    }

    public void print(int number)
    {
        boolean isFizzable = number % fizzNum == 0;
        boolean isBuzzable = number % buzzNum == 0;

        if (isFizzable && isBuzzable)
            System.out.println(fizzBuzzMessage);
        else if (isBuzzable)
            System.out.println(buzzMessage);
        else if (isFizzable)
            System.out.println(fizzMessage);
        else
            System.out.println(number);
    }
}
