import java.util.Scanner;

public class ValoreAssoluto {
    

public static void main(String[] args) {
valoreAssoluto();
  } 

public static int valoreAssoluto(){
int valoreAssoluto;
int valore;

System.out.println("Inserisci valore");
Scanner scanner = new Scanner(System.in);
valore = scanner.nextInt();
if (valore < 0) {
    valoreAssoluto = -valore;
} else {
    valoreAssoluto = valore;
}
System.out.println("Valore assoluto: " + valoreAssoluto);
scanner.close();
    return valoreAssoluto;

}
}
