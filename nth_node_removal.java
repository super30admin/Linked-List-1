//TC : O(N)
//SC: O(1)


//Approach 1:
// iterate and find the number of total nodes
// in the next pass go through the list till the count-n-1 to get the prev node and make changes
public class nth_node_removal {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            
            int count =0;
            ListNode curr = head;
            while(curr!=null){
                count++;
                curr = curr.next;
            }
            curr = head;
            if(count ==n){
                return head.next;
            }
            for(int i=0;i< count-n-1;i++){
                curr= curr.next;
            }
            curr.next= curr.next.next;
            return head;
            
        }
    }
}

