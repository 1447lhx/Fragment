package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.fragment.Words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WordsContent {
    public static final List<WordItem> ITEMS = new ArrayList<WordItem>();


    public static final Map<String, WordItem> ITEM_MAP = new HashMap<String, WordItem>();

    private static final int COUNT = 25;

    static {
        addItem(new WordItem("1", "Apple", "Apple"));
        addItem(new WordItem ("2", "Orange", " Orange "));
        addItem(new WordItem ("3", "Banana", " Banana "));
        addItem(new WordItem ("4", "Lemon", " Lemon "));
    }

    private static void addItem(WordItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static WordItem createWordItem(int position) {
        return new WordItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    public static class WordItem {
        public final String id;
        public final String content;
        public final String details;

        public WordItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }


        public String toString() {
            return content;
        }
    }
}
