package Week2tsk3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDictionary {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter [" + (i + 1) + "] Word: ");
            String word = sc.nextLine();

            System.out.print((i + 1) + ".] \"" + word + "\" Meaning: ");
            String meaning = sc.nextLine();

            map.put(word, meaning);
        }

        System.out.print("\nSearch for a word's meaning: ");
        String searchWord = sc.nextLine();

        if (map.containsKey(searchWord)) {
            System.out.println("\nMeaning of " + searchWord + ": " + map.get(searchWord));
        } else {
            System.out.println("\nWord not found in the dictionary.");
        }

        sc.close();
    }
}
