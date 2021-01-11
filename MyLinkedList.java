public class MyLinkedList{
 private int size;
 private Node start, end;
 public MyLinkedList(){
   size = 0;
   start = new Node("");
   end = start;
 }
 public int size(){
   return size;
 }

 public boolean add(String value){
   Node temp = new Node(value);
   if (size==0){
     start = temp;
     end = temp;
   }
   else{
     Node temp1 = end;
     end = temp;
     end.setPrev(temp1);
     temp1.setNext(end);
  }
   size += 1;
   return true;
 }

 public void add(int index, String value){
   if (index < 0 || index > size){
     throw new IndexOutOfBoundsException("Index " + index + " is not in range");
   }
   Node newNode = new Node(value);
   Node temp = new Node(value);
   if (size==0){
     start = newNode;
     end = newNode;
   }
   else if (index == size){
     temp = end;
     temp.setNext(newNode);
     newNode.setPrev(temp);
     end = newNode;
   }
   else if (index == 0) {
     temp = start;
     temp.setPrev(newNode);
     newNode.setNext(temp);
     start = newNode;
   }
   else{
     temp = start;
     for (int i = 0;i<index-1;i++){
       temp = temp.getNext();
     }
     newNode.setPrev(temp.getPrev());
     newNode.setNext(temp.getNext());
     temp.getPrev().setNext(newNode);
     temp.getNext().setPrev(newNode);
     size += 1;
    }
 }

 public String get(int index){
   if (index < 0 || index >= size){
     throw new IndexOutOfBoundsException("Index " + index + " is not in range");
   }
   Node temp = start;
   for (int i = 0;i<index-1;i++){
     temp = temp.getNext();
   }
   return temp.getData();
 }

 public String set(int index, String value){
   if (index < 0 || index >= size){
     throw new IndexOutOfBoundsException("Index " + index + " is not in range");
   }
   Node temp = start;
   for (int i = 0;i<index;i++){
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
   if (index < 0 || index >= size){
    throw new IndexOutOfBoundsException("Index " + index + " is not in range");
   }
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

/*
 public void extend(MyLinkedList other){
   end.setNext(other.get(0));
   other.get(0).setPrev(end);
   size += other.size();
 }
*/
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
