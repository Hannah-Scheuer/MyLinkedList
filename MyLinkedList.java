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
   Node temp = new Node(value);
   temp.setPrev(end);
   temp.setNext(null);
   end.setNext(temp);
   size += 1;
   return true;
 }
 public void add(int index, String value){
   Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.next();
   }
   Node newNode = new Node(value);
   newNode.setPrev(temp.getPrev());
   newNode.setNex(temp.getNext());
   newNode.getPrev().setNext(newNode);
   newNode.getNext().setPrev(newNode);
   size += 1;
 }

 public String get(int index){
   Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.getNext();
   }
   return temp.getData();
 }

 public String set(int index, String value){
   Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.getNext();
   }
   String out = temp.getData();
   temp.setData(value);
   return out;
 }

 public String toString(){
   String out = "[";
   Node temp = start;
   for (int i = 0;i<size()-1;i++){
     out += temp.getData() + ", ";
     temp = temp.getNext();
   }
   return out + end.getData()+ "]";
 }

 public String remove(int index){
   Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.getNext();
   }
   String out = temp.getData();
   temp.getPrev().setNext(temp.getNext());
   temp.getNext().setPrev(temp.getPrev());
   size = size -1;
   return out;
 }


 public void extend(MyLinkedList other){
   end.setNext(other.get(0));
   other.get(0).setPrev(get(size-1));
   size += other.size();
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
