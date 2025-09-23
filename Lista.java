import java.util.ArrayList;

class ListaMaterias {
    public ArrayList<String> materias = new ArrayList<>();

    public boolean contiene(String materia) {
        return materias.contains(materia);
    }

    public void imprimir() {
        System.out.println("Materias: " + materias);
    }
}

public class Lista {
    public static void main(String[] args) {
        ListaMaterias lista = new ListaMaterias();

        lista.materias.add("Matematicas");
        lista.materias.add("Fisica");
        lista.materias.add("Quimica");
        lista.materias.add("Historia");
        lista.materias.add("Programacion");

        lista.imprimir();

        String materiaBuscada = "Quimica";
        System.out.println("Busqueda: " + materiaBuscada);

        if (lista.contiene(materiaBuscada)) {
            System.out.println("Resultado: Materia encontrada");
        } else {
            System.out.println("Resultado: Materia no encontrada");
        }
    }
}
