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
//Time Complexity :O(N)
//Space Complexity :O(N) - recursion stack
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this :Nope


//Your code here along with comments explaining your approach
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

//Time Complexity :O(N)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this :Nope


//Your code here along with comments explaining your approach
class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(null == head || 0 == n){return head;}
        ListNode fast = head, slow = head;
        int counter = 1;
        while(null != fast && null != fast.next){
            slow = slow.next;
            fast = fast.next.next;
            counter++;
        }
        int N = 0;
        if(null == fast){
            N = 2*counter -2;
        }else if(null == fast.next){
            N = 2*counter-1;
        }
        int actualN = N - n;
        if(0 == actualN){return head.next;}
        if(actualN < counter){
            slow = head;
            counter = 1;
        }
        while(actualN != counter){
            slow = slow.next;
            counter++;
        }
        if(null != slow)
        slow.next = slow.next.next;
        return head;
    }
}


//Time Complexity :O(N)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this :Nope


//Your code here along with comments explaining your approach
public class Solution3 {
    public ListNode detectCycle(ListNode head) {
        if(null == head || null == head.next){return null;}
        ListNode slow = head, fast = head;
        boolean isStart = true;
        while(isStart || (null != fast && null != fast.next && fast != slow)){
            if(isStart){isStart = false;}
            slow = slow.next;
            fast = fast.next.next;
        }
        if(null == fast || null == fast.next){return null;}
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
    return fast;
    }
}