package day03scanner;
//Runner class' i calistirici olarak main method olusturup diger butun class'lari calistiririz, boylece karismaz.
//Runner Class ==> Calistirici Class manasinda
public class Runner {
    public static void main(String[] args) {

        //Object nasil olusturulur?

        //Class ismi   Obje ismi  Atama operatoru   "new" keyword          Constructor(Yapacak kisi) parantez icine yazilir, class ismi(yapacak kisi)
        //    Car        myCar           =           new (yoktan yaratma)    Car();

        Car myCar = new Car();
        System.out.println(myCar.fiyat); //kalipta oldugundan oradan bilgiyi ceker Car class'indan
        System.out.println(myCar.model); //kalipta oldugundan oradan bilgiyi ceker

        myCar.hareket();
        myCar.dur();

        //.......................................................

        Student tomHanks = new Student();
        //Kalipta ne varsa object'de de olmalidir
        System.out.println(tomHanks.name); //Tom Hanks
        System.out.println(tomHanks.grade); //8
        System.out.println(tomHanks.adress); //Miami

        tomHanks.study(); //Gunu gunune ders calisir...
        tomHanks.feed(); //Saglikli beslenir...

    }
}
