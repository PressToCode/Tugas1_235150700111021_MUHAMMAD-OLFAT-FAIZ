import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        LCD[] layar = new LCD[4];

        // Manual input
        layar[1] = new LCD();
        layar[1].turnOff();
        layar[1].brightnessUp();
        layar[1].setVolume(46);
        layar[1].NextFilm();
        layar[1].setCable("Display Port");

        layar[2] = new LCD();
        layar[2].freeze();
        layar[2].setBrightness(22);
        layar[2].volumeDown();
        layar[2].PreviousFilm();
        layar[2].setCable("VGA");

        // User input
        Scanner Input = new Scanner(System.in);

        layar[3] = new LCD();
        layar[3].turnOn();
        
        System.out.print("\nMasukkan tingkat brightness = ");
        layar[3].setBrightness(Input.nextInt());
        Input.nextLine();

        System.out.print("\nMasukkan tingkat volume = ");
        layar[3].setVolume(Input.nextInt());
        Input.nextLine();

        layar[3].displayPilihanCable();
        System.out.print("\nMasukkan jenis cable = ");
        while(layar[3].setCable(Input.nextLine()));

        layar[3].displayPilihanFilm();
        System.out.print("\nMasukkan pilihan film = ");
        while(layar[3].setFilm(Input.nextLine()));
        Input.close();

        cleanTerminal();
        layar[1].namaNim();
        layar[1].displayOutput();
        layar[2].displayOutput();
        layar[3].displayOutput();
    }

    private static void cleanTerminal() {
        // * Membersihkan Terminal
        System.out.print("\033[H\033[2J");

        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
