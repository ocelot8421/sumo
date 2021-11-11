package hu.progmasters.oop.methods.number;

import java.util.Arrays;

/**
 * A Number osztálynak el kell mentenie három egész számot, amiket konstruktorban meg is kap példányosításkor.
 * <p>
 * Emellett rendelkezzen az alábbi metódusokkal:
 * - getNumbers(): visszaadja az eltárolt számokat növekvő sorrendben, egy tömb elemeiként
 * - getSum(): visszaadja a számok összegét
 * - getAverage(): visszaadja a számok átlagát (törtszámként)
 */
public class Number {
    private int num1;
    private int num2;
    private int num3;

    public Number(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int[] getNumbers() {
        int[] numArray = {num1, num2, num3};
        Arrays.sort(numArray);
        return numArray;
    }

    public int getSum() {
        return num1 + num2 + num3;
    }

    public double getAverage() {
        return (double) getSum() / 3;
    }

    public static void main(String[] args) {
        Number num = new Number(65, 48, 39);
        System.out.println(Arrays.toString(num.getNumbers()));
        System.out.println(num.getSum());
        System.out.println(num.getAverage());
    }

}
