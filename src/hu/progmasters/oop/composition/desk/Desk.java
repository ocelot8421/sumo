package hu.progmasters.oop.composition.desk;

import java.util.Scanner;

/**
 * Hozz létre egy Paper osztályt (papír)!
 * A papíron lévő tartalmat egy String példányváltozó reprezentálja.
 * <p>
 * Hozz létre egy Radio osztályt (rádió)!
 * Lehetőségünk van váltani a csatornák között.
 * A rádiót be és ki lehet kapcsolni. (A rádió vagy bekapcsolva, vagy kikapcsolva van, ezt az állapotot el kell
 * tárolnia egy boolean-ban. Állapot váltáskor írd ki egy sout-ba, hogy mi történt.)
 * <p>
 * Hozz létre egy Drawer osztályt (fiók)!
 * A fiók lehet nyitva és csukva.
 * Ha nyitva van, akkor tehetünk bele vagy kivehetünk belőle papírokat.
 * Az egyszerűség kedvéért feltételezzük, hogy a fiókba csak papírok kerülnek, maximum 10 darab.
 * <p>
 * Hozz létre egy Computer osztályt (számítógép)!
 * A számítógépnek van típusa, MAC vagy PC.
 * A számítógép ki- és bekapcsolható.
 * <p>
 * Hozz létre egy Photograph osztályt (fénykép)!
 * A fényképnek van címe és dátuma.
 * A címet meg lehet változtatni.
 * <p>
 * Hozz létre egy Desk osztályt (íróasztal).
 * Az íróasztalon van egy rádió, egy számítógép, egy fénykép és van három fiókja.
 * Az íróasztal vagy rendezett, vagy rendetlen. Akkor rendezett, ha minden fiók csukva van,
 * a számítógép és a rádió ki van kapcsolva.
 * Lehetőségünk van rendbe rakni az asztalt.
 * <p>
 * Minden információt ki tudunk íratni az asztalról, beleértve a fiókok állapotát és tartalmát,
 * a rádió állapotát (be/kikapcsolt),
 * a számítógép állapotát és információt a fényképről.
 */


public class Desk {

    Scanner scan = new Scanner(System.in);

    private Radio radio;
    private Computer computer;
    private Photograph photograph;
    private Drawer drawer1 = new Drawer("felső");
    private Drawer drawer2 = new Drawer("középső");
    private Drawer drawer3 = new Drawer("alsó");


    public static void main(String[] args) {
        Desk desk = new Desk();
        Paper paper01 = new Paper("reklám");
        desk.drawer1.putPaperIntoDraw(new Paper("meghívó"));
        desk.drawer2.putPaperIntoDraw(paper01);
        desk.drawer1.whatIsInTheDrawer();
        desk.drawer2.whatIsInTheDrawer();
        desk.drawer3.whatIsInTheDrawer();
    }


}
