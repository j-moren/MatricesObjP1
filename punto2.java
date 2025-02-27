public class punto2 {

    public void P2(int d) {
        Metodos m = new Metodos();
        Producto[][] M = new Producto[d][d];
        M = m.llenarMatriz(d);
        m.mostrarMatriz(M);

        int inventarioTotal = calcularInventarioTotal(M);
        System.out.println("El Inventario Total de la Tienda es: " + inventarioTotal);
    }
    
    public int calcularInventarioTotal(Producto[][] m) {
        int inventarioTotal = 0;
    
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                inventarioTotal += m[i][j].getCantidad();//Sumamos la cantidad de producto
            }
        }
        return inventarioTotal;//Devolvemos el inventario total
    }
}
