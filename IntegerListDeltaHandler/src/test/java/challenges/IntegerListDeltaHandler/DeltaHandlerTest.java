package challenges.IntegerListDeltaHandler;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class DeltaHandlerTest
{

    @ParameterizedTest
    @MethodSource("getMin")
    void getMin(List<Integer> integers, int expected)
    {
        assertEquals(expected, DeltaHandler.getMin(integers));
    }

    private static Stream<Arguments> getMin()
    {
        return Stream.of(
                Arguments.of(
                        List.of(1, 3, 6, 6),
                        2
                ),
                Arguments.of(
                        List.of(9, 4, 6, 4),
                        3
                ),
                Arguments.of(
                        List.of(5, 4, 6, 6, 6, 6),
                        1
                ),
                Arguments.of(
                        List.of(8, 4, 5, 6, 3, 1),
                        5
                ),
                Arguments.of(
                        List.of(3, 3, 3, 2, 3, 3),
                        1
                ),
                Arguments.of(
                        List.of(89, 4333, 1, 324),
                        4097
                ),
                Arguments.of(
                        List.of(7988, 7989),
                        1
                ),
                Arguments.of(
                        List.of(6, 3, 1, 6),
                        2
                ),
                Arguments.of(
                        List.of(1, 6, 1, 3),
                        3
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getMax")
    void getMax(List<Integer> integers, int expected)
    {
        assertEquals(expected, DeltaHandler.getMax(integers));
    }

    private static Stream<Arguments> getMax()
    {
        return Stream.of(
                Arguments.of(
                        List.of(1, 3, 6, 6),
                        8
                ),
                Arguments.of(
                        List.of(9, 4, 6, 4),
                        7
                ),
                Arguments.of(
                        List.of(5, 4, 6, 6, 6, 6),
                        3
                ),
                Arguments.of(
                        List.of(8, 4, 5, 6, 3, 1),
                        11
                ),
                Arguments.of(
                        List.of(3, 3, 3, 2, 3, 3),
                        1
                ),
                Arguments.of(
                        List.of(89, 4333, 1, 324),
                        4567
                ),
                Arguments.of(
                        List.of(7988, 7989),
                        1
                ),
                Arguments.of(
                        List.of(6, 3, 1, 6),
                        8
                ),
                Arguments.of(
                        List.of(1, 6, 1, 3),
                        7
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getAverage")
    void getAverage(List<Integer> integers, int expected)
    {
        assertEquals(expected, DeltaHandler.getAverage(integers));
    }

    private static Stream<Arguments> getAverage()
    {
        return Stream.of(
                Arguments.of(
                        List.of(1, 3, 6, 6),
                        5
                ),
                Arguments.of(
                        List.of(9, 4, 6, 4),
                        5
                ),
                Arguments.of(
                        List.of(5, 4, 6, 6, 6, 6),
                        2
                ),
                Arguments.of(
                        List.of(8, 4, 5, 6, 3, 1),
                        8
                ),
                Arguments.of(
                        List.of(3, 3, 3, 2, 3, 3),
                        1
                ),
                Arguments.of(
                        List.of(89, 4333, 1, 324),
                        4332
                ),
                Arguments.of(
                        List.of(7988, 7989),
                        1
                ),
                Arguments.of(
                        List.of(6, 3, 1, 6),
                        5
                ),
                Arguments.of(
                        List.of(1, 6, 1, 3),
                        5
                )
        );
    }
}