package bookpack;
import java.util.*; 
public class Clazz { 
  public static void main(String[] args) { 
   ArrayList<String>al=new ArrayList<String>();
   System.out.println(al.size());
   al.add("A");
   al.add("B");
   al.add("C");
   al.add("D");
   System.out.println(al.size());
   al.add(4, "B2");
   System.out.println(al.size());
   System.out.println(al);
   al.remove("C");
   al.remove(1);
   System.out.println(al.size());
   System.out.println(al);
   String [] str=new String[al.size()];
   str=al.toArray(str);
   for(String s:str)
   System.out.print(s+" ");
   LinkedList<Integer> ll=new LinkedList<>();
   ll.add(1);
   ll.add(23);
   ll.add(4);System.out.println(ll);
   ll.addFirst(13);
   ll.addLast(5);
   System.out.println(ll);
   ll.add(1, 7);
   System.out.println(ll);
   ll.removeFirst();
   ll.removeLast();
   System.out.println(ll);
   int ii=ll.get(0);
   
   ll.set(3,ii*=2 );
   System.out.println(ll);
  } 
} 