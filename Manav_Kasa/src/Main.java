import java.util.Scanner;
public class Main
{    public static void main(String[] args) {
    Scanner girdi = new Scanner(System.in);
    double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, toplam, kilo;
    System.out.print("Armut Kaç Kilo? :");
    kilo = girdi.nextDouble();
    double tutar1 = armut * kilo;
    System.out.print("Elma Kaç Kilo? : ");
    kilo = girdi.nextDouble();
    double tutar2 = elma * kilo;
    System.out.print("Domates Kaç Kilo? :");
    kilo = girdi.nextDouble();
    double tutar3 = domates * kilo;
    System.out.print("Muz Kaç Kilo? : ");
    kilo = girdi.nextDouble();
    double tutar4 = muz * kilo;
    System.out.print("Patlıcan Kaç Kilo? :");
    kilo = girdi.nextDouble();
    double tutar5 = patlican * kilo;

    toplam = (tutar1+tutar2+tutar3+tutar4+tutar5);
    System.out.println("Toplam tutar: "+toplam);

}
}
