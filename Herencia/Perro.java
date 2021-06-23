
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Mamifero
{
    private String reaccion;
    private String nombre;
    public String Acariciar(String nombredelperro){
        this.nombre = nombredelperro;
        reaccion = nombredelperro + " mueve la cola";
        return reaccion;
    }
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    public String Colorpelo(String color){
        super.Colorpelo = "de este Perro es: " + color;
        super.Colorpelo();
        return color;
    }
    public String sonido(){
        super.sonido = "este Perro dice: Guau Guau";
        super.sonido();
        return "Guau";
    }
    public String habitat(){
        super.habitat = "el Perro es de casa o domestico";
        super.habitat();
        return "casa";
    }
}
