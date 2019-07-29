package optinal;

import java.util.Optional;

/**
 * Created by Arnold Wu on 2019/7/29.
 * Harman
 * awu2@harman.com
 */
public class OptionalUtility {

    /**
     *
     * @param s input string
     * @return Optional<Integer>
     */
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.ofNullable(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
