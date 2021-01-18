// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach


import com.util.customlist.*;
public class ReverseLinkedList {
	//Iterative approach
    public static ListNode reverseListIterativeApproach(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
	
	//Recursive approach
    public static ListNode reverseListRecursiveApproach(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode reversed = reverseListRecursiveApproach(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
	
    public static void main(String[] args) {
    	ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		System.out.println(ReverseLinkedList.reverseListIterativeApproach(one));
		System.out.println(ReverseLinkedList.reverseListRecursiveApproach(one));
		
	}
}
