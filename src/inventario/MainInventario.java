package inventario;

public class MainInventario {
    public static void main(String[] args) {

        // Crear tres objetos Producto independientes
        Producto productoUno = new Producto();
        productoUno.nombre = "Teclado mecánico";
        productoUno.codigo = "P-001";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.nombre = "Mouse inalámbrico";
        productoDos.codigo = "P-002";
        productoDos.precio = 18000.0;
        productoDos.stock = 25;

        Producto productoTres = new Producto();
        productoTres.nombre = "Monitor 24\"";
        productoTres.codigo = "P-003";
        productoTres.precio = 220000.0;
        productoTres.stock = 5;

        //Mostrar ficha inicial del primero
        productoUno.mostrarFicha();

        //Venta exitosa
        productoUno.venderUnidades(3); // 12 -> 9

        //Venta con error (stock insuficiente)
        productoUno.venderUnidades(50);

        //Reposición
        productoUno.reponerStock(20); // 9 -> 29

        //Actualizar precio
        productoUno.actualizarPrecio(39900.0);

        //Verificar independencia entre objetos
        System.out.println("\n--- Verificando independencia entre objetos ---");
        productoDos.mostrarFicha();
        productoTres.mostrarFicha();
        //productoUno cambio su stock y precio, pero dos y tres siguen igual.

        //ALIASING: copia de referencia
        Producto copia = productoUno;   // NO es un objeto nuevo, es otra flecha al MISMO objeto
        copia.stock = 29;

        System.out.println("\n--- Aliasing de referencias ---");
        System.out.println("Stock de productoUno tras modificar copia: "
                + productoUno.stock + " (mismo objeto en el Heap)");
    }
}