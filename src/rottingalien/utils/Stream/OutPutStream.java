package rottingalien.utils.Stream;

import java.io.IOException;
import java.io.OutputStream;

public class OutPutStream {

    /**
     * Closes FileWriter File
     *
     * @param outputStream FileWriter File to close.
     */
    public static void closeOutPutStream(OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
