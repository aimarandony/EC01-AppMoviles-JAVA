# Evaluación Continua 01 - Desarrollo de App Móviles 01
> Soluciones de la evaluación continua 01.
> IMPORTATNTE: Esta solución ha sido subida despúes de entregar los examenes.  

## Ejercicio 01
> La Empresa Somos Programaores, dedicada a los servicios de Desarrollo de Software Coporativo, asignará el monto de S/. 450,000.00 de presupuesto a sus áreas.

> El dinero será distribuido entre diversas áreas: Administración, Consultoría, Sistemas, Contabilidad y Marketing de la siguiente forma:
• Administración : 15% del monto de dinero a repartir.
• Consultoría : 30% del monto equivalente recibido por Contabilidad.
• Sistemas : 20% del monto de dinero a repartir.
• Contabilidad : 25% del monto equivalente recibido por Administración y Sistemas.
• Marketing : Lo que queda del dinero a repartir.

> Dado el monto de dinero a repartir, diseñe una aplicación que determine que cantidad de dinero le corresponde a cada área.  Incluyendo el total al final de la visualización.
### Solución 01
#### Resultado:
![Resultado 01](http://speedfiles.glitch.me/image/speedfiles-1590080332991-77.png)
#### Código del Botón "Procesar":
```java
double total = 450000;        
double administracion = total * 0.15;        
double sistema = total * 0.20;        
double contabilidad = (administracion + sistema) * 0.25;
double consultoria = contabilidad * 0.30;
double marketing = total - (administracion + sistema);

NumberFormat nf = NumberFormat.getCurrencyInstance();

DefaultTableModel model;     
model = (DefaultTableModel) tblResultado.getModel();
Object datos[][] = 
{
    {"Administración", nf.format(administracion)}, {"Sistemas", nf.format(sistema)}, 
    {"Contabilidad", nf.format(contabilidad)}, {"Consultoría", nf.format(consultoria)},
    {"Marketing", nf.format(marketing)}
};
model.setNumRows(0);
for (Object[] dato : datos) {
    model.addRow(dato);
}    
```

## Ejercicio 02
> La Fabrica 3D produce las mascarillas para protegerse del virus COVID 19, a dispuesto a mejorar sus ventas y ha puesto en oferta la venta de sus mascarillas ofreciendo un doble descuento de 6.5% y 4.5% para todos sus clientes. 
• El importe compra se calcula multiplicando el precio de la mascarilla por la cantidad de mascarillas adquiridas. 
• El primer descuento es igual al 6.5% del importe de la compra. 
• El segundo descuento es igual al 4.5% del importe que se obtiene al restar el importe compra menos el importe del primer descuento. 
• El importe del descuento total se calcula sumando los importes del primer y segundo descuento.
• El importe a pagar se calcula restando el importe compra menos el importe del descuento total (dos descuentos realizados). 
• Adicionalmente, la fábrica obsequia 03  mascarillas por cada docena de mascarillas adquiridas. 

> Dados el precio de la mascarilla y la cantidad de mascarillas adquiridas, diseñe un algoritmo que determine el importe de la compra, el importe del descuento total, el importe a pagar y la cantidad de mascarillas de obsequio.
### Solución 02
#### Resultado:
![Resultado 02](http://speedfiles.glitch.me/image/speedfiles-1590080474511-83.png)
#### Código del Botón "Calcular":
```java
double precio = Double.parseDouble(txtPrecio.getText());
int cantidad = Integer.parseInt(txtCantidad.getText());

double importeCompra = precio * cantidad;
double desc01 = 0.065 * importeCompra;
double desc02 = 0.045 * (importeCompra - desc01);
double descTotal = desc01 + desc02;
double importePagar = importeCompra - descTotal;

int obsequio = (cantidad >= 12)? (cantidad/12) * 3 : 0;

NumberFormat nf = NumberFormat.getCurrencyInstance();

DefaultTableModel model;     
model = (DefaultTableModel) tblResultado.getModel();
Object datos[][] = 
{
    {"Importe de Compra", nf.format(importeCompra)}, {"Descuento Total", nf.format(descTotal)}, 
    {"Importe a Pagar", nf.format(importePagar)}, {"Cant. de Obsequios", obsequio + " 🎁"}
};
model.setNumRows(0);
for (Object[] dato : datos) {
    model.addRow(dato);
}  
```

## Ejercicio 03
> Diseñe la clase Empleado y ponga los siguientes atributos privados: 
▪codigo (int)
▪nombre (String)
▪categoria (int)
▪número de celular (int). 

>Realice un método sueldoBruto() que retorne el sueldo bruto del empleado sabiendo que el sueldo bruto por categoría es:
• 0 -> S/. 7200 
• 1 -> S/. 6300 
• 2 -> S/. 5100 
> Realice un método método que retorne el descuento (15%) (aplicado al sueldo bruto). 
> Realice un método que retorne el sueldo neto (sueldo bruto –descuento)

### Solución 03
#### Resultado:
![Resultado 03](http://speedfiles.glitch.me/image/speedfiles-1590080914630-52.png)
#### Código del Botón "Procesar":
```java
ArrayList<Empleado> empleados = new ArrayList<>();
Empleado empleado3 = new Empleado(74587, "Viviana Saldaña", 1, 958454125);
Empleado empleado2 = new Empleado(67890, "Juan Sanchez");
Empleado empleado1 = new Empleado();

empleados.add(empleado3);
empleados.add(empleado2);
empleados.add(empleado1);

double sueldoBruto, descuento, sueldoNeto;
double sueldoTotal = 0;

for (Empleado empleado : empleados) {
    sueldoBruto = empleado.sueldoBruto(empleado.getCategoria());
    descuento = empleado.descuento(sueldoBruto);
    sueldoNeto = empleado.sueldoNeto(sueldoBruto, descuento);

    txaResultado.append("\n Código\t: " + empleado.getCodigo() + "\n"
            + " Nombre\t: " + empleado.getNombre() + "\n"
            + " Celular\t: " + empleado.getCelular() + "\n"
            + " Categoría\t: " + empleado.getCategoria() + "\n"
            + " Sueldo Bruto\t: " + sueldoBruto + "\n"
            + " Descuento\t: " + descuento + "\n"
            + " Sueldo Neto\t: " + sueldoNeto + "\n");

    sueldoTotal += sueldoNeto;
}

txaResultadoGeneral.append("\n Cant. Empleados\t: " + empleados.size()
        + "\n Valor de Descuento\t: " + Libreria.DESC + "%"
        + "\n Suma Sueldo Neto\t: " + sueldoTotal);
```
#### Código clase Empleado.java
```java
package clases;
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
```
#### Código clase Libreria.java
```java
package lib;

public class Libreria {
    public static final double DESC = 0.15;
}
```
