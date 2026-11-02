public class Ejercicio3 {
    public static void main(String[] args) {
        java.util.List<String> listaCompra = new java.util.ArrayList<>();
        listaCompra.add("pan");
        listaCompra.add("leche");
        listaCompra.add("huevos");
        listaCompra.add("arroz");
        listaCompra.add("fruta");

        System.out.println("Comprueba si la lista está vacía: " + listaCompra.isEmpty());

        listaCompra.remove("huevos");
        System.out.println("Muestra la lista: " + listaCompra);
        System.out.println("Muestra su tamaño: " + listaCompra.size());

        listaCompra.clear();
        System.out.println("Comprueba de nuevo si la lista está vacía: " + listaCompra.isEmpty());
        System.out.println("Muestra el tamaño final de la lista: " + listaCompra.size());
    }
}
