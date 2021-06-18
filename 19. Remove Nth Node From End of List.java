class Solution {
    // method 1: we still could use arr to handle this problem as we did in
    // reverst list
    // Time complexity: O(n)
    // Space complexity: O(n)
    
    // // method 2: directly operate on the list
    // // Time complexity: O(n)
    // // Space complexity: O(n)
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     if(head == null)
    //         return null;
    //     int m = helper(head, n);
    //     head = m > n? head:head.next;
    //     return head;
    // }
    //  public int helper(ListNode cur, int n){
    //     if(cur.next == null)
    //         return 1;
    //      // we use recursive to compute the m from the end 
    //     int m = helper(cur.next, n);
    //     m++;
    //     // once we find the elment we need delete it
    //     // here, we should pay attention to n + 1, since we return 1,
    //     // in the base case.
    //     if(m == n + 1){
    //         cur.next = cur.next == null? null: cur.next.next;
    //     }
    //     return m;
    // }
    
    // method 3, same idea with the reverse list
    // Time complexity: O(n)
    // Space complexity: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // we need control the gap between first and second as n 
        for(int i = 0; i < n + 1; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        // delete the target node
        second.next = second.next.next;
        return dummy.next;
    }
}