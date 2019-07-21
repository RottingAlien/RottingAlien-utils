package rottingalien.utils.Maths;

public class Random {

    /**
     * Method that generates a random Integer with min and max being inclusive
     *
     * @param min minimum number (inclusive)
     * @param max maximum number (inclusive)
     * @return random int number between min and max both inclusive
     */
    public static int randomInclusiveInt(int min, int max) {
        return ((int) (Math.random() * (max - min + 1) + min));
    }

    /**
     * Method that generates a random Integer from zero to max being Inclusive
     *
     * @param max maximum number
     * @return random int number between zero and maximum number both inclusive
     */
    public static int randomInclusiveInt(int max) {
        return (int) (Math.random() * ((max) + 1) - 0);
    }
}
