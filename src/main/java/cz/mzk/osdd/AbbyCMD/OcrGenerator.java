package cz.mzk.osdd.AbbyCMD;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Jakub Kremlacek
 */
public class OcrGenerator {
    public static final String INPUT = "-i";
    public static final String OUTPUT_OCR = "-oO";
    public static final String OUTPUT_ALTO = "-oA";

    private File inputFile;
    private File outputOcrFile;
    private File outputAltoFile;
    private AbbyUtils abbyUtils;

    public OcrGenerator(String[] args) throws IOException {
        processArgs(args);
        abbyUtils = new AbbyUtils();
    }

    public void run() throws IOException {


        System.out.println(time() + " Loading image.");

        InputStream imgIS = new FileInputStream(inputFile);
        byte[] img;
        try {
            img = org.apache.commons.io.IOUtils.toByteArray(imgIS);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(time() + " Sending request to ABBYY server.");

        String[] out = abbyUtils.getOcr(img);

        System.out.println(time() + " Saving OCR.");

        FileUtils.writeStringToFile(outputOcrFile, out[0], Charset.defaultCharset());
        FileUtils.writeStringToFile(outputAltoFile, out[1], Charset.defaultCharset());

        System.out.println(time() + " Done.");
    }

    private String time() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    private void processArgs(String[] args) throws IOException {
        if (args.length != 6) throw new IllegalArgumentException("Invalid argument count: " + args.length + ", expected 6." + "\nInput image and output OCR filepaths must be declared.");

        int pos = 0;

        while (pos < args.length) {
            if (args[pos].equals(INPUT)) {
                inputFile = new File(args[pos+1]);

                if (!inputFile.exists()) throw new IllegalArgumentException("Input file: " + inputFile.getName() + " does not exist.");

                pos = pos + 2;

            } else if (args[pos].equals(OUTPUT_OCR)) {
                outputOcrFile = new File(args[pos+1]);
                //test outputfile
                FileUtils.writeStringToFile(outputOcrFile, "", Charset.defaultCharset());
                pos = pos + 2;

            } else if (args[pos].equals(OUTPUT_ALTO)) {
                outputAltoFile = new File(args[pos+1]);
                //test outputfile
                FileUtils.writeStringToFile(outputOcrFile, "", Charset.defaultCharset());
                pos = pos + 2;

            } else {
                throw new IllegalArgumentException("Invalid argument type: " + args[pos]);
            }
        }

        if (
                inputFile == null ||
                outputOcrFile == null ||
                outputAltoFile == null
                ) {
            throw new IllegalArgumentException("All arguments must be set. Missing: " +
                    (inputFile == null ? "InputFile argument" + INPUT: "" ) +
                    (outputOcrFile == null ? "OutputOcrFile argument" + OUTPUT_OCR: "" ) +
                    (outputAltoFile == null ? "OutputAltoFile argument" + OUTPUT_ALTO: "" )
            );
        }
    }
}
