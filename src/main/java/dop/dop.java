package dop;

import java.util.HashSet;
import java.util.LinkedList;

public class dop {
    static void linkedLists() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(5);
        linkedList.add(0);
        System.out.println(linkedList);
        int i;
        while (linkedList.contains(0)) {
            linkedList.remove(Integer.valueOf(0));
        }
  //      for (i = 0; i < linkedList.size(); i=i+1) {
    //        if (linkedList.size()  0) {
      //          linkedList.remove(i);
      //      }
            System.out.println(linkedList);
        }

        public static void main(String[] args){
            linkedLists();
        }
    }
