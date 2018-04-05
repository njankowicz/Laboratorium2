package Bryly;

public class Kula extends Punkt {

    protected float promien;

    // konstruktor domyslny
    public Kula()
    {
        super();
        this.promien=2f;
    }

    //konstrukor z parametrami
    public Kula(float masa, float promien)
    {
        super(masa);
        this.promien=promien;
    }

//gettery

    public float getPromien()
    {
        return promien;
    }

//settery

    public void setPromien(float promien)
    {
        this.promien=promien;
    }

// przeciazanie metod

    public float GlownyMoment()
    {
        return 2f/5f*masa*promien*promien;
    }

    public void Opis() {
        System.out.println("Kula ");
    }


}
