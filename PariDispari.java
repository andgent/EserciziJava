import java.util.Scanner;
public class PariDispari {
    
    public static void main(String[] args) {
      pari();
    } 

    public static boolean pari(){
        boolean pari = true;
        int valore;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci valore");
        valore = scanner.nextInt();

        if(valore %2 == 0) {
            pari = true;
            System.out.println("Il valore è pari");

        } else { 
            System.out.println("Il valore è dispari");
        }
       scanner.close(); 
        return pari;
    }  
    }

