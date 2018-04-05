package Bryly;
public class Punkt {
    // Deklaracja masy punktu materialnego
    protected float masa;
    // Konstruktor domyslny
    public Punkt()
    {
    this.masa=10F;
    }
    //Konstruktor z parametrami
    public Punkt(float masa)
    {
    this.masa=masa;
    }
    //Metoda liczaca glowny moment bezwladnosci
    public float GlownyMoment()
    {
        return 0;
    }
    //Metoda liczaca moment bezwladnosci ze Steinera
    public float MomentSteiner(float odleglosc)
    {
    return GlownyMoment() + masa*odleglosc*odleglosc;
    }
    //Metoda z opisem
    public void Opis()
    {
        System.out.println("Punkt materialny ");
    }
    //Metoda wyswietlania parametrow
    public void WyswPara()
    {
        System.out.println("Masa rowna sie: " + masa);
        System.out.println("Moment glowny rowna sie: " + GlownyMoment());
    }
    //Metoda zmiany masy
    public void ZmienMase(float nowaMasa)
    {
        this.masa = nowaMasa;

    }
    public float getMasa()
    {
        return this.masa;
    }

    public void setMasa(float masa)
    {
        this.masa=masa;
    }

}
