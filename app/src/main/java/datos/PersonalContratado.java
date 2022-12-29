package datos;

public class PersonalContratado extends TipoPersonal
{
    public double tarifaXHora;
    public double nroHorasTrabajadas;

    @Override
    public void calcularSueldoBruto()
    {
        sueldoBruto = tarifaXHora * nroHorasTrabajadas;
    }
}
