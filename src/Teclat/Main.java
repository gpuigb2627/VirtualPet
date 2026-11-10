package Teclat;

public class Main {

    public static void main(String[] args) {
        System.out.print("Introduce el nombre de la mascota: ");
        String nombre = Teclat.llegirString();

        System.out.print("Introduce el tipo de mascota (perro/gato): ");
        String tipo = Teclat.llegirString();

        Mascota miMascota = new Mascota(nombre, tipo);
        Mascota maniqui = new Mascota("Maniquí", "muñeco", 100);


        while (miMascota.estaViva()) {
            System.out.println("-----Menu Mascota-----");
            System.out.println("1. Menjar");
            System.out.println("2. Dormir");
            System.out.println("3. Jugar");
            System.out.println("4. Netejar");
            System.out.println("5. Atacar maniqui");
            System.out.print("Tria una opció: ");

            int opcio = Teclat.llegirInt();

            if (opcio == 1) {
                miMascota.comer();
            } else if (opcio == 2) {
                miMascota.dormir();
            } else if (opcio == 3) {
                miMascota.jugar();
            } else if (opcio == 4) {
                miMascota.limpiar();
            } else if (opcio == 5) {
                System.out.print("Quantes vegades vols atacar? ");
                int vegades = Teclat.llegirInt();
                miMascota.atacar(maniqui, vegades);
            } else {
                System.out.println("Opció no vàlida.");
            }
        }

        System.out.println("La teva mascota ha mort ");
    }
}