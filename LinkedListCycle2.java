// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*Two pointers slow and fast are moved in single step and 2 steps respectively to check whether a cycle exists inside the linked list.
 * When both pointers meet, then we will say that the cycle is present else its not.
 * To check from where the cycle starts in the linked list, reset slow pointer to head, move both the pointers by 1 step.
 *  When both pointers meet at a node then that node will be the starting node of the cycle.
*/
import com.util.customlist.ListNode;
public class LinkedListCycle2 {
	public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(!cycle) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
	
	public static void main(String[] args) {
		ListNode one = new ListNode(3);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(0);
		ListNode four = new ListNode(-4);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = two;
		//four.next = null;
		
		System.out.println("Head starts at: " + LinkedListCycle2.detectCycle(one));
	}
	
}
