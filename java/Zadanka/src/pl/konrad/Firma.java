package pl.konrad;

public class Firma{
    public static void main(String args[]){
        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();
        Pracownik pracownik3 = new Pracownik();

        pracownik1.name = "Staszek";
        pracownik1.surName = "Ptaszek";
        pracownik1.age  = 35;

        pracownik2.name = "Konrad";
        pracownik2.surName = "Pulchny";
        pracownik2.age  = 24;

        pracownik3.name = "Monika";
        pracownik3.surName = "Litwa";
        pracownik3.age  = 22;

        System.out.println("Pracownicy firmy to:");
        System.out.println(pracownik1.name+" "+pracownik1.surName+", "+pracownik1.age+" lat");
        System.out.println(pracownik2.name+" "+pracownik2.surName+", "+pracownik2.age+" lat");
    }
}