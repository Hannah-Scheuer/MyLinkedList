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

 public String get(int index){
   new Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.next();
   }
   return temp.getData();
 }

 public String set(int index, String value);

 public String toString(){
   String out = "[";
   new Node temp = start;
   for (int i = 0;i<size-1;i++){
     out += temp.getData() + ", "
     temp = temp.next();
   }
   return out + end.getData()+ "]";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
