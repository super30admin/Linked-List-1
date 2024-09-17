// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on GeeksforGeeksEditor : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode res = new ListNode(0);
     res.next = head;
     ListNode first = res;
     ListNode second = res;
     //Maintain n nodes gap betwen first and second nodes
     //move first pointer till n and start traversing again first and second till null
     for(int i=0;i<=n;i++){
         first=first.next;
     }
     while(first != null){
         first = first.next;
         second = second.next;
     }
     
     second.next=second.next.next;
     return res.next;
    }
}