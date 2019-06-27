package rottingalien.utils.Terminal;

public class Terminal {

    /**
     * Clears the terminal screen
     * (same as cmd + L on MAC)
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}

