package io.github.bluething.playground.codinginterview.concept.map;

public class DoubleHashingHashMap {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR_THRESHOLD = 0.75;

    private static class Entry {
        int key;
        Object value;

        Entry(int key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private int capacity;
    private Entry[] tables;

    public DoubleHashingHashMap() {
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.tables = new Entry[DEFAULT_CAPACITY];
    }

    private int hash(int key, int m) {
        return key % m;
    }
    private int secondHash(int key) {
        int prime = 31; // prime must smaller than table size
        return prime - (key % prime);
    }
    private void resize() {
        int newCapacity = capacity * 2;
        Entry[] newTables = new Entry[newCapacity];
        for (Entry entry : tables) {
            if (entry != null) {
                int newIdx = hash(entry.key, newCapacity);  // calculate new index with new capacity
                int step = 0;
                int second = secondHash(entry.key);
                while (newTables[newIdx] != null) {         // find empty slot
                    ++step;
                    newIdx = (newIdx + step * second) % newCapacity;    // using second hash to move forward
                }

                newTables[newIdx] = entry;
            }
        }

        tables = newTables;
        capacity = newCapacity;
    }
    private int findIdx(int key) {
        int idx = hash(key, capacity);
        int second = secondHash(key);
        int step = 0;

        while (tables[idx] != null && !(tables[idx].key == key)) {  // loop as long as find not empty slot with different key
            ++step;
            idx = (idx + step * second) % capacity;

        }

        return idx;
    }

    public void insert(int key, Object value) {
        if ((double) size /capacity >= LOAD_FACTOR_THRESHOLD) { // resize the table when load factor greater than equal threshold
            resize();
        }

        int idx = findIdx(key);
        if (tables[idx] == null) {  // new value
            tables[idx] = new Entry(key, value);
            ++size;
        } else {                    // override
            tables[idx].value = value;
        }
    }

    public Object search(int key) {
        int idx = findIdx(key);
        return tables[idx] != null ? tables[idx].value : null;
    }

    public void remove(int key) {
        int idx = findIdx(key);
        if (idx != -1 && tables[idx] != null) {
            tables[idx] = null;
            --size;
        }
    }
}
