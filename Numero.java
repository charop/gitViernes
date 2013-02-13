
/**
 * Autor: Apah
 * Fecha: 10.09.2012
 * Asunto: Corresponde a la práctica IV.1
 */

public class Numero
{
    // Devuelve VERDAD o FALSO dependiendo de si un número es o no primo
    
    public boolean esPrimo (int numero)
    {
        boolean numeroPrimo = true; // En principio pienso que es primo
        int divisor = 2; // CONTADOR. Empiezo a dividir por 2 hasta la raíz del número

        while (numeroPrimo && divisor <= Math.sqrt (numero)) {
            if (numero % divisor == 0) {
                numeroPrimo = false; // Hemos encontrado un divisor y el número ya no es primo
            }
            divisor++;
        }
        
        return numeroPrimo;
    } 
    
    // Devuelve VERDAD o FALSO dependiendo de si el número es perfecto o no
    
    public boolean esPerfecto(int numero)
    {
        int sumaDivisores = 1; // Ya que el 1 siempre es un divisor
        int i = 2; // Contador 2 .. Raiz de numero
        
        while (i <= Math.sqrt(numero)) {
            if (numero % i == 0) { // He encontrado un divisor
                sumaDivisores = sumaDivisores + i + numero/i; // Acumulo el divisor y su "pareja"
            }
            i++;
        }
        
        return sumaDivisores == numero;
    }
    
    // Visualiza la lista de números perfectos desde el 1 hasta el número que se le indica
    
    public void listaPerfectos (int numero)
    {   int i=2; // Cada uno de los posibles números perfectos
        
        System.out.println ("Listado de números perfectos menores que " + numero);
        System.out.println ();
        
        while (i <= numero) {
            if (esPerfecto (i)) {
                System.out.println (i);
            }
            i++;
        }
        
        System.out.println ();
        System.out.println ("***** Fin del listado ******");
    }
             
    // Dado un número en base 10 lo pasa a base 2
    
    public String base2 (int numero)
    {
        String resultado = ""; // Acumulador. Va recogiendo los restos que se van produciendo
        int resto;
        
        while (numero > 0) {
            resto = numero % 2;
            resultado = resto + resultado;
            numero = numero / 2;
        }
        
        return resultado;
        ///////// return Integer.toBinaryString (numero); Esta instrucción haría lo mismo que toda la función.
    }
}