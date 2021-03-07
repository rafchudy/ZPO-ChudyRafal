public class RachunekBankowy {
    public static double rocznaStopaProcentowa;

    private double saldo;

    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki(){


        saldo = this.saldo + (saldo * rocznaStopaProcentowa) / 12;
    }

//    public double stanKonta(){
//        saldo = saldo + obliczMiesieczneOdsetki();
//        return saldo ;
//    }



    public static double getRocznaStopaProcentowa() {
        return rocznaStopaProcentowa;
    }

    public static void setRocznaStopaProcentowa(double rocznaStopa) {
        rocznaStopaProcentowa = rocznaStopa;
    }

    @Override
    public String toString() {
        return "Saldo = "+ saldo;
    }
}