public class Igual {
    public static String cadenaIgualEnMayusculas(String cadenaUno, String cadenaDos){
    String subCadenaMayusculas="";
    subCadenaMayusculas=cadenaDos.toUpperCase();
    cadenaUno=cadenaUno.replace(cadenaDos,subCadenaMayusculas);
    return cadenaUno;
    }
}
