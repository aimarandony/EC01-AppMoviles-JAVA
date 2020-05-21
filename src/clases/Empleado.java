package clases;

/**
 * @author Aimar Berrocal Coaquira
 */
public class Empleado {

    private int codigo;
    private String nombre;
    private int categoria;
    private int celular;

    public Empleado(int codigo, String nombre, int categoria, int celular) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.celular = celular;
    }
    
    public Empleado(int codigo, String nombre){
        this(codigo, nombre, 2, 953641214);
    }
    
    public Empleado(){
        this(54321 , "Pedro López" , 2, 953641214);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    public double sueldoBruto(int categ){
        double sueldoBruto;
        
        switch(categ){
            case 0:
                sueldoBruto = 7200;
                break;
            case 1:
                sueldoBruto = 6300;
                break;
            case 2:
                sueldoBruto = 5100;
                break;
            default:
                sueldoBruto = 0;
                break;
        }
        
        return sueldoBruto;
    }
    
    public double descuento(double sueldo){
        return sueldo * lib.Libreria.DESC;
    }
    
    public double sueldoNeto(double sueldo, double desc){
        return sueldo - desc;
    }
}
