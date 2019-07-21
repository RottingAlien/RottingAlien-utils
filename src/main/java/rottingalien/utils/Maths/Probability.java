package rottingalien.utils.Maths;

public class Probability {

    /**
     * Method that returns the outcome of a probability.
     *
     * @param percentage number between 0 and 100.
     * @return true or false.
     */
    public static boolean percentage(int percentage) {
        return (Random.randomInclusiveInt(100) < percentage);
    }

}
