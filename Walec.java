package Bryly;
public class Walec extends Punkt {
protected float wysokosc;
protected float promien;
// konstruktor domyslny
    public Walec()
    {
    super();
    this.wysokosc=5f;
    this.promien=2f;
    }
//konstrukor z parametrami
    public Walec(float masa, float wysokosc, float promien)
    {
        super(masa);
        this.wysokosc=wysokosc;
        this.promien=promien;
    }
//gettery
    public float getWysokosc()
    {
      return wysokosc;
    }

    public float getPromien()
    {
        return promien;
    }
//settery

    public void setWysokosc(float wysokosc)
    {
        this.wysokosc=wysokosc;
    }

    public void setPromien(float promien)
    {
        this.promien=promien;
    }

// przeciazanie metod

    public float GlownyMoment()
    {
     return 3f/12f*masa*promien*promien+1f/12f*masa*wysokosc*wysokosc;
    }

    public void Opis() {
        System.out.println("Walec ");
    }
}
