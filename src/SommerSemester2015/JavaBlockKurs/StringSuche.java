package SommerSemester2015.JavaBlockKurs;

import com.sun.org.apache.xml.internal.utils.StringComparable;

/**
 * Created by Lightspeed on 26.03.2015.
 */

/*
Implementieren Sie eine Methode int search(String[] array, String string),
die einen String-Array und einen String bekommt und diesen String im Array
suchen soll. Wenn der String nicht gefunden wird, soll die Methode -1 zurückgeben.
$ java Search foo bar baz biz buzz baz
# 2
1
$ java Search foo bar baz biz buzz bogus
# -1

 */


public class StringSuche
{

    public static void main(String[] args)
    {
        String a = "Dies ist ein Text.";
        String b = "Text";

        StringSuche s = new StringSuche();
        s.search(a,b);
    }


    void search(String a, String b)
    {

        if (a.contains(b) )
        {
            System.out.println("Das Wort '" +b+"' ist im Array dabei.");
        }
        else
        {
            System.out.println(-1);
        }
    }
}
