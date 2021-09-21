package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }

  /**
   * If the word already maps to a list, then that list is extended.
   * Otherwise a new list is added to the map.
   *
   * @param word Contains word that will be entered into thesaurus.
   *
   * @param alternatives Contains an array of synonyms to word.
   *
   */
  public void addAlternatives(String word, String ... alternatives) {

    if (synonyms.containsKey(word)) {

      synonyms.replace(word, Stream.concat(synonyms.get(word)
          .stream()
          .filter(w -> !Arrays.asList(alternatives).contains(w)), Arrays.stream(alternatives)
        )
          .sorted()
          .toList()
      );
    } else {
      synonyms.put(word, Arrays.asList(alternatives));
    }
  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
