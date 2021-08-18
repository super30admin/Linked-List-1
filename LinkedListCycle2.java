

/**
 *  * Definition for singly-linked list.
 *   * class ListNode {
 *    *     int val;
 *     *     ListNode next;
 *      *     ListNode(int x) {
 *       *         val = x;
 *        *         next = null;
 *         *     }
 *          * }
 *           */
public class Solution {
	    public ListNode detectCycle(ListNode head) {
		            if(head==null || head.next==null) return null;
			            boolean foundCycle=false;
				            ListNode slow=head,fast=head;
					            while(fast!=null && fast.next!=null){
							                fast=fast.next.next;            
									            slow=slow.next;
										                if(slow==fast){
													                slow=head;
															                foundCycle=true;
																	                break;
																			            }
												        }
						            if(foundCycle==false)
								                return null;
							            while(fast!=slow){
									                slow=slow.next;
											            fast=fast.next;
												            }
								            return slow;
									        }
}
