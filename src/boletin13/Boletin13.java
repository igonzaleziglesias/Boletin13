
package boletin13;

public class Boletin13 {

    
    public static void main(String[] args) {
        SeleccionFutbol equipo = new SeleccionFutbol();
        Xogador unXogador = new Xogador();
        Adestrador unAdestrador = new Adestrador();
        Masaxista unMasaxista = new Masaxista();
        
        unXogador.concentrarse();
        unAdestrador.concentrarse();
        unMasaxista.concentrarse();
        
        unXogador.viajar();
        unAdestrador.viajar();
        unMasaxista.viajar();
        //podese invocar un metodo da superclase con un obxeto dunha subclase
        //equipo.jugarPartido(); no se puede invocar un metodo da subclase con un obxeto do tipo da superclase
        
        
        /*
        System.out.println(unXogador.toString());
        System.out.println("\n"+unAdestrador.toString());
        System.out.println("\n"+unMasaxista.toString());
*/
    }
    
}
