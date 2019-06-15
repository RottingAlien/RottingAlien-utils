package rottingalien.utils.Stream;

import java.io.*;

public class Stream {

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


    /**
     * Closes FileWriter File
     *
     * @param fileWriter FileWriter File to close.
     */
    public static void closeFileWriter(FileWriter fileWriter) {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Closes FileWriter File
     *
     * @param inputStream FileWriter File to close.
     */
    public static void closeInPutStream(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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
