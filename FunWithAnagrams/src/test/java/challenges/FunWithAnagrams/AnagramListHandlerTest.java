package challenges.FunWithAnagrams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnagramListHandlerTest
{

    @ParameterizedTest
    @MethodSource("filter")
    void filter(List<String> listOfWords, List<String> expected)
    {
        assertEquals(expected, AnagramListHandler.filter(listOfWords));
    }

    static Stream<Arguments> filter()
    {
        return Stream.of(
                Arguments.of(
                        List.of("poke", "code", "ekop", "dcoe"),
                        List.of("code", "poke")
                ),
                Arguments.of(
                        List.of("eet", "eeet", "abc", "bca", "ramy", "ram", "yamr"),
                        List.of("abc", "eeet", "eet", "ram", "ramy")
                )
        );
    }
}