package P1;

public abstract class Pieza {
    private String ID;
    private String tipo;
    private String titulo;
    private int anioCreacion;
    private String autor;
    private String dimensiones;
    private String materialesDeConstruccion;
    private float peso;
    private boolean necesitaElectricidad;
    private String otrosDetalles;
    private String estado;

    public Pieza(String ID, String tipo, String titulo, int anioCreacion, String autor, String dimensiones,
            String materialesDeConstruccion, float peso, boolean necesitaElectricidad, String otrosDetalles,
            String estado) {
   this.ID = ID;
   this.tipo = tipo;
   this.titulo = titulo;
   this.anioCreacion = anioCreacion;
   this.autor = autor;
   this.dimensiones = dimensiones;
   this.materialesDeConstruccion = materialesDeConstruccion;
   this.peso = peso;
   this.necesitaElectricidad = necesitaElectricidad;
   this.otrosDetalles = otrosDetalles;
   this.estado = estado;
    }

    // Métodos abstractos que las subclases deben implementar
    public abstract void registrarPieza();
    public abstract void verificarEstado();
    protected abstract void aprobar();
    protected abstract void rechazar();
    public abstract int getPrecio();

    // Getters y setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getMaterialesDeConstruccion() {
        return materialesDeConstruccion;
    }

    public void setMaterialesDeConstruccion(String materialesDeConstruccion) {
        this.materialesDeConstruccion = materialesDeConstruccion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean getNecesitaElectricidad() {
        return necesitaElectricidad;
    }

    public void setNecesitaElectricidad(boolean necesitaElectricidad) {
        this.necesitaElectricidad = necesitaElectricidad;
    }

    public String getOtrosDetalles() {
        return otrosDetalles;
    }

    public void setOtrosDetalles(String otrosDetalles) {
        this.otrosDetalles = otrosDetalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}