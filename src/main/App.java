package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for (int i = 0; i < arrayOrdenado.length; i++) {
        if (arrayOrdenado[i] == num) {
            return 1;
        }
    }
    // Percorre elemento por elemento e verifica elemento por elemento
    return 0;
}
    }

    public static int maior(int[] arrayDesordenado){
    public static int encontrarMaior(int[] arrayDesordenado) {
    int maior = arrayDesordenado[0]; // Considera o primeiro valor como o maior.
    for (int i = 1; i < arrayDesordenado.length; i++) { // Inicie o loop a partir do segundo elemento.
        if (maior < arrayDesordenado[i]) { // Se o próximo valor for maior que o anterior, atualize o valor de "maior".
            maior = arrayDesordenado[i];
        }
    }
    return maior;
}

    }

    public static Double encontrarParMaisProximo(Integer[][] pares) {
    ArrayList<Double> menoresDistancias = new ArrayList<>();

    while (pares.length > 1) {
        Integer[] primeiro = pares[0];
        for (int i = 1; i < pares.length; i++) {
            Integer[] proximo = pares[i];
            double distancia = Math.sqrt(Math.pow(primeiro[0] - proximo[0], 2) + Math.pow(primeiro[1] - proximo[1], 2));
            menoresDistancias.add(distancia);
        }
        pares = Arrays.copyOfRange(pares, 1, pares.length); // Remover o par já verificado

    }

    if (menoresDistancias.isEmpty()) {
        return null; // Não há pares para comparar
    }

    double menor = menoresDistancias.get(0);
    for (int i = 1; i < menoresDistancias.size(); i++) {
        if (menor > menoresDistancias.get(i)) {
            menor = menoresDistancias.get(i);
        }
    }
    return menor;
}

    }
}
