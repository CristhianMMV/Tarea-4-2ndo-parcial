
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camello extends Mamifero
{
    private String material;
    int herradura = 4;
        /**
         * ELIGA EL MATERIAL PARA MONTAR EL CABELLO: solo puede elegir entre CUERO O METAL.
        */
        public void Montar(String m){
        if(m == "Cuero" || m =="CUERO" || m =="cuero" || m == "METAL" || m == "Metal" || m == "metal"){
            this.material = m;
            System.out.println("Se a montado en el camello con la montura de: " + m + " ,ademas le coloco " + herradura + " herraduras");
        }else{
            System.out.println("solo puede elegir entre Metal o Cuero");
        }
    }
    public void almacenar(){
        System.out.println("El camello almacenó agua en sus 2 gibas");
    }
    public String Colorpelo(){
        super.Colorpelo = "de este Camello es: Mostaza";
        super.Colorpelo();
        return "Mostaza";
    }
    public String sonido(){
        super.sonido = "este Camello dice: Bfffa Bfffa";
        super.sonido();
        return "bffa bfffa";
    }
    public String habitat(){
        super.habitat = "el Camello vive en los desiertos";
        super.habitat();
        return "Desierto";
    }
}
