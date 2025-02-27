import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Producto[][] llenarMatriz(int dimension) {
        Producto[][] m = new Producto[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                Producto o = new Producto();
                System.out.println("Inrese el Nombre del Producto (en la posición ["+i+"]["+j+"]):");
                sc.nextLine();// Limpia el Buffer
                o.setNombre(sc.nextLine());
                System.out.println("Ingrese el Precio del Producto:");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la Cantidad del Producto:");
                o.setCantidad(sc.nextInt());
                m [i][j] = o;
            }
        }
        return m;
    }
    public void mostrarMatriz(Producto[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
            }
            System.out.println();
        }
    }
    public String MostrarposicionElemento(Producto[][] m) {
        String nombreBuscar = "";
        System.out.println("Ingrese el Producto a Buscar:");
        nombreBuscar = sc.next();
        String result = "";

        boolean encontrado = false; // Variale para verificar si encontramos el producto
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //Compara el nomre del producto, sin importar mayúsculas / minúsculas
                if(m[i][j].getNombre().toLowerCase().equals(nombreBuscar.toLowerCase())){
                    result += "El Producto se Encuentra en la Posición: " + (i + 1) + "," + (j + 1) + "\n";
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            result = "Producto no encontrado";
        }
        return result;
    }
    
}
