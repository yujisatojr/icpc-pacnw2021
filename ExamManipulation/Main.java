import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var s = new Scanner(System.in);
        int n = s.nextInt(); //rows
        int k = s.nextInt(); //columns
        s.nextLine();

        String array[] = new String[n];
        for (int i=0; i<n; i++) {
            array[i] = s.nextLine();
            System.out.println(array[i]);
        }

        char matrix[][]=new char[n][k];
        for(int i=0; i<n;i++) {
            for(int j=0; j<k;j++) {
                matrix[i][j]=array[i].charAt(j);
                System.out.println(matrix[i][j]);
            }
        }

        for (int i=0; i<k; i++) { //column=0
            for (int j=0; j<n; j++) { //row=0...n
                int compareOneTwo = Character.compare(matrix[j][i], matrix[j+1][i]);
                if (compareOneTwo == 0) {
                    System.out.println("they all match together!");
                }
            }
        }

        s.close();
    }
}
