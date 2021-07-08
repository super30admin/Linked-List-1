//Time Complexity :O(N)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this :Nope


//Your code here along with comments explaining your approach
class RemoveNthFromEnd {
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

class RemoveNthFromEnd2 {
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(null == head){
        return head;
    }
    ListNode dummy = new ListNode(Integer.MIN_VALUE);
    dummy.next = head;
    ListNode slow = dummy, fast = dummy;
    int count = 0;
    while(count <= n){
        fast = fast.next;
        count++;
    }
    while(null != fast){
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
}
}
