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


    public static int existeEnArreglo(String[] arreglo, String busqueda) {// arreglo string

        /*
        CODIGO QUE PERMITE EL FUNCIONAMIENTO


        String[] palabras = {"palabra1", "palabra2", "palabra3"};
        String pBuscada= "palabra1";
        int posicionDelElemento = existeEnArreglo(palabras, pBuscada);
        if (posicionDelElemento == -1) {
            System.out.println("El elemento NO existe en el arreglo");

        } else {
            System.out.println("El elemento existe en la posición: " +posicionDelElemento);
        }
         */
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x].equals(busqueda)) {
                return x; // si lo encuenta retorna la posicion en el arreglo
            }
        }
        return -1;
    }
    public static int validar() {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;

        do {
            try {
                System.out.println("..........[]..........");
                numero1 = teclado.nextInt();
                if (numero1 < 0) {
                    System.out.println("No se admiten numeros negativos");
                } else if (numero1 > 100) {
                    System.out.println("No se admiten numeros mayores a 100");
                    numero1 = -1;

                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato erroneo");
                System.out.println("Intentelo denuevo");
                teclado.next();

            }

        } while (numero1 <= 0);
        return numero1;
    }




}
