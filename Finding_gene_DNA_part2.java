
/**
 * Write a description of Part2 here.
 * 
 * @author (Paramesh) 
 * @version (a version number or a date)
 */
public class Finding_gene_DNA_part2 {
public String findSimpleGene(String dna,String startCodon,String stopCodon){
    String result = ""; 
            if( Character.isUpperCase(dna.charAt(0)) ) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        } else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
    int startindex = dna.indexOf(startCodon);
    if(startindex==-1){
        return "";
    }
    int stopindex = dna.indexOf(stopCodon, startindex);
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
      String a2 = "hccatgcctcagctaacagk";
      String a3 = "ATDATGASDEDGHTTAA";
      String a4 = "ATDASDEDGHT";
      
     
   System.out.println("The string is: " + a + ". The Gene is: " + findSimpleGene(a,"ATG", "TAA"));
   System.out.println("The string is: " + a1 + ". The Gene is: " + findSimpleGene(a1,"ATG", "TAA"));
   System.out.println("The string is: " + a2 + ". The Gene is: " + findSimpleGene(a2,"ATG", "TAA"));
    System.out.println("The string is: " + a3 + ". The Gene is: " + findSimpleGene(a3,"ATG", "TAA"));
    System.out.println("The string is: " + a4 + ". The Gene is: " + findSimpleGene(a4,"ATG", "TAA"));
    
    
    }
    public static void main(String[] args){
    Finding_gene_DNA_part2 obj = new Finding_gene_DNA_part2();
    obj.testSimpleGene();
    }
}
