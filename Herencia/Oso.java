public class Oso extends Mamifero
{
    private String raza;
    private String presa = "Pez";
    /**
     * solo puede ser Pardo o Polar.
     */
    public void Cazar(String raza){
        this.raza = raza;
        if(raza == "Pardo" || raza =="pardo" || raza =="PARDO" || raza == "Polar" || raza == "POLAR" || raza == "polar"){
            System.out.println("el Oso " + raza + " a cazado un " + presa);
        }else{
            System.out.println("Solo puede elegir entre Pardo y Polar");
        }
    }
    public void Hibernar(){
        System.out.println("El oso comió lo suficiente para hibernar o dormir durante un mes");
    }
    public String Colorpelo(String color){
        super.Colorpelo = "de este Oso es: " + color;
        super.Colorpelo();
        return color;
    }
    public String sonido(){
        super.sonido = "este Oso dice: Grrr Grrr";
        super.sonido();
        return "Grr Grr";
    }
    public String habitat(){
        super.habitat = "el Oso puede vivir en los polos o bosques";
        super.habitat();
        return "Polos o Bosques";
    }
}
