package core;
import java.util.Scanner;

public interface Menu {
    public void show(String s);
    public Integer getInteger();
    public String getString();
    public static void main(String[] args) {
    
        Scanner sca = new Scanner(System.in);
        System.out.println("■■■ Lasallefy ■■■");
        System.out.println("    1. Gestionar canciones");
        System.out.println("    2. Gestionar playlist");
        System.out.println("    3. Reproducir");
        System.out.println("    Q. Salir");
        String opcion = sca.nextLine();
        switch (opcion) {
            case "1":

                
                break;
        
            default:
                break;
        }
    }
}
