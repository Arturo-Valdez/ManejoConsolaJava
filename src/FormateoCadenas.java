public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas");
        var strNombre = "Matias";
        var intedad = 35;
        var dbleSalario = 21000.50;

        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f%n", strNombre, intedad, dbleSalario);
        System.out.println("mensaje = " + mensaje);

        //Metodo printf
        //%s -> Cadena
        //%d -> double / entero
        //%.2f -> tomar dos decimales en float
        //%n -> Salto de linea
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", strNombre, intedad, dbleSalario);

        var intNumeroEmpleado = 12;
        //Formateo de text block
        //%04d -> agregar 0 si es menor a 4 digitos ejemplo // 12 -- 0012
        mensaje = """
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f%n
                """.formatted(strNombre, intNumeroEmpleado, intedad, dbleSalario);
        System.out.println(mensaje);

        System.out.printf("""
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f%n
                """.formatted(strNombre, intNumeroEmpleado, intedad, dbleSalario));
    }
}
