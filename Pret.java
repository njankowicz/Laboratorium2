package Bryly;

public class Pret extends Punkt {

    protected float dlugosc;

    // konstruktor domyslny
    public Pret()
    {
        super();
        this.dlugosc=2f;
    }

    //konstrukor z parametrami
    public Pret(float masa, float dlugosc)
    {
        super(masa);
        this.dlugosc=dlugosc;
    }

//gettery

    public float getDlugosc()
    {
        return dlugosc;
    }

//settery

    public void setDlugosc(float dlugosc)
    {
        this.dlugosc=dlugosc;
    }

// przeciazanie metod

    public float GlownyMoment()
    {
        return 1f/12f*masa*dlugosc*dlugosc;
    }

    public void Opis() {
        System.out.println("Pret ");
    }



}
