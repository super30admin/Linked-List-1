// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//1. linked List Cycle
//Time Complexity -> O(n)
//Space Complexity -> O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(flag == true){
            temp = head;
            while(slow!=null && temp!=null && slow!=temp){
                slow = slow.next;
                temp = temp.next;
            }
            return slow;
        }else{
            return null;
        }
        
    }
}

//Remove nth Node from Linked List
//Time Complexity -> O(n)
//Space Complexity -> O(1)
class Solution {
    //Fast at head
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode dummy = new ListNode(-1);

        ListNode slow = dummy; //to maintain a distance between slow and fast
        dummy.next = head;
        ListNode fast = head;
        int count = 0;
        while(count<n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //ListNode temp = slow.next;
        slow.next = slow.next.next;
        //temp.next = null;
        return dummy.next;
        
    }
}

class Solution {
    //Fast at dummy
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode dummy = new ListNode(-1);

        ListNode slow = dummy; //to maintain a distance between slow and fast
        dummy.next = head;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //ListNode temp = slow.next;
        slow.next = slow.next.next;
        //temp.next = null;
        return dummy.next;
        
    }
}

//3. Reverse a Linked List
//Iterative Solution
//Time Complexity -> O(n)
//Space Complexity -> O(1)
class Solution {
    public ListNode reverseList(ListNode head) {

        //Iterative Solution
        if(head == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head.next;
        while(curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev;

        return curr;
        
    }
}

//Recursive Solution
//Time Complexity -> O(n)
//Space Complexity -> O(n)
class Solution {
    ListNode result = null;
    public ListNode reverseList(ListNode head) {

        //Recursive Solution
        if(head == null || head.next==null) return head;
        result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
        
    }
}