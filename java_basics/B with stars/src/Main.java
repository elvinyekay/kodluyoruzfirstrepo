public class Main {
    public static void main(String[] args) {

        String[][] letterPattern = new String[7][6];

        for (int i = 0; i < letterPattern.length; i++) {
            for (int j = 0; j < letterPattern[i].length; j++) {
                if (i == 0 || i == 3 || i == 6){
                    if (j > letterPattern[i].length-3){
                        letterPattern[i][j] = " ";
                    }else {
                        letterPattern[i][j] = "*";
                    }
                } else if (j == 0 || j == 5) {
                    letterPattern[i][j] = "*";
                }else{
                    letterPattern[i][j] = " ";
                }
            }
        }

        for (String[] row : letterPattern) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}