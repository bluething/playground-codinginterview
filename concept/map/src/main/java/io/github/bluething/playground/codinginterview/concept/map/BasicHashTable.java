package io.github.bluething.playground.codinginterview.concept.map;

import java.util.LinkedList;

public class BasicHashTable {
    // M = table size is a prime number, rather small, for illustration purpose only
    // Generally make M > 2*K where K is the maximum number of keys that you will likely need for your application
    private static final int M = 997;
    // Using Separate Chaining collision resolution technique
    private final LinkedList<StringInt>[] underlyingTable = new LinkedList[M];

    public BasicHashTable() {
        for (int i = 0; i < M; i++) {
            underlyingTable[i] = new LinkedList<>();
        }
    }

    private int hashFunction(String v) {    // assumption 1: v uses ['A'..'Z'] only
        int sum = 0;                        // assumption 2: v is a short string
        for (int i = 0; i < v.length(); i++) {
            char c = v.charAt(i);           // for each character c in v
            sum = ((sum*26)%M + (c-'A'+1))%M;   // M is table size
        }
        return sum;
    }

    public void insert(String key, int value) { // to emulate mapper[key] = value
        boolean contains_key = false;
        for (StringInt keyValue : underlyingTable[hashFunction(key)])
            if (keyValue.s.equals(key)) {   // if there is an existing key
                contains_key = true;
                keyValue.i = value; // update the satellite data
            }
        if (!contains_key) {  // no previous key before
            underlyingTable[hashFunction(key)].add(new StringInt(key, value)); // just append at the back
        }
    }

    public int search(String key) { // to emulate mapper[key]
        for (StringInt keyValue : underlyingTable[hashFunction(key)]) {  // O(k), k is the length of this list
            if (keyValue.s.equals(key)) {    // if there is an existing key
                return keyValue.i; // return this satellite data
            }
        }
        return -1; // no previous key before, return a symbol to say such key does not exist
    }

    public void Remove(String key) { // to emulate mapper.erase(key)
        LinkedList<StringInt> row = underlyingTable[hashFunction(key)]; // get the reference of the row
        for (StringInt keyValue : underlyingTable[hashFunction(key)]) {    // O(k), k is the length of this list
            if (keyValue.s.equals(key)) { // if there is an existing key
                row.remove(keyValue);   // erase this (key, value) pair from this vector
                break; // do not do anything else
            }
        }
        // we do nothing if key is not actually found
    }

    public boolean isEmpty() {
        int total = 0;
        for (int i = 0; i < M; i++) {
            total += underlyingTable[i].size();
        }
        return total == 0;
    }
}
