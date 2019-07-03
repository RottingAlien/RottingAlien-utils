package rottingalien.utils.Stream;

import java.io.IOException;
import java.io.InputStream;

public class Byte {
    /**
     *
     * @param input
     * @return
     */
    public static String bytesToString(InputStream input) {

        byte[] bytesRead = null;

        try {
            bytesRead = input.readAllBytes();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Stream.close(input);
        }
        if (bytesRead != null) {
            return new String(bytesRead);
        }
        return "No bytes to Read";
    }

}
