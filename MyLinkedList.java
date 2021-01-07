public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size = 0;
 }
 public int size(){
   return size;
 }

 public boolean add(String value){
   new Node temp = new Node(value);
   temp.setPrev(end);
   temp.setNext(numll);
   end.setNext(temp);
   size += 1;
   return true;
 }
 public void add(int index, String value){
   new Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.next();
   }
   new Node newNode = new Node(value);
   newNode.setPrev(temp.getPrev);
   newNode.setNex(temp.getNext);
   newNode.getPrev().setNext(newNode);
   newNode.getNext().setPrev(newNode);
 }

 public String get(int index){
   new Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.next();
   }
   return temp.getData();
 }

 public String set(int index, String value){
   new Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.next();
   }
   String out = temp.getData();
   temp.setData(value);
   return out;
 }

 public String toString(){
   String out = "[";
   new Node temp = start;
   for (int i = 0;i<size()-1;i++){
     out += temp.getData() + ", "
     temp = temp.next();
   }
   return out + end.getData()+ "]";
 }

 public String remove(int index);
 public void extend(MyLinkedList other);
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
