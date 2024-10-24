package Oct.ex_23102024_Exception;

public class Lab186_Try {
    public static void main(String[] args) {

        // only try is never possible in java , catch is compulsory.
        try {
            int c=10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
