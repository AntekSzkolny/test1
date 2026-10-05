import java.time.LocalDate;
import java.time.LocalTime;

class Egzamin {
    public String nazwa_przedmiotu;
    private LocalDate data;
    private LocalTime godzina_rozpoczecia;
    private LocalTime godzina_zakonczenia;

    public Egzamin(String nazwa_przedmiotu, LocalDate data,
                   LocalTime godzina_rozpoczecia) {
        this.nazwa_przedmiotu = nazwa_przedmiotu;
        this.data = data;
        this.godzina_rozpoczecia = godzina_rozpoczecia;
        this.godzina_zakonczenia = null;
    }

    public void start() {
        godzina_rozpoczecia = LocalTime.of(12, 0);
    }

    public void stop() {
        godzina_zakonczenia = godzina_rozpoczecia.plusMinutes(120);
    }

    public void wyswietlInformacje() {
        System.out.println("Przedmiot: " + nazwa_przedmiotu);
        System.out.println("Data: " + data);
        System.out.println("Godzina rozpoczęcia: " + godzina_rozpoczecia);
        System.out.println("Godzina zakończenia: " + godzina_zakonczenia);
    }
}

public class Main {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();

        Egzamin e_programowanie = new Egzamin("Programowanie aplikacji", d1, LocalTime.of(12, 0));

        e_programowanie.start();

        e_programowanie.stop();

        e_programowanie.wyswietlInformacje();
    }
}
