//Reverse LinkedList
// Time Complexity:O(1)
// Space Complexity:O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
//Time Complexity:O(N)
//Space Complexity:O(1)
class Solution {
    
    public ListNode reverseList(ListNode head) {
        //take 3 pointers
        //current at current node
        //previous which be pointing one element before current
        //ne at next node of current
         ListNode previous = null;
         ListNode current = head;
         ListNode ne =null;
        //while current reaches null
        while(current!=null){
            //point ne to next of current
            //point current's next pointer to previous
            //assign current to previous
            //move current forward
            ne = current.next;
			current.next =  previous;
			previous = current;
			current=ne;
            
        }
        //previous will be having the head
        return previous;
    }
}

//Remove nth from end
//Time Complexity:O(N)
//Space Complexity:O(1)
class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       //take two pointer
       ListNode node=head;
       ListNode temp=head;
       //first pointer to take n steps
       while(n>0 && temp.next!=null){
           temp=temp.next;
           n--;
       }
       if(n==1) return node.next;
       if(n>1) return null;
       //traverse temp pointer until it has not reached null
       while(temp.next!=null){
           temp=temp.next;
           head=head.next;
       }
       //point head.next to head.next..next to remove the node
       head.next=(head.next).next;
        //return node while be having head
       return node;

   }
}

//Cyclic linkedlist
//Time Complexity : O(N)
//Space Complexity : O(1)
 class Solution2 {
    public ListNode detectCycle(ListNode head) {
    //take two pointers
    ListNode slow = head, fast = head;
    //traverse until last
    while(fast != null && fast.next != null) {
        //move fast at 2x speed
        //slow at 1x speed
        fast = fast.next.next;
        slow = slow.next;
        //stop when fast and slow are equal
        if (slow == fast) {
            while (head != slow) {
                head = head.next;
                slow = slow.next;
            }
            return slow;
        }
    }
        return null;
    }
}