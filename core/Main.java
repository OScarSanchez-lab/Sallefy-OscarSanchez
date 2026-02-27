package core;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        setupData(controller);

        String op = "";
        while (!op.equals("Q")) {
            System.out.println("☻☺■■■ LASALLEFY ■■■☺☻");
            System.out.println("1. Ver Canciones | 2. Playlists | 3. Reproducir | Q. Salir");
            op = sc.nextLine().toUpperCase();

            switch (op) {
                case "1" -> controller.getLibrary().forEach(System.out::println);
                case "2" -> managePlaylists(controller, sc);
                case "3" -> {
                    System.out.print("Introduce ID de la canción (1, 2 o 3): ");
                    controller.playSong(sc.nextLine());
                }
            }
        }
    }

    private static void setupData(Controller controller) {
        Song tetris = new Song(1, "Tetris Theme", "Hirokazu Tanaka", 2, Mood.HAPPY, "8-bit");
        tetris.getNotes().add(new Note(659, 400, WaveType.SQUARE)); // Mi (E5)
        tetris.getNotes().add(new Note(494, 200, WaveType.SQUARE)); // Si (B4)
        tetris.getNotes().add(new Note(523, 200, WaveType.SQUARE)); // Do (C5)
        tetris.getNotes().add(new Note(587, 400, WaveType.SQUARE)); // Re (D5)
        tetris.getNotes().add(new Note(523, 200, WaveType.SQUARE)); // Do
        tetris.getNotes().add(new Note(494, 200, WaveType.SQUARE)); // Si
        tetris.getNotes().add(new Note(440, 400, WaveType.SQUARE)); // La (A4)
        controller.addSong(tetris);
        Song mario = new Song(2, "Super Mario", "Koji Kondo", 2, Mood.HAPPY, "Nintendo");
        int dur = 150;
        mario.getNotes().add(new Note(659, dur, WaveType.SQUARE)); // Mi
        mario.getNotes().add(new Note(659, dur, WaveType.SQUARE)); // Mi
        mario.getNotes().add(new Note(0, dur, WaveType.SQUARE));   // Silencio
        mario.getNotes().add(new Note(659, dur, WaveType.SQUARE)); // Mi
        mario.getNotes().add(new Note(0, dur, WaveType.SQUARE));   // Silencio
        mario.getNotes().add(new Note(523, dur, WaveType.SQUARE)); // Do
        mario.getNotes().add(new Note(659, dur, WaveType.SQUARE)); // Mi
        mario.getNotes().add(new Note(784, dur * 2, WaveType.SQUARE)); // Sol
        controller.addSong(mario);
        Song aquatic = new Song(3, "Aquatic Ambience", "Scizzie/Evelyn", 5, Mood.RELAX, "Ambient");
        aquatic.getNotes().add(new Note(293, 1000, WaveType.SINE)); // Re (D4)
        aquatic.getNotes().add(new Note(329, 1000, WaveType.SINE)); // Mi (E4)
        aquatic.getNotes().add(new Note(392, 1000, WaveType.SINE)); // Sol (G4)
        aquatic.getNotes().add(new Note(440, 2000, WaveType.SINE)); // La (A4)
        controller.addSong(aquatic);
    }
    private static void managePlaylists(Controller controller, Scanner sc) {
        System.out.println("A. Crear | B. Listar | C. Añadir Canción");
        String sub = sc.nextLine().toUpperCase();
        if (sub.equals("A")) {
            System.out.print("ID: "); String id = sc.nextLine();
            System.out.print("Nombre: "); String nom = sc.nextLine();
            controller.createPlaylist(id, nom, "");
        } else if (sub.equals("B")) {
            controller.getPlaylists().forEach(p -> controller.printPlaylistStats(p.getId()));
        } else if (sub.equals("C")) {
            System.out.print("ID Playlist: "); String pId = sc.nextLine();
            System.out.print("ID Canción: "); String sId = sc.nextLine();
            controller.addSongToPlaylist(pId, sId);
        }
    }
}