public class LCD {
    private String status = "Mati";
    private int volume = 50;
    private int brightness = 50;
    private String cable = "HDMI";
    private String Film = "Star Wars";
    private Boolean onAtauOff = true;

    public void namaNim() {
        System.out.println("Tugas 1 :");
        System.out.println("Nama = Muhammad Olfat Faiz");
        System.out.println("NIM = 235150700111021\n");
    }

    public void turnOff() {
        this.status = "Mati";
        this.onAtauOff = false;
    }

    public void turnOn() {
        this.status = "Menyala";
        this.onAtauOff = true;
    }

    public void freeze() {
        this.status = "Freeze";
    }

    public void volumeUp() {
        // Memastikan volume tidak melebihi 100
        if(this.volume > 90) { 
            this.volume = 100;
        } else {
            this.volume += 10;
        }
        
    }

    public void volumeDown() {
        // Memastikan volume tidak kurang dari 0
        if(this.volume < 10) { 
            this.volume = 0;
        } else {
            this.volume -= 10;
        }
    }

    public void setVolume(int volume) {
        // Memastikan volume tidak kurang dari 0 dan tidak lebih dari 100
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        }
        
    }

    public void brightnessUp() {
        // Memastikan brightness tidak melebihi 100
        if(this.brightness > 90) { 
            this.brightness = 100;
        } else {
            this.brightness += 10;
        }
    }

    public void brightnessDown() {
        // Memastikan brightness tidak kurang dari 0
        if(this.brightness < 10) { 
            this.brightness = 0;
        } else {
            this.brightness -= 10;
        }
    }

    public void setBrightness(int brightness) {
        // Memastikan brightness tidak kurang dari 0 dan tidak lebih dari 100
        if(brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else if (brightness < 0) {
            this.brightness = 0;
        }
    }

    public void displayPilihanCable() {
        System.out.println("\nPilihan cable :");
        System.out.println("1) VGA");
        System.out.println("2) DVI");
        System.out.println("3) HDMI");
        System.out.println("4) Display Port");
    }

    public boolean setCable(String cable) {
        String temp = cable.replaceAll("\\s+","").trim().toLowerCase();

        switch(temp) {
            case "1":
            case "vga":
                this.cable = "VGA";
                return false;

            case "2":
            case "dvi":
                this.cable = "DVI";
                return false;

            case "3":
            case "hdmi":
                this.cable = "HDMI";
                return false;

            case "4" :
            case "displayport":
                this.cable = "Display Port";
                return false;

            default:
                System.out.print("\nInput invalid! Ulangi lagi! \n= ");
                return true;
        }
    }

    public void displayPilihanFilm() {
        System.out.println("\nPilihan Film :");
        System.out.println("1) Star Wars");
        System.out.println("2) Final Destination");
        System.out.println("3) Justice League");
    }

    public void NextFilm() {
        switch (this.Film) {
            case "Star Wars":
                this.Film = "Final Destination";
                break;
            case "Final Destination":
                this.Film = "Justice League";
                break;
            case "Justice League":
                this.Film = "Star Wars";
                break;
            default:
                break;
        }
    }

    public void PreviousFilm() {
        switch (this.Film) {
            case "Star Wars":
                this.Film = "Justice League";
                break;
            case "Final Destination":
                this.Film = "Star Wars";
                break;
            case "Justice League":
                this.Film = "Final Destination";
                break;
            default:
                break;
        }
    }

    public boolean setFilm(String film) {
        String temp = film.replaceAll("\\s+","").trim().toLowerCase();

        switch(temp) {
            case "1":
            case "starwars":
                this.Film = "Star Wars";
                return false;

            case "2":
            case "finaldestination":
                this.Film = "Final Destination";
                return false;

            case "3":
            case "justiceleague":
                this.Film = "Justice League";
                return false;

            default:
                System.out.print("\nInput invalid! Ulangi lagi! \n= ");
                return true;
        }
    }

    public void displayOutput() {
        System.out.println("LCD Status     : " + this.status);

        if(this.onAtauOff) {
            System.out.println("Volume         : " + this.volume);
            System.out.println("Brightness     : " + this.brightness);
            System.out.println("Film pilihan   : " + this.Film);
        } else {
            System.out.println("Volume         : - (Status LCD sedang mati)");
            System.out.println("Brightness     : - (Status LCD sedang mati)");
            System.out.println("Film pilihan   : - (Status LCD sedang mati)");
        }

        System.out.println("Cable          : " + this.cable);
        System.out.println();
    }
}
