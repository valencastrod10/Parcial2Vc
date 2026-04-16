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


    public void setUrl(String url) {
        this.url = url;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setFechaAcceso(String fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getFechaAcceso() {
        return fechaAcceso;
    }
}