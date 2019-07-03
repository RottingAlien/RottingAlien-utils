package rottingalien.utils.Stream;

import java.io.*;

public class Stream {

    /**
     * Closes Stream
     *
     * @param stream Stream to close.
     */
    public static void close(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}