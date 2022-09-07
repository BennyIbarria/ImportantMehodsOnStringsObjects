public class importantMethodsStrings {
    public static void main(String[] args) {

        String nombre = "Benito";

        //Metodo para saber el largo de una cadena de String
        System.out.println("la cadena tiene= " + nombre.length() + " Caracteres");

        //Metodo para convertir a mayusculas un String
        System.out.println("La cadena de String en mayusculas = " + nombre.toUpperCase());

        //Metodo para convertir a minusculas un String
        System.out.println("La cadena de String en minusculas = " + nombre.toUpperCase());

        //Metodo para comparar un string con otro a nivel de valor no de instancia
        System.out.println("Comparar String = " + nombre.equals("Benito"));
        System.out.println("Comparar String = " + nombre.equals("benito"));
        System.out.println("nombre.equalsIgnoreCase(\"benito\") = " + nombre.equalsIgnoreCase("benito"));

        //Metodo para comparar el orden numerico de UNICODE -Orden Lexico Gráfico-
        System.out.println("nombre.compareTo(\"Benito\") = " + nombre.compareTo("Benito"));
        System.out.println("nombre.compareTo(\"Benito\") = " + nombre.compareTo("Jose"));

        //Metodo para convertir un String en caracter
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));

        //Obtener el utlimo caracter de manera dinamica con la union de dos metodos
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        //Metodo para obtener un fragmento de la cadena
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));

        //Obtener un cadena de string de manera dinamica con la union de dos métodos
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        //Creamos una nueva instancia para nuevos metodos
        String trabalenguas = "trabalenguas";

        //Metodo para reemplazar un caracter por otro
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));

        //Metodo para saber si se encuentra a algun caracter dentro de la cadena en primera ocurrencia
        System.out.println("trabalenguas.indexOf(\"n\") = " + trabalenguas.indexOf("n"));

        //Metodo para saber si se encuentra a algun caracter dentro de la cadena en ultima ocurrencia
        System.out.println("trabalenguas.indexOf(\"n\") = " + trabalenguas.lastIndexOf("a"));

        //Método container que forzozamente retorna un secuencia, un String
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
    
        //metodo para saber si inicia con una secuencia
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));

        //metodo para saber si inicia con una secuencia
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.endsWith("traba"));

        //Metodo para quitar los espacios en blanco
        System.out.println("  Trabalenguas ");
        System.out.println("  Trabalenguas ".trim());
    }
}
