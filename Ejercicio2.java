public class Ejercicio2 {
    public static void main(String[] args) {
        java.util.List<Double> notas = new java.util.ArrayList<>();
        notas.add(7.5);
        notas.add(4.0);
        notas.add(9.2);
        notas.add(6.8);
        notas.add(5.5);
        notas.add(8.0);

        System.out.println("Lista original: " + notas);

        notas.sort(null);
        System.out.println("Muestra la lista ordenada: " + notas);

        java.util.List<Double> tresPrimeras = notas.subList(0, 3);
        System.out.println("Muestra las tres primeras notas: " + tresPrimeras);

        notas.sort(java.util.Comparator.reverseOrder());
        System.out.println("Muestra la lista final: " + notas);
    }
}
