//Leetcode 206. Reverse Linked List

//Iterative Solution
//Time Complexity : O(n) //n is total number of nodes
//Space Complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        //using three pointers
        ListNode prev= null;
        ListNode curr= head;
        ListNode cnext=head.next;
        
        while(cnext!=null){
            curr.next= prev;
            prev= curr;
            curr=cnext;
            cnext=cnext.next;
        }
        curr.next= prev;
        return curr;
    }
}


==================================
Recursive slolution:
//206. Reverse Linked List //Recursive solution
//Time Complexity : O(n)
//Space Comlexity : O(n) //n is number of nodes in LinkedList 

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        return helper( head);
    }
    public ListNode helper(ListNode h){
        if(h==null || h.next==null){
            return h;
        }
        
        ListNode p=helper(h.next);
        h.next.next=h;
        h.next= null;
        
        return p;
        
        
    }
}