/*

list.add to add the element to a given index
list.size to know the size of an arraylist
list.remove to remove the element from a given index
list.get to get the value of the index at the given index
list.set to replace the element of a given index to the given element
Collections.sort(listname) to sort the arraylist
list.contains() to check if a specific element exists in the list.
list.toArray() to convert the ArrayList into an array.

 */

 import java.util.*;
 public class arrayLists {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         //add elements
         list.add(9);
         list.add(8);
         list.add(7);
         list.add(6);
         System.out.println(list);
         //to get an element
         int element = list.get(0); // 0 is the index
         System.out.println(element);
         //add element in between
         list.add(1,2); // 1 is the index and 2 is the element to be added
         System.out.println(list);
         //set or changes the element
         list.set(0,0);
         System.out.println(list);
         //delete elements
         list.remove(0); // 0 is the index
         System.out.println(list);
         //size of list
         int size = list.size();
         System.out.println(size);
         //Loops on lists
         for(int i=0; i<list.size(); i++) {
             System.out.print(list.get(i) + " ");
         }
         System.out.println();
         //Sorting the list
         list.add(0);
         Collections.sort(list);
         System.out.println(list);
     }
 }