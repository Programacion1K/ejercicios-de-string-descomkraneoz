public class Espejo {
    public static String espejoCadena(String cadena) {
        String cadenaEspejo="";
        for (int i = cadena.length()-2; i >=0 ; i--) {
            cadenaEspejo+=cadena.charAt(i);
        }
        return cadena+cadenaEspejo;
    }
}
