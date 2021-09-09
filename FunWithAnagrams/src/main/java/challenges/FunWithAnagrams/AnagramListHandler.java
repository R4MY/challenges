package challenges.FunWithAnagrams;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
class AnagramListHandler
{
    // always receives nonempty list of string
    static List<String> filter(List<String> listOfWords)
    {
        List<String> copyOfList = new ArrayList<>(listOfWords);
        List<String> outputList = new ArrayList<>();

        while (!copyOfList.isEmpty())
        {
            String currentWord = handleCurrentWord(outputList, copyOfList);
            removeAnagrams(copyOfList, currentWord);
        }

        Collections.sort(outputList);

        return outputList;
    }

    private static String handleCurrentWord(List<String> outputList, List<String> copyOfList)
    {
        String currentWord = copyOfList.get(0);
        outputList.add(currentWord);
        copyOfList.remove(currentWord);

        return currentWord;
    }

    private static void removeAnagrams(List<String> listOfWords, String currentWord)
    {
        List<String> wordsToRemove = new ArrayList<>();


//        FOR LOOP VARIANT
//        for (String compareWord : listOfWords)
//        {
//            if (AnagramChecker.isAnagram(currentWord, compareWord))
//            {
//                wordsToRemove.add(compareWord);
//            }
//        }
//
//        for (String w : wordsToRemove)
//        {
//            listOfWords.remove(w);
//        }

//        STREAMS VARIANT
        listOfWords
                .forEach(compareWord -> {
                    if (AnagramChecker.isAnagram(currentWord, compareWord))
                        wordsToRemove.add(compareWord);
                });
        wordsToRemove
                .forEach(listOfWords::remove);
    }
}
