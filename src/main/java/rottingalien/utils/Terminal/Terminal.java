package rottingalien.utils.Terminal;

import rottingalien.utils.OS.OS;

import java.io.IOException;

public class Terminal {

    /**
     * Clears the terminal screen
     * (same as cmd + L on MAC)
     */
    public static void clearScreen() {

        if (OS.isWindows()) {

            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

    }
}

