import java.util.*;
class hashMap2<K,V>{
    private LinkedList<Node>[] buckets;
    class Node{
        K key;
        V value;
        Node(K  key,V value){
            this.key = key;        
            this.value=value;
        }
    }
private int n;

@SuppressWarnings("unchecked")
void hashMap(){
    buckets = new LinkedList[5];
    for(int i=0; i<5; i++){
        buckets[i]=new LinkedList<>();
    }
}    
private int hashFunction(K key){
    int bi=key.hashCode();
    return Math.abs(bi)%5;
}
private int searchInLL(K key,int bi){
    LinkedList<Node> ll=buckets[bi];
    for (int i=0;i<ll.size();i++){
        if(ll.get(i).key.equals(key)){
            return i;
        }
    }
    return -1;
}
public void put(K key,V value){
    int bi=hashFunction(key);
    int di=searchInLL(key,bi);
    if(di == -1){
        buckets[bi].add(new Node(key,value));
        n++;
    }
    else{
        
        Node node=buckets[bi].get(di);
        node.value=value;
    }
}
public boolean containsKey(K key){
    int bi=hashFunction(key);
    int di=searchInLL(key,bi);
    if(di== -1){
        return false;
    }
    else{
        return true;
    }
}
public V get(K key){
    int bi=hashFunction(key);
    int di=searchInLL(key,bi);
    if(di== -1){
        return null;
    }
    else{
        Node node=buckets[bi].get(di);
        return node.value;
    }
}
public ArrayList<K> keyset(){
    ArrayList<K> keys=new ArrayList<>();
    for(int i=0;i<buckets.length;i++){
        LinkedList<Node>ll=buckets[i];
        for(int j=0; j<ll.size();j++){
            Node node=ll.get(j);
            keys.add(node.key);
        }
    }
    return keys;
}
public static void main(String[]args){
    hashMap2<String, Integer>map =new hashMap2<>();
    map.hashMap();

    map.put("a", 100);
    map.put("a", 200);
    map.put("b", 300);
    map.put("b", 1400);
    map.put("c", 170);
    map.put("c", 500);
    map.put("a", 1500);
    map.put("c", 1070);

    ArrayList<String>keys=new ArrayList<>(map.keyset());
    for(int i=0;i<keys.size();i++){
        System.out.println(keys.get(i) +" "+ map.get(keys.get(i)));
    }
    
}
}