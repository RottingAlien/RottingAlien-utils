package rottingalien.utils.Stream;

import java.io.*;

public class Stream {

    /**
     * Closes FileReader Stream
     *
     * @param fileReader FileReader Stream to close.
     */
    public static void closeFileReader(FileReader fileReader) {
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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
