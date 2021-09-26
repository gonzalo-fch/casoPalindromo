import java.util.Scanner;

public class proyectoEnsayo {
    public static int validarEntrada ( ){
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        do {
            try {
                System.out.println("Escriba un elemento valido");
                numero = teclado.nextInt();
                if (numero < 0) {
                    System.out.println("No se admiten numeros negativos");
                } else if (numero > 100) {
                    System.out.println("No se admiten numeros mayores a 100");
                    numero = -1;

                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato erroneo");
                System.out.println("Intentelo denuevo");
                teclado.next();

            }

        } while (numero <= 0);
        return numero;
    }

    public static int promedioArreglo(int[] arreglo) {
        int promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
        }
        promedio /= arreglo.length;
        return promedio;

    }
    public static int[] ordenarNumero(int[] numeros) {
        int[] ultima;
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                    // System.out.println("aux" + aux);
                }
            }
        }
        ultima = numeros;
        System.out.println("ORDENADOS MENOR-MAYOR");
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Posicion [" + (i + 1) + "] =" + ultima[i]);

        }
        return ultima;

    }
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\n Su matriz seria la siguiente \n");
        for (int[] ints : matriz) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\t ");

            }
            System.out.println();
        }
    }

    public static int[][] llenarMatrizAleatorios(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;

            }
        }
        return matriz;
    }


}
