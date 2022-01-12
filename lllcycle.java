//Time Complexity : O(n)
//Space Complexity : O(n)


public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap <ListNode,Integer> hm=new HashMap<>();

        while(head!=null){
            if(hm.containsKey(head)){
                return head;
            }else{
                hm.put(head,head.val);ß
                head=head.next;
            }
        }
        return null;



    }
}