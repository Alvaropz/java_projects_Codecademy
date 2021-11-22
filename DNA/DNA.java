public class DNA {
    public static void main(String[] args) {
      // Determines whether there is a protein in a strand of DNA.
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
  
      String dna = dna3;
      int dna_length = dna1.length();
      System.out.println("The length of this sequence is: " + dna_length);
      int dna_start = dna.indexOf("ATG");
      int dna_end = dna.indexOf("TGA");
      if (dna_start != -1 && dna_end != -1 && (dna_end - dna_start) % 3 == 0) {
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
        String protein = dna.substring(dna_start, dna_end+3);
        System.out.println("Protein: " + protein);
      } else {
        System.out.println("There is no protein.");
      }
    }
  }  