/*Kullanıcı tarafından girilen 3 ismi diziler yoluyla metota göndererek ekrana
yazdıran program.*/
package parametrelimetotlar_uyg3;

import java.util.Scanner; //Scanner sınıfından Kütüphane oluşturduk.

public class ParametreliMetotlar_Uyg3 {

    public static void main(String[] args) 
    {
     String dizi[]=new String[3]; //3 elemanlı dizi tanımladık.
     Scanner oku=new Scanner(System.in); // oku adında sınıf oluşturduk.
     
     for(int i=0; i<3; i++) // For döngüsü ile girilen isimleri sıraladık.
     {
         System.out.print((i+1)+". İsmi girin..: "); //Kullanıcının girecek olduğu isimler için kullanıcıyı yönlendirdik.
         dizi[i]=oku.nextLine(); //Klavyeden girilen isim oku değişkenine atandı.
     }
     yazdir(dizi); // Yazdır adında değişken tanımlandık.
    }
     static void yazdir(String dizi[]) //Metot oluşturduk.
     {
         System.out.println(""); //1 satır boşluk ekledik.
         System.out.println("İsimler..:"); // Kullanıcı tarafından girilen isimlere başlık oluşturduk.
         for(String i:dizi) //For döngüsü ile kullanıcı tarafından girilen isimleri alt alta ekrana yazdırdık.
             System.out.println(i);
     }
}
