//	Timecomplexity:- O(n);
//Space complexity:-O(1);
//Did it run on leetcode:- Yes.
//What were the problems faced while doing it?:- got some null pointer exceptions.
//:- Your code with explanation:- first total nodes are found ,we know that if we subtract n from total we will be getting number of nodes from starting based on this value iterating and when node is found 
//that current node next is null and previousnode next will be current node next.







class Solution {
   private int getLength(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLength(head);
        int lenFromHead = len-n-1;
        ListNode node = head;
        while(lenFromHead-- > 0){
            node = node.next;
        }
        
        if(len == n){
            node = head.next;
            head.next = null;
            head = node;
        }
        else if(node.next != null){
            ListNode temp = node.next;
            node.next = temp.next;
            temp.next = null;
        }
        
        return head;
    }
}