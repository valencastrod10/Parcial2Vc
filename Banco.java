public class Banco {

    private int id;
    private String nombre;
    private String tipoServicio;
    private String horaLlegada;
    private boolean atendido;
    public Banco(int id, String nombre, String tipoServicio, String horaLlegada, boolean atendido) {
        this.id = id;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.horaLlegada = horaLlegada;
        this.atendido = atendido;
    }
    public int getId() {
        return id;
    }
    public Banco setId(int id) {
        this.id = id;
        return this;
    }
    public String getNombre() {
        return nombre;
    }
    public Banco setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public String getTipoServicio() {
        return tipoServicio;
    }
    public Banco setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
        return this;
    }
    public String getHoraLlegada() {
        return horaLlegada;
    }
    public Banco setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
        return this;
    }
    public boolean isAtendido() {
        return atendido;
    }
    public Banco setAtendido(boolean atendido) {
        this.atendido = atendido;
        return this;
    }
}
