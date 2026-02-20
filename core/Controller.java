package core;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void run(){
        private List<Song> canciones;
        private List<Playlist> playlist;

        Menu menu;

        public Controller(){
            canciones = new ArrayList<Song>();
            playlist = new ArrayList<Playlist>();
            menu = new MenuController();
        }
        while (true) {
            menu.show("el menu es este");
            //escoger opcion
            Integer opcion = menu.getInteger();
            //hacer cosas segun la opcion
            while (opcion) {
                case 1 -> opcion1();
                case 2 -> opcion2();
            }
        }
    }
    private void opcion1(){

    }

    private void opcion2(){
    
    }
}