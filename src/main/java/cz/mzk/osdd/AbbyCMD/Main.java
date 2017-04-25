package cz.mzk.osdd.AbbyCMD;

/**
 * @author Jakub Kremlacek
 */
public class Main {
    public static void main(String[] args) {
        OcrGenerator og;

        try {
            og = new OcrGenerator(args);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(-1);
            return;
        }

        try {
            og.run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        System.exit(0);
    }
}
