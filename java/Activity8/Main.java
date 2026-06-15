package Activity8;

public class Main {

    public static void exceptionTest(String s) throws CustomException {
        if (s != null && s.length() > 0) {
            System.out.println(s);
        } else {
            throw new CustomException("The string is empty");
        }
    }

    public static void main(String[] args) {
        try {
            Main.exceptionTest("");  // This will throw exception
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
