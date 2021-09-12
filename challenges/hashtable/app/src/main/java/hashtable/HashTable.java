package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable <T> {

    Node <T> [] hashTableArray;
    int hashTableSize;

    public HashTable( int hashTableSize) {
        this.hashTableSize = hashTableSize;
        this.hashTableArray=new Node[ this.hashTableSize];
        for (int i = 0; i < this.hashTableSize ; i++) {
            hashTableArray[i]=new Node<>();
        }
    }

    public int hashTableStringKey(String key){
        int ascii=0;
        for(char latter : key.toCharArray()){
            ascii += (int) latter;
        }
        return ascii % this.hashTableSize;
    }

    public int hashTableIntegerKey(int key){
        return key % this.hashTableSize;
}

    public void add(T key ,T value) {
        int location = 0;
        if (key instanceof String) {
            location = hashTableStringKey((String) key);

        }else{
            location = hashTableIntegerKey((Integer) key);
        }
        Node<T> toAdd = new Node<>( key, value);
        if (hashTableArray[location]==null){
            hashTableArray[location]=toAdd;
        }else if(hashTableArray[location].next==null){
            hashTableArray[location].next=toAdd;

        }else{
            toAdd.next=hashTableArray[location].next;
            hashTableArray[location].next=toAdd;
        }
    }

    public  boolean contains (T key){
        int index = 0;
        boolean result =  false;
        if (key instanceof String) {
            index = hashTableStringKey((String) key);

        }else{
            index = hashTableIntegerKey((Integer) key);
        }

        if (hashTableArray[index]!= null){
            Node current = hashTableArray[index];
            while (current!= null){
                if (current.key==key){
                    result=true;
                    break;
                }else{
                    current=current.next;
                }
            }
        }
        return  result;
    }

    public  String get(T key){
        int index = 0;
        if (key instanceof String) {
            index = hashTableStringKey((String) key);

        }else{
            index = hashTableIntegerKey((Integer) key);
        }
        String result = " Wrong Key";
        if(hashTableArray[index]!= null){
            Node current=hashTableArray[index];
            while (current!= null){
                if (current.key==key){
                    result= (String) current.value;
                    break;
                }else {
                    current=current.next;
                }
            }
        }
        return  result;
    }

//    ______________________________CC33______________________________

    public static Map<String, List<String>> leftJoins(Map<String,String> mapOne, Map<String,String> mapTwo){
        Map<String,List<String>> result=new HashMap<>();

        mapOne.forEach((key,value)->{
            result.put(key, Arrays.asList(value, mapTwo.getOrDefault(value, "null")));
        });

        return result;

    }



}
