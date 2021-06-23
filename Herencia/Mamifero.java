public class Mamifero
{
    protected String sonido;
    protected String Colorpelo;
    protected String nacimiento = "Vientre de la madre";
    protected String habitat;
    public String  sonido(){
         this.sonido = sonido;
         System.out.println("todos los mamiferos tienen un sonido caracteristico " + sonido);
         return "todos los mamiferos tienen un sonido caracteristico" + sonido;
    }
    public String Colorpelo(){
        this.Colorpelo = Colorpelo; 
        System.out.println("todos los mamiferos tienen un color de pelo caracteristico " + Colorpelo);
         return "todos los mamiferos tienen color de pelo caracteristico" + Colorpelo;
    }
    public String habitat(){
        System.out.println("todos los mamiferos tienen su propio Habitat "+ habitat);
         return "todos los mamiferos tienen su propio Habitat" + habitat;
    }
    public void Datos(){
        System.out.println("Todo mamifero se alimenta de las mamas de la hembras");
    }
    public void Datos2(){
        System.out.println("Todo mamifero tiene pelos en el cuerpo");
    }
    public void Datos3(){
        System.out.println("Todo mamifero nace del " + nacimiento);
    }
}
