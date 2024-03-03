import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class WordCountTest {
    @Test
    void wordMapTest() throws FileNotFoundException {
        Map<String, Integer> wordMap = new WordCount().summarizeWordCount();
        assertEquals(152, wordMap.size());
    }

    @Test
    void getWordCountGtTest() throws FileNotFoundException {
        Map<String, Integer> wordMap = new WordCount().summarizeWordCount();
        List<Map.Entry<String, Integer>> wordCount = new WordCount().getWordCountGT(wordMap, 5);
        List<Map.Entry<String, Integer>> expected = List.of(
                (Map.entry("that", 11)),
                (Map.entry("the", 9)),
                (Map.entry("to", 8)),
                (Map.entry("we", 8)),
                (Map.entry("a", 7)),
                (Map.entry("here", 6)),
                (Map.entry("and", 6)));

        System.out.println("expected = " + expected);
        System.out.println("actual   = " + wordCount);
        assertIterableEquals(expected, wordCount);
    }
}