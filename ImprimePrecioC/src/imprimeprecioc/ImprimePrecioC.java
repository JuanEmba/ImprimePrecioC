package imprimeprecioc;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner 
 * Este programa calcula e imprime la cantidad de una orden de compra.
 *
 */
public class ImprimePrecioC {
    
       static double precio; // precio de compra del artículo
        static int cant; // número de artículos comprados
       Scanner stdIn = new Scanner(System.in);
    
    public  void entrada (){
         
        System.out.print("Precio de compra del artículo: ");
        precio = stdIn.nextDouble();
        System.out.print("Cantidad: ");
        cant = stdIn.nextInt();
    }
    
    public void imprimir (int can,double precio){
         System.out.println("Total de orden de compra = $" + precio * cant);
    }

    public static void main(String[] args) {

        ImprimePrecioC precios = new ImprimePrecioC();
        precios.entrada();
        precios.imprimir(cant, precio);
    }

}
