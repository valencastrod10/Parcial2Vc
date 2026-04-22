class Paginaweb {
   
    String url;
    String titulo;
    String fechaAcceso;

    
    public Paginaweb(String url, String titulo, String fecha) {
        this.url = url;
        this.titulo = titulo;
        this.fechaAcceso = fecha;
    }


    public String getUrl() {
        return url;
    }


    public Paginaweb setUrl(String url) {
        this.url = url;
        return this;
    }


    public Paginaweb setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }


    public Paginaweb setFechaAcceso(String fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
        return this;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getFechaAcceso() {
        return fechaAcceso;
    }
}
