import com.google.gson.annotations.SerializedName;

public class Moneda {
    private String nombre;
    @SerializedName("base_code")
    private String codigo;
    private String pais;
    private double montoInicial;
    @SerializedName("conversion_rate")
    private double taza;

    public Moneda(String nombre, String codigo, String pais,double montoInicial) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.pais = pais;
        this.montoInicial =montoInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", pais='" + pais+ '\''+
                ",Cantidad='"+montoInicial+'\''+
                '}';
    }
}
