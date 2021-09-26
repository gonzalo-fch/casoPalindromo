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
