
/**
 * Esta clase es responsable de almacenar los diálogos en español de tipo String utilizados en el juego.
 * En él tenemos todas las frases y comandos necesarios para montar la trama de World of Investigation.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class Spanish implements InterfaceLang {

    // comandos válidos para el jugador, simplemente concatenar el comando a la habitación / pasillo deseado.
    @Override
    public String[] validCommands() {
        String[] commands = {"ir", "mira", "inspeccionar", "tomar", "soltar", "mochila",
            "mapa", "salir", "ayuda"};
        return commands;
    }

    // este método crea y almacena las habitaciones principales en una matriz.
    @Override
    public String[] rooms() {

        String[] createRooms = new String[21];

        createRooms[0] = "en el primer piso, al comienzo del pasillo";
        createRooms[1] = "en el primer piso, en medio del pasillo";
        createRooms[2] = "en el primer piso, al final del pasillo";
        createRooms[3] = "en el segundo piso, al comienzo del pasillo";
        createRooms[4] = "en el segundo piso, en medio del pasillo";
        createRooms[5] = "en el segundo piso, al final del pasillo";

        createRooms[6] = "en el Cuarto 1";
        createRooms[7] = "en el Cuarto 2";
        createRooms[8] = "en el Cuarto 3";
        createRooms[9] = "en el Cuarto 4";
        createRooms[10] = "en el Cuarto 5";
        createRooms[11] = "en el Cuarto 6";
        createRooms[12] = "en el Cuarto 7";
        createRooms[13] = "en el Cuarto 8";
        createRooms[14] = "en el Cuarto 9";
        createRooms[15] = "en el Cuarto 10";
        createRooms[16] = "en el Cuarto 11";
        createRooms[17] = "en el Cuarto 12";
        createRooms[18] = "en el Cuarto 13";
        createRooms[19] = "en el Cuarto 14";

        createRooms[20] = "en el Coche de la Policía";

        return createRooms;
    }

    // este método crea y almacena las salidas en una matriz.
    @Override
    public String[] exits() {

        String[] createExits = new String[21];

        createExits[0] = "cuarto 1";
        createExits[1] = "cuarto 2";
        createExits[2] = "cuarto 3";
        createExits[3] = "cuarto 4";
        createExits[4] = "cuarto 5";
        createExits[5] = "cuarto 6";
        createExits[6] = "cuarto 7";
        createExits[7] = "cuarto 8";
        createExits[8] = "cuarto 9";
        createExits[9] = "cuarto 10";
        createExits[10] = "cuarto 11";
        createExits[11] = "cuarto 12";
        createExits[12] = "cuarto 13";
        createExits[13] = "cuarto 14";
        createExits[14] = "adelante";
        createExits[15] = "atras";
        createExits[16] = "piso de arriba";
        createExits[17] = "andar de bajo";
        createExits[18] = "salon";
        createExits[19] = "coche de policia";
        createExits[20] = "hotel";

        return createExits;
    }

    // estos son los elementos que se pueden encontrar al azar.
    @Override
    public String[][] items() {
        String[][] items = new String[24][2];

        items[0][0] = "cama";
        items[0][1] = "el más cómodo del mundo";

        items[1][0] = "laptop";
        items[1][1] = "poderoso, pero limitado";

        items[2][0] = "celda";
        items[2][1] = "iphone de primera línea";

        items[3][0] = "estera";
        items[3][1] = "muy suave y acogedor";

        items[4][0] = "cortina";
        items[4][1] = "ayuda a ocultar la luz del sol";

        items[5][0] = "mesa";
        items[5][1] = "con algunos accesorios";

        items[6][0] = "cuadro";
        items[6][1] = "una pintura de Vincent Van Gogh";

        items[7][0] = "silla";
        items[7][1] = "muy bueno para la columna y contribuye a la postura";

        items[8][0] = "aire condicionado";
        items[8][1] = "nadie puede vivir en este calor";

        items[9][0] = "estanteria";
        items[9][1] = "hermosos libros están aquí";

        items[10][0] = "televisor";
        items[10][1] = "estamos viendo la copa 2022 aquí";

        items[11][0] = "minibar";
        items[11][1] = "un trago va bien, pero el precio es absurdo";

        items[12][0] = "caja fuerte";
        items[12][1] = "donde guardamos objetos preciosos";

        items[13][0] = "mochila";
        items[13][1] = "parece viejo, pero es muy voluminoso";

        items[14][0] = "bolsa";
        items[14][1] = "tiene detalles dorados, debe valer una fortuna";

        items[15][0] = "taza";
        items[15][1] = "alguien bebió un jugo de naranja aquí ayer";

        items[16][0] = "plato";
        items[16][1] = "con sobras de pescado de la cena de ayer";

        items[17][0] = "bote de basura";
        items[17][1] = "hay mucha basura, la criada no ha pasado por aquí todavía";

        items[18][0] = "lampara";
        items[18][1] = "iluminada, una pareja puede haber tenido una hermosa noche romántica en esta habitación";

        items[19][0] = "maleta grande";
        items[19][1] = "está relleno, esto es sospechoso ...";

        items[20][0] = "clave";
        items[20][1] = "parece ser la llave electrónica de la habitación";

        items[21][0] = "sillon";
        items[21][1] = "hombre, parece un sillón de masaje, tan cómodo";

        items[22][0] = "telefono";
        items[22][1] = "mas viejo que Atari";

        items[23][0] = "caja";
        items[23][1] = "¿Qué se puede esconder aquí?";

        return items;

    }

    // a partir de ahora tenemos los diálogos usados ​​en WoI.
    @Override
    public void goGame() {
        System.out.println("¡Vamos al juego!");
        System.out.println("Buena suerte jugador...\n");
    }

    @Override
    public void welcome1() {
        System.out.println();
        System.out.println("¡Bienvenido al World of Investigation!");
        System.out.println("Aventúrate como policía y descubre la droga ilegal con tu perro.");
        System.out.print("Empiezas con ");
    }

    @Override
    public void welcome2() {
        System.out.println(" bocadillos y puedes encontrar más en las habitaciones para tu perro.");
        System.out.println("Tu perro tiene un 'nivel de felicidad' que al final del juego debe ser de al menos 10 para que ganes el juego.");
        System.out.print("Este nivel se encuentra actualmente en ");
    }

    @Override
    public void welcome3() {
        System.out.println(" y puedes hacer que tu perro sea más feliz durante el juego encontrando bocadillos.");
        System.out.println("Cada vez que te mueves en el juego, tu perro pierde 1 'nivel de felicidad'");
        System.out.println("¡Puedes recoger y dejar algunos artículos de las habitaciones!");
        System.out.println("Escriba 'ayuda' si necesita ayuda.");
        System.out.println("Entrando al hotel...");
        System.out.println();
    }

    @Override
    public void invalidCommand() {
        System.out.println("No se a que te refieres...");
    }

    @Override
    public void inspectWhat() {
        System.out.println("Inspeccionar lo que??");
    }

    @Override
    public void goWhere() {
        System.out.println("¿Ir adonde?");
    }

    @Override
    public void noDoor() {
        System.out.println("No hay puerta!");
    }

    @Override
    public void yourSnacks() {
        System.out.print("Tus bocadillos: ");
    }

    @Override
    public void yourHappinesslvl() {
        System.out.print("Nivel de felicidad: ");
    }

    @Override
    public void drugFound1() {
        System.out.print("Droga encontrada en ");
    }

    @Override
    public void drugFound2() {
        System.out.println(". ¡Felicidades!!");
    }

    @Override
    public void snackFound1() {
        System.out.print("Encontraste ");
    }

    @Override
    public void snackFound2() {
        System.out.println(" bocadillo(s).");
    }

    @Override
    public void happinessFound1() {
        System.out.print("Tu perro ganó ");
    }

    @Override
    public void happinessFound2() {
        System.out.println(" nivel(es) de felicidad.");
    }

    @Override
    public void gameOver1() {
        System.out.println("¡Game Over! Tus bocadillos terminaron!");
    }

    @Override
    public void gameOver2() {
        System.out.println("¡Game Over! Desafortunadamente, la felicidad de su perro es menos de 10.");
    }

    @Override
    public void drugNotFound() {
        System.out.println("¡Droga no encontrada! Seguir mirando.");
    }

    @Override
    public void itemNotExist() {
        System.out.println("Este artículo no existe.");
    }

    @Override
    public void printHelp1() {
        System.out.println("Eres policía. Estas solo con tu perro.");
        System.out.println("El coche es tu casa, puedes vaciar tu mochila llevando elementos de las habitaciones al coche.");
        System.out.println("Tu trabajo principal es registrar las habitaciones del hotel con tu perro y encontrar la droga ilegal.");
        System.out.println("Só existe uma sala com a droga ilegal.");
        System.out.println();
        System.out.print("Tus bocadillos: ");
    }

    @Override
    public void printHelp2() {
        System.out.println("Los comandos son: ");
    }

    @Override
    public void thanksForPlaying() {
        System.out.println("Gracias por jugar. Hasta luego.");
    }

    @Override
    public void quit() {
        System.out.println("¿Quieres irte?");

    }

    // para la clase "room".
    @Override
    public String wordRoomLocation() {
        return "Tu estas ";
    }

    @Override
    public String wordRoomExit() {
        return "Salidas:";
    }

    // para la clase "item".
    @Override
    public String wordItemSee() {
        return "Ves un(a) ";
    }

    @Override
    public String wordItemWeight() {
        return "peso: ";
    }

    @Override
    public void takeWhat() {
        System.out.println("¿Tomar qué?");
    }

    @Override
    public void takeItem1() {
        System.out.print("Agregaste el ");
    }

    @Override
    public void takeItem2() {
        System.out.println(" en tu mochila.");
    }

    @Override
    public void takeBagFull() {
        System.out.println("¡Tu mochila está llena!");
    }

    @Override
    public void takeHeavyItem() {
        System.out.println("Este ítem es tan pesado.");
    }

    @Override
    public void dropWhat() {
        System.out.println("¿Soltar qué?");
    }

    @Override
    public void dropNotAllowed() {
        System.out.println("No está permitido dejar objetos en el salon.");
    }

    @Override
    public void dropDone() {
        System.out.println(" quitado de la mochila.");
    }

    @Override
    public void ItemsBackpack() {
        System.out.println("Elementos de la mochila:");
    }

    @Override
    public void findEvidence() {
        System.out.print("Encuentre la siguiente evidencia y llévala al vehículo: ");
    }

    @Override
    public void evidenceDone() {
        System.out.println("¡Felicidades! Ganaste el juego encontrando la evidencia.");
    }

}
