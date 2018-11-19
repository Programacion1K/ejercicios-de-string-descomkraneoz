public class Inversa {
    public static String inversaCadena(String cadena) {
        String cadenaInvertida="";
        for (int i = cadena.length()-1; i >=0 ; i--) {
            cadenaInvertida+=cadena.charAt(i);
        }
        return cadenaInvertida;
    }
}
