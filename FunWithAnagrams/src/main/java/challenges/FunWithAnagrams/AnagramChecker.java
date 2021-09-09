package challenges.FunWithAnagrams;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
class AnagramChecker
{
    static boolean isAnagram(String s1, String s2)
    {
        int s1Length = s1.length();

        if (s1Length != s2.length())
            return false;
        if (s1.equals(s2))
            return true;

        List<String> s1Array = new ArrayList<>(Arrays.asList(s1.split("")));
        List<String> s2Array = new ArrayList<>(Arrays.asList(s2.split("")));

//        PERFORMANCE TEST:
//        STREAMS LOOP ~220ms
        return s1Array.stream()
                .allMatch(s2Array::remove);

//        PERFORMANCE TEST:
//        FOR I LOOP ~2799ms
//        for (int i = 0; i < s1Length; i++)
//        {
//            if (!s2Array.remove(s1Array.get(i)))
//                return false;
//        }
//        return true;

//        PERFORMANCE TEST:
//        FOR EACH LOOP ~2778ms
//        for (String s : s1Array)
//        {
//            if (!s2Array.remove(s))
//                return false;
//        }
//        return true;

//        PERFORMANCE TEST:
//        WHILE LOOP ~2806ms
//
//        int i = 0;
//
//        while (i < s1Length)
//        {
//            if (!s2Array.remove(s1Array.get(i++)))
//                return false;
//        }
//        return true;
    }
}
