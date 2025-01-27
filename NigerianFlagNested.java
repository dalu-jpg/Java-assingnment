public class NigerianFlagNested {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the flag
        int cols = 15; // Number of columns in each stripe

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols * 3; j++) {
                if (j < cols || j >= cols * 2) {
                    System.out.print("G"); // Green stripe
                } else {
                    System.out.print("*"); // White stripe
                }
            }
            System.out.println(); // New line after each row
        }
    }
}

