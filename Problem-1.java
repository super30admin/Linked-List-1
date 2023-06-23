//Recursevie methid
class Solution {
    //Time Complexity:-O(n)
    //Space Complexity:-O(1)
    public ListNode reverseList(ListNode head) {
        //basic condition
        if(head == null || head.next == null) return head;
        //logic
        ListNode recurs = reverseList(head.next);
        //st.pop or recuersive stack.pop() happens
        head.next.next = head;
        head.next = null;
        return recurs;
    }
}
//Iterative method
class Solution {
    //Time Complexity:-O(n)
    //Spcae Complexity:-O(1)
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode current = head;
        ListNode fast = current.next;
        ListNode prev = null;
        while(fast!=null){
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
        }
        current.next = prev;
        return current;
    }
}