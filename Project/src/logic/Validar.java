package logic;

/**
 * Esta clase define las validaciones necesarias.
 * @author: Camilo Rodríguez
 * @author: Nelson Barreto
 * @version: 26/10/15
 */
public class Validar {
    /**
    * Método que valida si un campo en numérico o no.
    */
    public static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
