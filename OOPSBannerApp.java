/**
 * OOPS Banner App
 * UC4 - Print OOPS using Array & Loop
 *
 * @author Shyam
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*      ", "*      ", "      *"),
            String.join("   ", "*     *", "*      ", "*      ", "      *"),
            String.join("   ", " ***** ", "*      ", "*      ", " ***** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
