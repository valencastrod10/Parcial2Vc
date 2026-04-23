import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        metodos navegador = new metodos(20);
        int opcion = 0;

        do {
            System.out.println("\n NAVEGADOR ");
            System.out.println("1. Nueva Pagina\n2. Atras\n3. Historial\n4. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("URL: ");
                    String u = entrada.nextLine();
                    System.out.print("Titulo: ");
                    String t = entrada.nextLine();
                    System.out.print("Fecha: ");
                    String f = entrada.nextLine();

                    String resultado = navegador.visitarPagina(u, t, f);
                    System.out.println(resultado);
                    break;

                case 2:

                    Paginaweb borrada = navegador.volverAtras();
                    if (borrada != null) {
                        System.out.println("Saliendo de: " + borrada.getTitulo());
                    } else {
                        System.out.println("No hay páginas para retroceder.");
                    }
                    break;

                case 3:
                    System.out.println("\n HISTORIAL ");

                    System.out.println(navegador.obtenerHistorialCompleto());
                    break;
            }
        } while (opcion != 4);

        entrada.close();
    }
}
