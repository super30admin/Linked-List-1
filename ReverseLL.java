public class ReverseLL{
     public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
      //recursive 
      //Time Complexity : O(n)
      //Space Complexity : O(n)
      /*Approach
      -recursively going to the next node till we reach null
      -at every node that we encounter we are making next of its next to point to the node
       */
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
          ListNode rev = reverse(head.next);
          head.next.next = head;
          head.next = null;
          return rev;
      }

      //iterative 
      //Time Complexity : O(n)
      //Space Complexity : O(1)
      /*Approach
      -taking three pointers current,fast and previous,fast will be next node after current
      -at each iteration current will start pointing to its previous
      and then current will be new previous,fast will be new current, and fast will go to its next node
      -will go till fast becomes null
      -current will now be the head of new reversed Linked list
       */
      public ListNode reverseList(ListNode head) {
          ListNode prev = null;
          ListNode curr = head;
          ListNode fast = head.next;
          while(fast != null){
              curr.next = prev;
              prev = curr;
              curr = fast;
              fast = fast.next;
          }
          curr.next = prev;
          return curr;
      }
      public static void main(String args[]){
          ListNode n = new ListNode(1);
          n.next = new ListNode(2);
          n.next.next = new ListNode(3);
          n.next.next.next = new ListNode(4);
          ReverseLL obj = new ReverseLL();
        //ListNode rev1 =  obj.reverse(n);
        ListNode rev2 = obj.reverseList(n);
          //while(rev1 != null){System.out.print(rev1.val+" "); rev1= rev1.next;}
          while(rev2 != null){System.out.print(rev2.val+" "); rev2= rev2.next;}

          
      }
  
}