/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


// Time - O(N) - length of linked list
//Space - O(1) - no additional space

//Two Pointer approach - to detect in case of cycle in the LinkedList

//If null - no cycle detected, so return null
//Else copy the interest node to one variable and the head to another variable

//iterate these 2 new variable till the they are equal which is the cycle node



public class Solution {
  public ListNode detectCycle(ListNode head) {

    if(head == null || head.next == null){
      return null;
    }

    ListNode intersect = findIntersection(head);
    if(intersect == null){
      return null;
    }

    ListNode initial = head;
    ListNode temp = intersect;

    while(initial != temp){
      initial = initial.next;
      temp = temp.next;
    }

    return initial;
  }

  public ListNode findIntersection(ListNode node){

    ListNode slowPtr = node;
    ListNode fastPtr = node;

    while(fastPtr != null && fastPtr.next != null){
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;

      if(slowPtr == fastPtr){
        return slowPtr;
      }
    }

    return null;
  }
}


// Time - O(N) - length of the linked list
//Space - O(N) - Size of the hashSet

 public class Solution {
     public ListNode detectCycle(ListNode head) {

         Set<ListNode> nodeSet = new HashSet<>();

         while(head != null){
             if(nodeSet.contains(head)) return head;
             nodeSet.add(head);
             head = head.next;
         }
         return null;
     }
 }