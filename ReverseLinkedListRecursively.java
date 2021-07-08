//Time Complexity :O(N)
//Space Complexity :O(N) - recursion stack
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this :Nope


//Your code here along with comments explaining your approach
class ReverseLinkedListRecursively {
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

