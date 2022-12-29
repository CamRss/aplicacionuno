package datos;

public class PersonalEstable extends TipoPersonal
{
    public int sueldoNominal;
    public int bonificacion;

    @Override
    public void calcularSueldoBruto()
    {
        sueldoBruto = sueldoNominal+ bonificacion;
    }

}
