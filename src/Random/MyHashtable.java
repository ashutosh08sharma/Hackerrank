package Random;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class MyHashtable<K, V> {    
    
	private final static int TABLE_SIZE = 128;
	 
    HashEntry[] table;

    MyHashtable() {
          table = new HashEntry[TABLE_SIZE];
          for (int i = 0; i < TABLE_SIZE; i++)
                table[i] = null;
    }

    public int get(K key) {
          int hash = (key.hashCode());
          while (table[hash] != null && table[hash].getKey() != key)
                hash = (hash + 1) % TABLE_SIZE;
          if (table[hash] == null)
                return -1;
          else
                return (int) table[hash].getValue();
    }

    public void put(K key, V value) {
          int hash = (key.hashCode());
          while (table[hash] != null && table[hash].getKey() != key)
                hash = (hash + 1) % TABLE_SIZE;
          table[hash] = new HashEntry(key, value);
    }
    public static void main(String args[]) throws Exception {
        new TestHarness(new MyHashtable<String, String>()).run();
    }
    
    
    /**
     * A helper class that tests MyHashtable by feeding it puts and gets from STDIN.
     */
    public static class TestHarness implements Runnable {
        final MyHashtable<String, String> hashtable;

        public TestHarness(MyHashtable<String, String> hashtable) {
            this.hashtable = hashtable;
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String k = scanner.next();
                String v = null;
                if (k.contains("=")) {
                    String[] split = k.split("\\=");
                    k = split[0];
                    v = split[1];
                }
                if (v == null) {
                    System.out.println(hashtable.get(k));
                } else {
                    hashtable.put(k, v);
                }
            }
        }
    }
    
   
}
class HashEntry<K,V> {
    private K key;
    private V value;

    HashEntry(K key, V value) {
          this.key = key;
          this.value = value;
    }     

    public K getKey() {
          return key;
    }

    public V getValue() {
          return value;
    }
}
