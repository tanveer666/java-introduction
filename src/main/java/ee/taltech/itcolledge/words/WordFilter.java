package ee.taltech.itcolledge.words;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    //todo make methods work, don't forget about the tests
    public List<Word> getNouns(List<Word> words){
        return words;
    }

    public Word getFirstVerb(List<Word> words){
        return words.get(0);
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type){
        return words.get(0);
    }

    public List<Word> getAllNotNouns(List<Word> words){
        return words;
    }

    public List<String> getNounString(List<Word> words){
        return new ArrayList<>();
    }

    public String getFirstVerbString(List<Word> words){
        return "";
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type){
        return "";
    }
}
