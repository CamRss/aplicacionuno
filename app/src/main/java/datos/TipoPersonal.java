package datos;

public  abstract class TipoPersonal {

    public String nombre;
    protected double sueldoBruto;
    private double descuento;

    //metodos de acceso (setters y getters)

    public void setSueldoBruto(double s) { sueldoBruto = s;}
    public double getSueldoBruto() { return sueldoBruto;}

    public void setDescuento(double d) {descuento = d;}
    public double getDescuento() {return descuento;}

    public abstract void calcularSueldoBruto();
    public double calcularSueldoNeto()
    {
        return sueldoBruto -  descuento;
    }
}


