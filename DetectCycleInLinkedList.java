package s30Coding;

//Time Complexity :- O(n) where n is the length of the linkedList

//Space Complexity :- O(1)

//LeetCode :-Yes

public class DetectCycleInLinkedList {

		class ListNode {
			int val;
			ListNode next;
			ListNode(int x) {
				val = x;
				next = null;
			}
		}

	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        
	        boolean flag = false;
	        ListNode slow =head;
	        ListNode fast = head;
	        while(fast != null && fast.next !=null){
	            
	            slow = slow.next;
	            fast = fast.next.next;
	            if(slow == fast){
	                flag = true;
	                break;
	            }
	        }
	        if(!flag){
	            return null;
	        }
	        slow = head;
	        while(slow != fast){
	            slow = slow.next;
	            fast = fast.next;
	        }
	        
	        return slow;
	    }
	}
}
