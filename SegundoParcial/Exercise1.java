import java.util.Scanner;
/**
 * Realiza un programa que pide un nombre y un apellido
 * y muestre el mensaje.
 */
public class Exercise1
{
    public static void main(String []args){
        String Nombre;
        String Apellido;
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingresa un nombre");
        Nombre = lector.nextLine();
        System.out.println("Ingresa un apellido");
        Apellido = lector.nextLine();
        System.out.println("Hola mi nombre es: "+Nombre);
        System.out.println("Mi apellido es: "+Apellido);
    }
}
