package rottingalien.utils.Stream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderStream {

    /**
     * Closes FileReader File
     *
     * @param fileReader FileReader File to close.
     */
    public static void closeFileReader(FileReader fileReader) {
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
