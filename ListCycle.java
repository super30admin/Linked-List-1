// Time Complexity : O(n) n is the number of elements in the linked list
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach



public class ListCycle {
    ListCycle(String s){ n=s;}
    String n;
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hm = new HashSet<>();
        while(true){
            if(head==null){
                return null;
            }
            if(hm.contains(head)){
                return head;
            }
            else{
                hm.add(head);
            }
            head = head.next;
        }
    }

    public static void main(String[] args){
        ListCycle obj = new ListCycle();

    }
}
