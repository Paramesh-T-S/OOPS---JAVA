
/**
 * Write a description of Finding_gene_in_DNA here.
 * 
 * @author (Paramesh) 
 * @version (13-Aug-2019)
 */

import java.io.*;

public class Finding_gene_in_DNA {
  public String findSimpleGene(String dna){
    String result = ""; 
    int startindex = dna.indexOf("ATG");
    if(startindex==-1){
        return "";
    }
    int stopindex = dna.indexOf("TAA",startindex+3);
    if(stopindex==-1){
        return "";
    }
    if((stopindex - startindex) % 3 == 0) {
            return dna.substring(startindex, stopindex+3);
        }
        else {
            return "";
        }
    }
    
    public void testSimpleGene ()
    {String a = "ATDATGASDEDGHTATAA";
      String a1 = "ASDEDGHTATAA";
      String a2 = "ATDATGASDEDGHTA";
      String a3 = "ATDATGASDEDGHTTAA";
      String a4 = "ATDASDEDGHT";
      
     
   System.out.println("The string is: " + a + ". The Gene is: " + findSimpleGene(a));
   System.out.println("The string is: " + a1 + ". The Gene is: " + findSimpleGene(a1));
   System.out.println("The string is: " + a2 + ". The Gene is: " + findSimpleGene(a2));
    System.out.println("The string is: " + a3 + ". The Gene is: " + findSimpleGene(a3));
    System.out.println("The string is: " + a4 + ". The Gene is: " + findSimpleGene(a4));
    
    
    }
    public static void main(String[] args)
    {
        Finding_gene_in_DNA obj = Finding_gene_in_DNA Part1();
        obj.testSimpleGene();
    }
}
