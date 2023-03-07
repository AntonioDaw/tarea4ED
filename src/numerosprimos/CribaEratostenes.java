/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 *
 * Eratóstenes de Cirene (276 a.C., Cirene, Libia – 194
 * a.C., Alejandría, Egipto) fue el primer hombre que
 * calculó la circunferencia de la Tierra. También
 * se le conoce por su trabajo con calendarios que ya
 * incluían años bisiestos y por dirigir la mítica
 * biblioteca de Alejandría.
 *
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin
 * tachar son números primos.
 */
package numerosprimos;

public class CribaEratostenes {

    /*Cambio la variable dim por un atributo estatico
    *le pongo un nombre mas largo pero mas claro
     */
    static int dimension;

    /**
     * Generar números primos de 1 a max
     *
     * @param max es el valor máximo
     * @return Vector de números primos
     */
    public static int[] generarPrimos(int max) {

        // Declaraciones
        // Tamaño del array 
        CribaEratostenes.dimension = max + 1;
        int indiceBoolean;//se usa para el boolean[]
        int indexAux;//este indice se usa como apoyo
        int indicePrimos;//Se usa para el Array final de numeros primos
        int cantidadPrimos = 0;
        int[] ArrayPrimos;//se usa para tener un solo return(es lo recomendable)
        /* Inicializar el array  al ser el valor por defecto false, nos ahorramos
            *algunas lineas de codigo iterando a partir de la posicion 2
         */
        boolean[] esPrimo = new boolean[dimension];
        for (indiceBoolean = 2; indiceBoolean < dimension; indiceBoolean++) {
            esPrimo[indiceBoolean] = true;
        }

        if (max >= 2) {

            // Criba tambien podemos pasar directamente al dos
            for (indiceBoolean = 2; indiceBoolean <= Math.sqrt(dimension); indiceBoolean++) {
                if (esPrimo[indiceBoolean]) {

                    for (indexAux = 2 * indiceBoolean; indexAux < dimension; indexAux += indiceBoolean) {
                        esPrimo[indexAux] = false;
                    }
                }
            }

            // ¿Cuántos primos hay? 
            for (indiceBoolean = 2; indiceBoolean < dimension; indiceBoolean++) {
                if (esPrimo[indiceBoolean]) {
                    cantidadPrimos++;
                }
            }
            // Rellenar el vector de números primos
            int[] primos = new int[cantidadPrimos];
            for (indiceBoolean = 0, indicePrimos = 0; indiceBoolean < dimension; indiceBoolean++) {
                if (esPrimo[indiceBoolean]) {
                    primos[indicePrimos++] = indiceBoolean;
                }
            }

            ArrayPrimos = primos;

        } else { // max < 2
            ArrayPrimos = new int[0]; // Vector vacío
        }
        return ArrayPrimos;
    }

}
