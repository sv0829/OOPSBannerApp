/**
 * OOPS Banner App
 * UC6 - Render OOPS using Static Functions
 *
 * @author Shyam
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(String.join("   ", O[i], O[i], P[i], S[i]));
        }
    }

    // Static method for letter O
    static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method for letter P
    static String[] getP() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Static method for letter S
    static String[] getS() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}