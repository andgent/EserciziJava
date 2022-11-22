import java.util.Scanner;

public class Compreso {
    public static void main(String[] args) {
      compreso();


    } 
    public static boolean compreso(){
        boolean compreso = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci valore 'a'");
        int a = scanner.nextInt();
        System.out.println("Inserisci valore 'b'");
        int b = scanner.nextInt();
        System.out.println("Inserisci valore 'c'");
        int c = scanner.nextInt();

        if(b>a && b<c) {
            System.out.println("b è compreso tra a e c");
            compreso = true;
        } 
        else if(b<a && b>c){
            System.out.println("b è compreso tra a e c");
            compreso = true;
        } else {
            System.out.println("b non è compreso tra a e c");
            compreso = false;
        } 
       scanner.close(); 
        return compreso;
    }  
    }
