package SommerSemester2015.JavaBlockKurs;

import java.util.Scanner;

/**
 * Created by Lightspeed on 28.03.2015.
 */
public class Palindrom
{
    static boolean isPalindrom = false;

    public static void main(String[] args)
    {
        String wort;

        System.out.print("Geben sie ein Wort ein: ");
        Scanner s = new Scanner(System.in);
        wort = s.nextLine();

        Palindrom p = new Palindrom();
        p.palindrom(wort);

        if(isPalindrom == true)
        {
            System.out.println("Das Wort ist ein Palindrom.");
        }
        else
        {
            System.out.println("Das Wort ist kein Palindrom");
        }

    }


    boolean palindrom(String wort)
    {
        int start = 0;
        int end = wort.length()-1;
        for (int i = 0; i < wort.length()/2 ; i++)
        {
            if(wort.charAt(start) == wort.charAt(end))
            {
                isPalindrom = true;
            }
            start++;
            end--;
        }
        return isPalindrom;
    }



}
