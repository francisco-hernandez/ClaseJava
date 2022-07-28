package Coche; //Se le declara un paquete

public class Coche
{
    public int NPuertas;

    public Coche()
    {
        NPuertas = 4; //Iniciamos el NPuertas a 0
    }

    public int SumarPuerta( int a)
    {
        return (NPuertas+a);//Método para sumar una puerta mas
    }

}
