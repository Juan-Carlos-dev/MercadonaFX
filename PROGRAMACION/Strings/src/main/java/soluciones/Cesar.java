package soluciones;

public class Cesar {

    public static void main(String[] args) {
        String cadena = "NO TE levantes";
        String claveString = "jaje";
        int clave = 3;
        int tamañoAlfabeto = 26;
        int conversionCero = 0;

        claveString = claveString.toLowerCase();

        StringBuilder cifrado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {


            if (Character.isLetter(cadena.charAt(i))) {
                // conseguir clave
                //clave es cte

                //convertir a cero
                if (Character.isLowerCase(cadena.charAt(i))) {
                   conversionCero = 'a';
                } else if (Character.isUpperCase(cadena.charAt(i))) {
                   conversionCero = 'A';
                }
                int posicion =  (cadena.charAt(i)-conversionCero);

                //cifrar
                char caracterCifrado = (char) ((posicion + clave+tamañoAlfabeto)%tamañoAlfabeto);

                //descifrar
                char caracterDesCifrado = (char) ((posicion - clave+tamañoAlfabeto)%tamañoAlfabeto);


                //devolver a su ascii
                cifrado.append((char) (caracterCifrado+conversionCero));

            } else
                cifrado.append(cadena.charAt(i));
        }
        System.out.println(cifrado);
    }
}
