public class Ocurrencias {

    public static String cuentaOcurrencias(String cadena, String subcadena){
        int posicion;
        int contador=0;
        char[] caracteresSubcadena=subcadena.toCharArray();
        char[] caracteresCadena=cadena.toCharArray();

        for (int i = 0; i <caracteresCadena.length ; i++) {
            for (int j = 0; j <caracteresSubcadena.length ; j++) {
                if (caracteresCadena[i]==caracteresSubcadena[j]) {
                    contador++;
                }
            }
        }
        String salida="En la cadena: "+cadena+"\n";
        salida+="se repite "+" \""+subcadena+"\" "+contador+" vez/veces";
        return salida;

    }

    public static void main(String[] args) {

        System.out.println(Ocurrencias.cuentaOcurrencias("En un lugar de la Mancha", "aln"));

    }
}
