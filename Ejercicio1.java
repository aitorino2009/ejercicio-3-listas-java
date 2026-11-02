public class Ejercicio1 {
    public static void main(String[] args) {
        java.util.List<String> nombres = new java.util.ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Pedro");
        nombres.add("Laura");
        nombres.add("Carlos");

        System.out.println("Cantidad de nombres en la lista: " + nombres.size());
        System.out.println("Nombre en el índice 2 de la lista: " + nombres.get(2));
        System.out.println("¿Contiene a 'Marta'?: " + nombres.contains("Marta"));
        System.out.println("Índice de la primera aparición de 'Carlos' en la lista: " + nombres.indexOf("Carlos"));

        nombres.remove("Carlos");
        System.out.println("Lista final: " + nombres);

        nombres.remove(0);
        System.out.println("Lista actualizada: " + nombres);
    }
}
