public class Convertir
{
    private float velocidad;
    
    public Convertir()
    {
        this.velocidad = 0;
    }
    
    public double kilometrosPorHora()
    {
        return velocidad * 3.6;
    }
    
    public void setVelocidad(float n)
    {
        this.velocidad = n;
    }
    
    public float getVelocidad()
    {
        return velocidad;
    }
}