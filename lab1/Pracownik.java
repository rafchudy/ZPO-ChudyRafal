import java.time.LocalDate;

public class Pracownik {

    private String nazwisko;
    private double pobory;

    private LocalDate dataZatrudnienia;

    private int id;
    private static int nextId = 1;

    public Pracownik(String nazwisko, double pobory, int year, int month, int day) {
        this.nazwisko = nazwisko;
        this.pobory = pobory;


        dataZatrudnienia = LocalDate.of(year, month, day);

        id = nextId;
        ++nextId;
    }

    public String nazwisko() {
        return nazwisko;
    }

    public double pobory() {
        return pobory;
    }

    public LocalDate dataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void zwiekszPobory(double procent) {
        double podwyzka = pobory * procent / 100;
        pobory += podwyzka;
    }

    public int id() {
        return id;
    }

    public void setId() {
        id = nextId;
        ++nextId;
    }

    public static int getNextId() {
        return nextId;
    }


}
