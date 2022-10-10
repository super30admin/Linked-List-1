//B-F approach 
//using stack 
//TC- O(n)+O(n) = O(n)
//sc-O(n)


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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        Stack<ListNode> s = new Stack<>();
        ListNode curr = head;
        //traverse through the LL and push all the nodes to the Stack
        while(curr!= null)
        {
            s.push(curr);
            curr = curr.next;
        }
        ListNode head2 = s.pop();
        ListNode curr2 = head2;
        //pop from the stack and reference it
        while(!s.isEmpty())
        {
            curr2.next = s.pop();
            curr2 = curr2.next;
        }
        curr2.next = null;
        return head2;
    }
}


//iterative pproach
//Tc- O(n)
//sc - O(1)

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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
     
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;
        
        while(fast != null)
        {
            curr.next =prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;   
       
    }
}