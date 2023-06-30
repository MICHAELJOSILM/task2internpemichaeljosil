public class americanflag {
    public static void main(String[] args) {

        int rows = 13;
        int columns = 50;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (i < 9 && j < 30) {
                    if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}


