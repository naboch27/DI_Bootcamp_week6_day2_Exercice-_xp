import java.util.Scanner;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez votre Point");

            Integer point =scanner.nextInt();

            System.out.println(point);
              if(point <=100 && point>=93){

                System.out.println("votre lettre est un A");
    
            }else
    
            if(point <=92 && point>=90){
    
                System.out.println("votre lettre est un A-");
            }else
    
            if(point <=89 && point>=87){
    
                System.out.println("votre lettre est un B+");
            }else
    
            if(point <=86 && point>=83){
    
                System.out.println("votre lettre est un B");
            }else 
    
            if(point <=82 && point>=80){
    
                System.out.println("votre lettre est un B-");
            }else 
    
            if(point <=79 && point>=77){
    
                System.out.println("votre lettre est un C+");
            }else 
    
            if(point <=76 && point>=70){
    
                System.out.println("votre lettre est un C");
            }else 
    
            if(point <=69 && point>=60){
    
                System.out.println("votre lettre est un D");
            }else 
    
            if(point <=59 && point>=0){
                System.out.println("votre lettre est un F");
            }else 
            
            {
                System.out.println("Votre notre point est invalide...");
            }
    
    
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        }

        
    
}