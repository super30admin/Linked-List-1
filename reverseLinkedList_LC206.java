

//Approach 1: use 3 pointers one to to hold prev node, curr node and next node
//TC:O(n) SC:O(1)

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null){
//             return head;
//         }   
        
//         ListNode current=head;
//         ListNode prev= null;
//         ListNode amele=null;
        
//         while(current!=null){
//             //see discussion
//             //first set the next element
//       amele= current.next;
//             //set the current ref to previous
//      current.next=prev;
//             //increement the previous
//             prev=current;
//             //increement the current to next
//             current=amele;
          
            
//         }
//         return prev;
//     }
// }

//approach2: recursion - 
//TC:O(n) SC:O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
   ListNode newHead = reverseList(head.next);
        //head.next.next is 5 and head is 4 at the first recursion output
            head.next.next =head;
            head.next=null;
        return newHead;
        
    }
}
