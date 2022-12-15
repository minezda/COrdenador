
public class COrdenador
{
    String marca="";
    String procesador="";
    int peso=0;
    boolean encendido= false;
    boolean pantalla = false;
    
    public COrdenador(String marca, String procesador,int peso)
    {
        this.marca= marca;
        this.procesador = procesador;
        this.peso = peso;
    }
    public void ponerceEnMarcha()
    {
        if(encendido== false)
        {
            encendido = true;
        }
    }
    public void apagar()
    {
        if(encendido== true)
        {
            encendido = false;
        }
    }
    public void estado()
    {
        System.out.println("El estado del equipo es el siguiente");
        System.out.println("Marca "+ marca);
        System.out.println("Procesador "+procesador);
        System.out.println("Peso "+ peso);
        
        if(encendido== true)
        {
            System.out.println("El equipo esta encendido");
        }else
        {
            System.out.println("El equipo esta apagado");
        }
        if(pantalla== true)
        {
            System.out.println("La pantalla esta encendida");
        }else
        {
            System.out.println("La pantalla esta apagada");
        }
    }
    public void encenderPrecentacion()
    {
        System.out.println("Hola esta precentacion acaba de ser encendida XD.");
    }
    public void apagarPresentacion()
    {
        System.out.println("Bro apagaste la presentacion :(");
    }
    public void cargarAplicacion()
    {
        System.out.println("Acabas de iniciar word we");
    }
}
