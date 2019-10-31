// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :Nope


// Your code here along with comments explaining your approach
class Solution1 {
    public ListNode reverseList(ListNode head) {
        if(null == head || null == head.next){return head;}
        ListNode prev = null, node = head, next = null;
        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
    return prev;
    }
}
class Solution1.1 {
    ListNode result = null;
    public ListNode reverseList(ListNode head) {
        reverseList(head,null);
        return result;
    }
    public void reverseList(ListNode node, ListNode prev){
        if(null == node){
            return;
        }
        if(null == node.next){
            node.next = prev;
            result = node;
            return;
        }
        ListNode next = node.next;
        node.next = prev;
        reverseList(next,node);
    }
}