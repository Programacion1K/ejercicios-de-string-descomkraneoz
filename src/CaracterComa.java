public class CaracterComa {
    public  static String letrasSeparadasPorComas(String cadena){
        String salida="";
        char letra='p';
        for ( int i = 0; i < cadena.length(); i++) {
            letra=cadena.charAt(i);
            salida+= letra+",";
        }
        return salida.substring(0,salida.length()-1);
    }
}
