package rottingalien.utils.Stream;

import java.io.IOException;
import java.io.OutputStream;

public class OutPutStream {

    /**
     * Closes FileWriter Stream
     *
     * @param outputStream FileWriter Stream to close.
     */
    public static void closeOutPutStream(OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
