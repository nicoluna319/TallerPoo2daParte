package ejercicio_01_inventario;

public class Main {

    public static void main(String[] args) {

        Inventario objInventario = new Inventario();

        Producto pro1 = new Producto(1 ,"lapiz ",2000);
        Producto pro2 = new Producto(2 ,"Cuaderno ",7000);

        objInventario.agregarProducto(pro1);
        objInventario.agregarProducto(pro2);

        System.out.println("Lista de productos");
        objInventario.listarProductos();

        objInventario.eliminarProducto(1);
        System.out.println("Lista despues de eliminar producto");
        objInventario.listarProductos();

        System.out.println(objInventario.buscarPorNombre("cuaderno"));

    }
}
