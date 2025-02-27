import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Producto[][] llenarMatriz(int dimension) {
        Producto[][] m = new Producto[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                Producto o = new Producto();
                System.out.println("Inrese el Nombre del Producto (en la posición ["+i+"]["+j+"]):");
                sc.nextLine();// Limpia el Buffer
                o.setNombre(sc.next());
                System.out.println("Ingrese el Precio del Producto:");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la Cantidad del Producto:");
                o.setCantidad(sc.nextInt());
                m [i][i] = o;
            }
        }
        return m;
    }
}
