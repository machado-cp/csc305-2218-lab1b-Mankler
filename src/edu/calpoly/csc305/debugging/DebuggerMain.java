package edu.calpoly.csc305.debugging;

public class DebuggerMain {
  /**
   * runs the thesaurus functions.
   *
   * @param args Contains program arguments.
   *
   */
  public static void main(String[] args) {
    Thesaurus thesaurus = new Thesaurus();

    String interesting = "interesting";

    thesaurus.addAlternatives(interesting,
         "absorbing", "consuming", "engaging", "fascinating");
    System.out.println(thesaurus.alternatives(interesting));
    thesaurus.addAlternatives(interesting, "absorbing", "cool", "fascinating", "sick");

    System.out.println(thesaurus.alternatives(interesting));
  }
}
