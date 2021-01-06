public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   // I have no clue what to write for this constructor
 }
 public int size();
 public boolean add(String value){
   new Node temp = new Node(value);
   temp.setPrev(end);
   temp.setNext(numll);
   end.setNext(temp);
   return true;
 }
 public void add(int index, String value);
 public String get(int index);
 public String set(int index, String value);
 public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
