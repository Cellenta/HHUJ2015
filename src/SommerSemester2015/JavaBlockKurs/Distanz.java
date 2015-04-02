package SommerSemester2015.JavaBlockKurs;

/**
 * Created by Lightspeed on 26.03.2015.
 */

/*
Implementieren Sie eine Methode int distance(int a, int b), die zwei Integer
als Parameter bekommt und deren Abstand berechnet. Das Programm
soll die beiden Parameter als Kommandozeilen-Parameter entgegennehmen.
$ java Distance 42 5
# 37
$ java Distance 5 11
# 6
*/


public class Distanz
{
    public static void main(String [] args)
    {
        Distanz distanz = new Distanz();

        int a = 4;
        int b = 32;
        distanz.distance(a,b);
    }


    void distance(int a, int b)
    {
        if(a<b)
        {
            System.out.println(b-a);
        }
        else
        {
            System.out.println(a-b);
        }
    }

}
