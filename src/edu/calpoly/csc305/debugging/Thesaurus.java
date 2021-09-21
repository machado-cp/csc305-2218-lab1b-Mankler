package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }

  public void addAlternatives(String word, String ... alternatives) {
    synonyms.get(word).addAll(Arrays.asList(alternatives));
  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
