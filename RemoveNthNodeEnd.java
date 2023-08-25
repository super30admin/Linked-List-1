// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


//using slow and fast pointer and a dummy node for removing head node in a testcase
class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            //dummy
            ListNode dummy = new ListNode(-1);
            dummy.next= head;


            ListNode fast = dummy;
            int count=0;
            
            //fast reaches nth node
            while(count<=n){
                fast=fast.next;
                count++;
            }
    
            ListNode slow = dummy;
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            //removing the node
            ListNode temp=slow.next;
            slow.next=slow.next.next;
            temp.next=null;

            //returning head
            return dummy.next;
            
        }
    }
    

