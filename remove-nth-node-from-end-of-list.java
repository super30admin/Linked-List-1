// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// take two pointer and give headstart of n+1 to one pointer. when this pointer reaches to end, slow pointer will 
// be at previous position of node to be deleted.

public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode prevNode = null;
    ListNode currNode = head;
    int count = 0;
    while(currNode.next!=null){
        currNode = currNode.next;
        count++;
        if(count>=n){
            if(prevNode == null){
                prevNode = head;
            }else
            prevNode = prevNode.next;
        }            
    }
    if(prevNode == null){
        return head.next;
    }
    if(n == 1){
        prevNode.next = null;
    } else{
        prevNode.next = prevNode.next.next;
    }
    return head;        
}