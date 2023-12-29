package io.github.bluething.playground.codinginterview.concept;

import io.github.bluething.playground.codinginterview.concept.map.BasicHashTable;

import java.io.PrintWriter;
import java.util.HashMap;

public class BasicHashTableMain {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);

        pw.println("Our own Hash Table with Separate Chaining collision resolution technique");
        BasicHashTable ht = new BasicHashTable();
        pw.println(ht.isEmpty()); // should be true
        ht.insert("STEVEN", 77);
        pw.println(ht.isEmpty()); // should be false
        ht.insert("STEVEN", 36); // will update instead of creating a new one
        ht.insert("GRACE", 35);
        ht.insert("JANE", 7);
        ht.insert("JOSHUA", 4);
        ht.insert("JEMIMAH", 1);
        pw.println(ht.search("STEVEN")); // should be 36 (not 77, it has been overwritten)
        pw.println(ht.search("GRACE")); // should be 35
        pw.println(ht.search("STRANGER")); // should be -1 (does not exist)
        ht.Remove("STEVEN");
        pw.println(ht.search("STEVEN")); // should be -1 now (has just been deleted)
        pw.println(ht.search("GRACE")); // should remain 35
        pw.println(ht.search("JANE")); // should be 7
        ht.Remove("JANE");
        pw.println(ht.search("JANE")); // should be -1 now (has just been deleted)

        pw.println("Java HashMap version");
        HashMap<String, Integer> mapper = new HashMap<String, Integer>();
        pw.println(mapper.isEmpty()); // should be true
        mapper.put("STEVEN", 77);
        pw.println(mapper.isEmpty()); // should be false
        mapper.put("STEVEN", 36); // will update instead of creating a new one
        mapper.put("GRACE", 35);
        mapper.put("JANE", 7);
        mapper.put("JOSHUA", 4);
        mapper.put("JEMIMAH", 1);
        pw.println(mapper.get("STEVEN")); // should be 36 (not 77, it has been overwritten)
        pw.println(mapper.get("GRACE")); // should be 35
        pw.println(mapper.get("STRANGER") == null); // should be true ("STRANGER" does not exist)
        mapper.remove("STEVEN");
        pw.println(mapper.get("STEVEN") == null); // should be true now (has just been deleted)
        pw.println(mapper.get("GRACE")); // should remain 35
        pw.println(mapper.get("JANE")); // should be 7
        mapper.remove("JANE");
        pw.println(mapper.get("JANE") == null); // should be true now (has just been deleted)

        pw.close();
    }
}
