import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> cards = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            cards.add(s.nextInt());
        }
        s.close();

        // sort out the array
        Collections.sort(cards);
        ArrayList<Integer> consecutive = new ArrayList<Integer>();
        for (int i = 0; i < cards.size() - 1; i++) {
            if (cards.get(i + 1) - cards.get(i) == 1) {
                consecutive.add(cards.get(i));
                consecutive.add(cards.get(i+1));
            }
        }

        int min = consecutive.get(0);
        for (int i = 1; i < consecutive.size(); i++) {
            if (consecutive.get(i) < min)
                min = consecutive.get(i);
        }

        for (int i=0;i< consecutive.size();i++) {
            for (int j=0;j<cards.size();j++) {
                if (consecutive.get(i) == cards.get(j)) {
                    cards.remove(j);
                }
            }
        }

        int sum = 0;
        for (int i=0;i<cards.size(); i++) {
            sum += cards.get(i);
        }
        sum += min;
        System.out.println(sum);
    }
}
