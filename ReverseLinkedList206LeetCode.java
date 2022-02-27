// Time Complexity : O(n) both the approach
// Space Complexity : O(1) => iterative approach, O(n)=> recursive approach
//didn't face any problems
//runs successfully


//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class ReverseLinkedList206LeetCode {




    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


        // iterative approach
//     public ListNode reverseList(ListNode head) {

//         ListNode current = head;
//         ListNode previous = null;

//         while(current != null){

//             ListNode next = current.next;
//             current.next = previous;
//             previous = current;
//             current = next;

//         }

//         return previous;

//     }


        //recursive approach
        public ListNode reverseList(ListNode head) {

            if(head==null || head.next==null){              //check if head is null or head.next is null
                return head;                                //if so, then return head
            }
            ListNode node = reverseList(head.next);         //call the function with head.next value
            //System.out.println(head.val);
            head.next.next = head;                          //point the next element to current element
            head.next = null;                               //assign the current element's next pointer to null


            return node;                                    //returning the reverse linkedlist head

        }
}
