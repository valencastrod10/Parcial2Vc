public class metodos {

    private Paginaweb[] pila;
    private int top;

    public metodos(int capacidad) {
        this.pila = new Paginaweb[capacidad];
        this.top = -1;
    }

    public String visitarPagina(String url, String titulo, String fecha) {
        if (top < pila.length - 1) {
            top++;
            pila[top] = new Paginaweb(url, titulo, fecha);
            return "Página '" + titulo + "' agregada al historial.";
        }
        return "Error: El historial está lleno.";
    }

    public Paginaweb volverAtras() {
        if (top >= 0) {
            Paginaweb eliminada = pila[top];
            pila[top] = null;
            top--;
            return eliminada;
        }
        return null;
    }

    public String obtenerHistorialCompleto() {
        if (top == -1) {
            return "El historial está vacío.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            sb.append("- ").append(pila[i].getTitulo())
                    .append(" (").append(pila[i].getUrl()).append(")\n");
        }
        return sb.toString();
    }

    public boolean tienePaginas() {
        return top >= 0;
    }
}
