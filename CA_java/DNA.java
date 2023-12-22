/*
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
So for example:

ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.
*/
public class DNA {
  
  public static void main(String[] args) {
      String dna1 =  "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";  
      String dna3 = "ATTAATATGTACTGA";

      String dna = dna3;
      int indx1 = dna.indexOf("ATG");
      int indx2 = dna.indexOf("TGA");
      if (indx1 != -1 && indx2 != -1 && (indx1 - indx2) %3 == 0){
        String protein = dna.substring(indx1, indx2+3);
        System.out.println("This is a protein: " + protein); 
      } else {
        System.out.println("Not a protein!");
      }
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    
  }
  
}