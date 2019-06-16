package rottingalien.utils.Stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InPutStream {

    /**
     * Closes FileWriter Stream
     *
     * @param inputStream FileWriter Stream to close.
     */
    public static void closeInPutStream(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
