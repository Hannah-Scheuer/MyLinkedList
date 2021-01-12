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
   add(size(), value);
   return true;
 }

 public void add(int index, String value){
   if (index < 0 || index > size){
     throw new IndexOutOfBoundsException("Index " + index + " is not in range");
   }
   Node newNode = new Node(value);
   Node temp = new Node(null);
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
     //temp.setPrev(newNode);
     newNode.setNext(temp);
     start = newNode;
     temp.setPrev(start);
   }
   else{
     Node newPrev = findNode(index - 1);
     Node newNext = findNode(index);
     newNode.setPrev(newPrev);
     newNode.setNext(newNext);
     newPrev.setNext(newNode);
     newNext.setPrev(newNode);
    }
    size += 1;
 }

 public String get(int index){
   Node temp = findNode(index);
   return temp.getData();
 }

 public String set(int index, String value){
   Node temp = findNode(index);
   String out = temp.getData();
   temp.setData(value);
   return out;
 }

 public String toString(){
   String out = "[";
   Node temp = start;
   while (temp.getNext() != null){
     out += temp.getData() + ", ";
     temp = temp.getNext();
   }
   return out + end.getData()+"]";
 }

 public String remove(int index){
   Node temp = findNode(index);
   String out = temp.getData();
   if (size == 1){
     out = start.getData();
     start = null;
     end = null;
   }
   else if (index == 0){
     out = start.getData();
     temp = start.getNext();
     temp.setPrev(null);
     start.setNext(null);
     start = temp;
   }
   else if (index == size()-1){
     out = end.getData();
     temp = end.getPrev();
     temp.setNext(null);
     end.setPrev(null);
     end = temp;
   }
   else{
     temp.getPrev().setNext(temp.getNext());
     temp.getNext().setPrev(temp.getPrev());
   }
   size = size -1;
   return out;
 }

 private Node findNode(int index){
   if (index < 0 || index >= size){
     throw new IndexOutOfBoundsException("Index " + index + " is not in range");
   }
   Node temp = start;
   for (int i = 0;i<index;i++){
     temp = temp.getNext();
   }
   return temp;
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
