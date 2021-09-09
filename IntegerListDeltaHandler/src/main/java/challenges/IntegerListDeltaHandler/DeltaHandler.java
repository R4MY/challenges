package challenges.IntegerListDeltaHandler;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DeltaHandler
{
    // always receives nonempty list with even amount of positive integer elements
    public static double getAverage(List<Integer> integers)
    {
        return (double) (getMin(integers) + getMax(integers)) / 2;
    }

    // always receives nonempty list with even amount of positive integer elements
    public static int getMin(List<Integer> integers)
    {
        List<Integer> integersCopy = new ArrayList<>(integers);

        Collections.sort(integersCopy);

        int minBias = 0;

        for (int i = 0; i <= integersCopy.size() - 2; i += 2)
        {
            minBias += integersCopy.get(i + 1) - integersCopy.get(i);
        }

        return minBias;
    }

    // always receives nonempty list with even amount of positive integer elements
    public static int getMax(List<Integer> integers)
    {
        List<Integer> integersCopy = new ArrayList<>(integers);

        Collections.sort(integersCopy);

        int maxBias = 0;

        int j = integersCopy.size() - 1;

        for (int i = 0; i < integersCopy.size() / 2; i++)
        {
            maxBias += integersCopy.get(j) - integersCopy.get(i);
            j--;
        }

        return maxBias;
    }
}
