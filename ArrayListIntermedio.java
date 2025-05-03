import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListIntermedio {

    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> invertita = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            invertita.add(lista.get(i));
        }
        return invertita;
    }

    public static List<Integer> eliminaDuplicati(List<Integer> lista) {
        List<Integer> senzaDuplicati = new ArrayList<>();
        for (Integer numero : lista) {
            if (!senzaDuplicati.contains(numero)) {
                senzaDuplicati.add(numero);
            }
        }
        return senzaDuplicati;
    }

    public static List<Integer> filtraPari(List<Integer> lista) {
        List<Integer> pari = new ArrayList<>();
        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                pari.add(numero);
            }
        }
        return pari;
    }

    public static int[] trovaMinMax(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista è vuota.");
        }
        int min = lista.get(0);
        int max = lista.get(0);
        for (int numero : lista) {
            if (numero < min) min = numero;
            if (numero > max) max = numero;
        }
        return new int[]{min, max};
    }

    public static void ordinaStudenti(List<String> studenti) {
        Collections.sort(studenti);
        for (String studente : studenti) {
            System.out.println(studente);
        }
    }

}

