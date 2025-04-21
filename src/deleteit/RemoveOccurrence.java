package deleteit;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

public class RemoveOccurrence {
    public static void main(String[] args) {
        String ans = removeOccurrencesUsingStringBuilder("daabcbaabcbc", "abc");
        System.out.println(ans);  //  dab
    }

    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;

    }

    private static String removeOccurrencesUsingStringBuilder(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int len = part.length();
        while (true) {
            int indexOf = sb.indexOf(part);
            if (indexOf == -1) break;

            sb.delete(indexOf, indexOf + len);
        }
        return sb.toString();
    }


}

