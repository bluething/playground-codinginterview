package io.github.bluething.playground.codinginterview.concept.map;

public class LinearProbingHashMap {
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

    public LinearProbingHashMap() {
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.tables = new Entry[DEFAULT_CAPACITY];
    }

    private int hash(int key, int m) {
        return key % m;
    }
    private void resize() {
        int newCapacity = capacity * 2;
        Entry[] newTables = new Entry[newCapacity];
        for (Entry entry : tables) {
            if (entry != null) {
                int newIdx = hash(entry.key, newCapacity);  // calculate new index with new capacity
                while (newTables[newIdx] != null) {         // find empty slot
                    newIdx = (newIdx + 1) % newCapacity;    // index always move by 1 forward
                }
                newTables[newIdx] = entry;
            }
        }

        tables = newTables;
        capacity = newCapacity;
    }
    private int findIdx(int key) {
        int idx = hash(key, capacity);
        int startIdx = idx;

        do {
            Entry entry = tables[idx];
            if (entry == null || entry.key == key) {    // the index either null (empty) or have a value
                return idx;
            }
            idx = (idx + 1) % capacity; // move index by 1 forward, so eventually we can exit the loop (back to the beginning)
        } while (idx != startIdx);

        return -1;  // the table is full
    }

    public void insert(int key, Object value) {
        if ((double) size /capacity >= LOAD_FACTOR_THRESHOLD) { // resize the table when load factor greater than equal threshold
            resize();
        }

        int idx = findIdx(key);
        if (idx == -1) {
            throw new IllegalArgumentException("Table was full");
        }

        if (tables[idx] == null) {  // new value
            tables[idx] = new Entry(key, value);
            ++size;
        } else {                    // override
            tables[idx].value = value;
        }
    }

    public Object search(int key) {
        int idx = findIdx(key);
        return (idx != -1 && tables[idx] != null) ? tables[idx] : null;
    }

    public void remove(int key) {
        int idx = findIdx(key);
        if (idx != -1 && tables[idx] != null) {
            tables[idx] = null;
            --size;
        }
    }
}
