
class ReverseList {
	    public ListNode reverseList(ListNode head) {
		            if(head==null) return null;
			            ListNode dummy=null, cur=head, fast=head.next;//three pointers and changing the pointers without extra space
				            while(fast!=null){
						                cur.next=dummy;
								            dummy=cur;
									                cur=fast;
											            fast=fast.next;
												            }
					            cur.next=dummy;
						            return cur;
							        }
}
