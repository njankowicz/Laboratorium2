package com.company;

//import calej paczki "Bryly"
        import Bryly.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//metody potrzebne do zadania na 5
public class Main
{
//wyswietlanie menu na ekranie
            public static void menu()
    {
        System.out.println("\n"+
                "\n"+
                "\n"+
                "       Menu                              \n"+
                " Wybierz numerek:                        \n"+
                "                                         \n"+
                " 1. Walec                               \n"+
                " 2. Pręt                                \n"+
                " 3. Kula                                \n"+
                " 4. Koniec                              \n");


                }
        //wybieranie i wczytywanie numerka
                    public static int wybieranie(int wybor)
            {
                    int i = 0;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                while(true)
                    {
                            //wychwytywanie wyjatkow
                                        try
                    {
                                System.out.println("Wybierz numerek od 1-4 ");
                        i=Integer.parseInt(bufferedReader.readLine());
                        if(i>0&&i<=4)
                            {
                                        break;
                        }
                        System.out.println("Zla wartosc");
                    }
                    catch (NumberFormatException e)
                    {
                                System.out.println("Wprowadziles literki");
                    } catch (IOException e) {
                            e.printStackTrace();
                        }
                }

                        wybor=i;
                return wybor;
            }
        //wprowadzanie wartosci potrzebnych do obliczen programu
            public static float wprowadzanie(float wartosc)
            {
                        float i=0;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                while(true)
                    {
                                //wychwytywanie wyjatkow
                                        try
                    {
                                System.out.println("Wprowadz wartosc : ");
                        i=Float.parseFloat(bufferedReader.readLine());
                        if(i>0)
                            {
                                        break;
                        }
                        System.out.println("Zla wartosc");
                    }
                    catch (NumberFormatException e)
                    {
                                System.out.println("Wprowadziles literki");
                    } catch (IOException e) {
                          e.printStackTrace();
                        }
                }

                        wartosc=i;
                return wartosc;

                    }
        //powrot do menu
                    public static void powrot() throws IOException {
                    System.out.println("Wprowadz dowolny znak i wcisnij enter zeby powrocic do menu");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    bufferedReader.readLine();
                }

                //zadanie ze sprawozdania 2
                            public static void main(String[] args) throws InterruptedException, IOException {

                        //1
                               Walec walec1 = new Walec(1f, 5f, 2f);
                Kula kula1 = new Kula(1f, 2f);
                Pret pret1 = new Pret(1f, 6f);

                        //2
                                    walec1.Opis();
                    System.out.println("Moment bezwlasnosci walca rowna sie: " + walec1.GlownyMoment());
                    System.out.println("Moment ze Steinera dla odleglosci 10 rowna sie : " + walec1.MomentSteiner(10f));
                    System.out.println("Dane walca: masa = " + walec1.getMasa() + " wysokosc = " + walec1.getWysokosc() + " promien = " + walec1.getPromien());

                            kula1.Opis();
                    System.out.println("Moment bezwlasnosci kuli rowna sie: " + kula1.GlownyMoment());
                    System.out.println("Moment ze Steinera dla odleglosci 10 rowna sie : " + kula1.MomentSteiner(10f));
                    System.out.println("Dane kuli: masa = " + kula1.getMasa() + " promien = " + kula1.getPromien());

                            pret1.Opis();
                    System.out.println("Moment bezwlasnosci preta rowna sie: " + pret1.GlownyMoment());
                    System.out.println("Moment ze Steinera dla odleglosci 10 rowna sie : " + pret1.MomentSteiner(10f));
                    System.out.println("Dane preta: masa = " + pret1.getMasa() + " promien = " + pret1.getDlugosc());

                     Punkt[] tab = new Punkt[3];
                     tab[0] = new Walec();
                     tab[1] = new Kula();
                    tab[2] = new Pret();

                            //4 i 5
                                    float odleglosc = 10f;
                    int licznik = 0;
                    for (Punkt p:tab)
            {

                            System.out.println("Obiekt numer : " + licznik);
                            p.Opis();
                            System.out.println("Masa obiektu o numerze : " + licznik + " to " + p.getMasa());
                            System.out.println("Moment obiektu o numerze : " + licznik + " to " + p.GlownyMoment());
                            System.out.println("Moment ze Steinera dla odległosci 10 dla obiektu o numerze : " + licznik + " to " +p.MomentSteiner(10f));

                                    if (p.getClass().getTypeName() == "Bryly.Walec")
                            {
                                        System.out.println("Wysokosc dla obiektu o numerze: " +licznik + " to " + ((Walec)p).getWysokosc()) ;
                                System.out.println("Promien dla obiektu o numerze: " +licznik + " to " + ((Walec)p).getPromien()) ;
                            }
                            else if (p.getClass().getTypeName() == "Bryly.Kula")
                            {
                                        System.out.println("Promien dla obiektu o numerze: " +licznik + " to " + ((Kula)p).getPromien()) ;
                            }
                            else if (p.getClass().getTypeName() == "Bryly.Pret")
                            {
                                       System.out.println("Dlugosc dla obiektu o numerze: " +licznik + " to " + ((Pret)p).getDlugosc()) ;
                            }

                                    licznik++;
            }


                            //zadanie na 5.0

                                            int wybor=0;

                        Walec walec5 = new Walec();
                Kula kula5 = new Kula();
                Pret pret5 = new Pret();

                       while(true)
                    {
                                menu();
                    //switch sluzacy do wybierania numerka od 1-4
                            switch (wybieranie(wybor))
            {

                            case 1 :
                            {
                                        System.out.println("Wybrano walec");
                                float masa=0;
                                float wysokosc=0;
                                float promien=0;
                                System.out.println("Wprowadz mase :");
                                masa=wprowadzanie(masa);
                                walec5.setMasa(masa);
                                System.out.println("Wprowadz wysokosc :");
                                wysokosc=wprowadzanie(wysokosc);
                                walec5.setWysokosc(wysokosc);
                                System.out.println("Wprowadz promien :");
                                promien=wprowadzanie(promien);
                                walec5.setPromien(promien);
                                System.out.println("Masa walca wynosi: " + walec5.getMasa());
                                System.out.println("Wysokosc walca wynosi: " + walec5.getWysokosc());
                                System.out.println("Promien walca wynosi: " + walec5.getPromien());
                                Thread.sleep(2000);
                                float odl=0;
                               System.out.println("Wprowadz odleglosc dla osi : ");
                                odl=wprowadzanie(odl);
                                System.out.println("Glowny moment = " + walec5.GlownyMoment());
                                System.out.println("Moment ze Steinera = " + walec5.MomentSteiner(odl));
                                powrot();
                                break;
                            }
                            case 2 :
                            {
                                        System.out.println("Wybrano pret");
                                float masa=0;
                                float dlugosc=0;
                                System.out.println("Wprowadz mase :");
                                masa=wprowadzanie(masa);
                                pret5.setMasa(masa);
                                System.out.println("Wprowadz dlugosc :");
                                dlugosc=wprowadzanie(dlugosc);
                                pret5.setDlugosc(dlugosc);
                               System.out.println("Masa preta wynosi: " + pret5.getMasa());
                                System.out.println("Dlugosc preta wynosi: " + pret5.getDlugosc());
                                Thread.sleep(2000);
                                float odl=0;
                                System.out.println("Wprowadz odleglosc dla osi : ");
                                odl=wprowadzanie(odl);
                                System.out.println("Glowny moment = " + pret5.GlownyMoment());
                                System.out.println("Moment ze Steinera = " + pret5.MomentSteiner(odl));
                                powrot();
                                break;
                            }

                                   case 3 :
                            {
                                        System.out.println("Wybrano kule");
                                float masa=0;
                                float promien=0;
                                System.out.println("Wprowadz mase :");
                                masa=wprowadzanie(masa);
                                kula5.setMasa(masa);
                                System.out.println("Wprowadz dlugosc :");
                                promien=wprowadzanie(promien);
                                kula5.setPromien(promien);
                                System.out.println("Masa kuli wynosi: " + kula5.getMasa());
                                System.out.println("Promien kuli wynosi: " + kula5.getPromien());
                                Thread.sleep(2000);
                                float odl=0;
                                System.out.println("Wprowadz odleglosc dla osi : ");
                                odl=wprowadzanie(odl);
                                System.out.println("Glowny moment = " + kula5.GlownyMoment());
                                System.out.println("Moment ze Steinera = " + kula5.MomentSteiner(odl));
                                powrot();
                                break;
                            }
                            case 4 :
                            {
                                        System.exit(0);
                                break;
                            }
            }
     }
                }
    }
