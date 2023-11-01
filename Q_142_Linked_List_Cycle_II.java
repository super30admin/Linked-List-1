package Q_142_Linked_List_Cycle_II;


//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the 
//linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
//
//Note: Do not modify the linked list.
//
// 
//
//Example 1:
//
//Input: head = [3,2,0,-4], pos = 1
//Output: tail connects to node index 1
//Explanation: There is a cycle in the linked list, where tail connects to the second node.
//
//
//Example 2:
//
//Input: head = [1,2], pos = 0
//Output: tail connects to node index 0
//Explanation: There is a cycle in the linked list, where tail connects to the first node.
//
//
//Example 3:
//
//Input: head = [1], pos = -1
//Output: no cycle
//Explanation: There is no cycle in the linked list.

//Time Complexity  : O(n)  
//Space Complexity : O(1)

public class Solution {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	static ListNode root = new ListNode(0);


	public ListNode detectCycle(ListNode head) {

		if(head == null) {
			return head;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		boolean isCycle = false;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast == slow) {
				isCycle = true;
				break;
			}
			
		}
		if(isCycle != true) {
			return null;
		}
		slow = head;
		int pos =0;
		while(slow != fast) {
			slow= slow.next;
			fast = fast.next;
			pos++;
		}
		return slow;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root.next = new ListNode(1);
		root.next.next = new ListNode(2);
		root.next.next.next = new ListNode(3);
		root.next.next.next.next = new ListNode(4);
		root.next.next.next.next.next = root.next.next;


		Solution s = new Solution();
				System.out.println(s.detectCycle(root).val);
	}
}
