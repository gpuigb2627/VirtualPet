package Teclat;

public class Mascota {

    private String nombre;
    private String tipo;
    private double energia;
    private double higiene;
    private double peso;
    private double estadoDeanimo;
    private String anim;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = (int) (Math.random() * 21) + 40;
        this.higiene = (int) (Math.random() * 21) + 40;
        this.peso = (int) (Math.random() * 21) + 40;
        this.estadoDeanimo = (int) (Math.random() * 21) + 40;
    }

    public boolean estaViva() {
        if (energia <= 0 || energia > 100 ||
                higiene <= 0 || higiene > 100 ||
                peso <= 0 || peso > 100 ||
                estadoDeanimo <= 0 || estadoDeanimo > 100) {
            return false;
        }
        return true;
    }

    public void dormir() {
        if (this.tipo.equals("perro")) {
            this.energia += 25;
        } else if
        (this.tipo.equals("gato")) {
            this.energia += 20;
        }
        this.estadoDeanimo += 10;

        System.out.println("\n--- " + this.nombre.toUpperCase() + " HA DORMIT ---");
        System.out.println("▲ Energia: " + this.energia);
        System.out.println("▲ Ànim (+10): " + this.anim);
    }

    public void jugar() {
        this.energia -= 20;
        this.estadoDeanimo += 20;
        this.peso -= 10;

        System.out.println("\n--- HAS JUGAT AMB " + this.nombre.toUpperCase() + " ---");
        System.out.println("▼ Energia (-20): " + this.energia);
        System.out.println("▲ Ànim (+20): " + this.anim);
        System.out.println("▼ Pes (-10): " + this.peso);
    }

    public void comer() {
        this.energia += 10;
        this.higiene -= 15;
        this.peso += 10;

        System.out.println("\n--- HAS DONAT DE MENJAR A " + this.nombre.toUpperCase() + " ---");
        System.out.println("Energia (+10): " + this.energia);
        System.out.println("▼ Higiene (-15): " + this.higiene);
        System.out.println("▲ Pes (+10): " + this.peso);
    }

    public void limpiar() {
        if (this.tipo.equals("perro")){
            this.energia -= 10;
            this.higiene += 25;
            this.estadoDeanimo -= 15;

            System.out.println("\n--- 🚿 HAS NETEJAT A " + this.nombre.toUpperCase() + " ---");
            System.out.println("▼ Energia: " + this.energia);
            System.out.println("▲ Higiene (+25): " + this.higiene);
            System.out.println("▲/▼ Ànim: " + this.anim);
        } else if
        (this.tipo.equals("gato")) {
            this.energia -= 5;
            this.higiene += 25;
            this.estadoDeanimo += 5;

            System.out.println("\n--- HAS NETEJAT A " + this.nombre.toUpperCase() + " ---");
            System.out.println("▼ Energia: " + this.energia);
            System.out.println("▲ Higiene (+25): " + this.higiene);
            System.out.println("▲/▼ Ànim: " + this.anim);
        }


    }
    public Mascota(String nombre, String tipo, double valorInicial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = valorInicial;
        this.higiene = valorInicial;
        this.peso = valorInicial;
        this.estadoDeanimo = valorInicial;
    }
public void atacar (Mascota maniqui, int vegades) {
    System.out.println("\n--- ⚔️ ATACANT AL MANIQUÍ (" + vegades + " vegades) ---");
        for (int i = 0; i < vegades; i++){
        this.energia -= 3;
        this.higiene -= 3;
        this.estadoDeanimo -= 3;

        maniqui.energia -=3;
        maniqui.higiene -= 3;
        maniqui.estadoDeanimo -=3;
        }

    System.out.println("▼ Nova Energia de " + this.nombre + ": " + this.energia);
    System.out.println("▼ Nova Higiene: " + this.higiene);
    System.out.println("▼ Nou Ànim: " + this.anim);
}






}
