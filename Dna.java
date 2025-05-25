public class DNA {
  // check if the DNA is a protein
  public static void main(String[] args) {
             
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna3;

    System.out.println(dna.length());
    System.out.println(dna.indexOf("ATG"));
    System.out.println(dna.indexOf("TGA"));

    if (dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1 && dna.length() % 3 == 0){
      String protein = dna.substring(dna.indexOf("ATG", dna.indexOf("TGA" + 3)));
      System.out.println(protein);
    } else {
      System.out.println("No protein");
    }

  }
  
}
