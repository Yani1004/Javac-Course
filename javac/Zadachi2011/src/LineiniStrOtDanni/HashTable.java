package LineiniStrOtDanni;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class HashTable {
    private static class Entry{
        String key;
        String value;

        Entry(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] table;

    public HashTable(){
        table = new LinkedList[10];
        for(int i = 0; i < 10; i++){
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key){
        int hash = 0;
        for(int i = 0; i < key.length(); i++){
            hash += key.charAt(i);
        }
        return hash%10;
    }
    public void add(String key, String value){
        int hash = hash(key);
        LinkedList<Entry> list = table[hash];
        for(Entry e : list){
            if(e.key.equals(key)){
                e.value = value;
                return;
            }
        }
        list.add(new Entry(key, value));
    }
    public String get(String key){
        int hash = hash(key);
        LinkedList<Entry> list = table[hash];
        for(Entry e : list){
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }
}
