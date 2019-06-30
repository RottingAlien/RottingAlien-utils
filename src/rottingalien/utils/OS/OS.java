package rottingalien.utils.OS;

public class OS {

    /**
     * Methond to check Current Operating System
     *
     * @return String with Current Operating System's name
     */
    public static String getOS() {
        return System.getProperty("os.name");
    }

    /**
     * Check if current OS is windows
     *
     * @return boolean
     */
    public static boolean isWindows() {
        return getOS().startsWith("Windows");
    }

    /**
     * Check if current OS is MacOS
     *
     * @return boolean
     */
    public static boolean isMacOS() {
        return getOS().startsWith("Mac");
    }

    /**
     * Check if current OS is Linux
     *
     * @return boolean
     */
    public static boolean isLinux() {
        return getOS().startsWith("Linux");
    }

}
