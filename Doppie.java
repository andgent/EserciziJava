import java.util.Scanner;

public class Doppie {
    

    public static void main(String[] args) {
        ciSonoDoppie();

    }

    static boolean ciSonoDoppie(){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Inserisci parola: "); 
        String command = scanner.next();
        boolean doppie = false;
        for (int i=0; i<command.length(); i++){
            if (i!=(command.length()-1) && command.charAt(i)==command.charAt(i+1)){
             doppie=true;
             System.out.println("Ci sono doppie");
             return(doppie);
            }
        scanner.close();
        }
        if(doppie==false){
            System.out.print("Non ci sono doppie");
            return(doppie);
        }
        
        return(doppie);
        
    }
        
}
