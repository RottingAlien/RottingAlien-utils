package rottingalien.utils.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStream {

    /**
     * Closes FileWriter Stream
     *
     * @param fileWriter FileWriter Stream to close.
     */
    public static void closeFileWriter(FileWriter fileWriter) {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
