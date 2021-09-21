package edu.calpoly.csc305.debugging;

public class DebuggerMain {
  public static void main(String[] args) {
    Thesaurus thesaurus = new Thesaurus();

    thesaurus.addAlternatives("interesting",
         "absorbing", "consuming", "engaging", "fascinating");

    System.out.println(thesaurus.alternatives("interesting"));
  }
}
