// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// LinkedList cycle ii
//Time o(n), n- size of the linkedlist.
//space o(1) 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode fastptr = head;
        ListNode slowptr = head;
        boolean flag = false;
        
        while(fastptr !=null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slowptr = head;
        while(slowptr != fastptr){
            fastptr = fastptr.next;
            slowptr = slowptr.next;
        }
        return fastptr;
    }
}

//remve nth node
//time o(n)
//space o(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;
        
        while(fast!=null && count <=n)
        {
            fast = fast.next;
            count++;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        //nth node
        ListNode temp = slow.next;
        //bypassing
        slow.next = slow.next.next; 
        //making nth node pointing to null
        temp.next = null;
        return dummy.next;
    }
}

//reverse a linkedlist
//time o(n)
//space o(n) -- recursive stack
//recursion solution
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode r = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return r;
    }
}

//iterative
//time o(n)
//space o(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode prev = null;
        ListNode cur = head;
        
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}