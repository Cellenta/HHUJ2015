package SommerSemester2015.JavaBlockKurs;

/**
 * Created by Lightspeed on 26.03.2015.
 */

/*
Implementieren Sie eine Methode int[] crossproduct(int[] a, int[] b),
die zwei Vektoren als Integer-Arrays als Parameter bekommt und deren Kreuzprodukt
berechnet. Die Übergabe der Parameter an das Programm sollen Sie
sich selbst überlegen. Denkbar wären auch hier Kommandozeilenparameter:
$ java CrossProduct    1 -5 2      2 0 3
# (-15 1 10)

 1      2
-5      0
 2      3


 */

public class Kreuzprodukt
{
    public static void main(String[] args)
    {
        int[] a = {1, -5, 2};
        int[] b = {2,  0, 3};

        Kreuzprodukt kp = new Kreuzprodukt();
        kp.crossdroduct(a,b);

    }


    void crossdroduct(int[] a, int[]b)
    {
        System.out.println(a[1]*b[2] - a[2]*b[1]);
        System.out.println(a[2]*b[0] - a[0]*b[2]);
        System.out.println(a[0]*b[1] - a[1]*b[0]);
    }
}
