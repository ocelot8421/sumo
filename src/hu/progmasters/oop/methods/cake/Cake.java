package hu.progmasters.oop.methods.cake;

/**
 * Minden sütinek van néhány változója, néhány állandó értéke:
 * - neve
 * - ára
 * - egy szeletszáma (hány szeletre vágjuk fel a sütit)
 * - szeletenkénti ára (mennyi forintba kerül egy szelet belőle)
 * <p>
 * Hozd létre a Cake osztály konstruktorát úgy, hogy új süti létrehozásánál csak a nevét, az egész torta árát
 * és a szeletek számát adod meg, ezekből pedig a konstruktor határozza meg a szeletek árát!
 */
public class Cake {
    private String name;
    private int price;
    private int pieces;
    private int pricePerPiece;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public int getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(int pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    public Cake(String name, int price, int pieces) {
        this.name = name;
        this.price = price;
        this.pieces = pieces;
        this.pricePerPiece = price / pieces;


    }
}
