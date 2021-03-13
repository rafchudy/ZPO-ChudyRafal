public class TestPracownikVer1 {
    public static void main(String[] args) {
        Pracownik[] personel = new Pracownik[3];


        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);


        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }


        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tid = " + e.id());
            System.out.print("\t pobory = " + e.pobory());
            System.out.printf("\t dataZatrudnienia = %tF \n", e.dataZatrudnienia());
        }
        System.out.println();

        int n = Pracownik.getNextId();
        System.out.println("Następny dostępny id = " + n);

    }
}
