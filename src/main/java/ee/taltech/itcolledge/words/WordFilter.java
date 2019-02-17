package ee.taltech.itcolledge.words;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {

    public List<Word> getNouns(List<Word> words) {
        return words;
    }

    public Word getFirstVerb(List<Word> words) {
        return words.get(0);
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        return words.get(0);
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        return words;
    }

    public List<String> getNounStrings(List<Word> words){
        return new ArrayList<>();
    }

    public String getFirstVerbString(List<Word> words) {
        return "";
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        return "";
    }
}
