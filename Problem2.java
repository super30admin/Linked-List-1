//Accepted on LT
//The idea is to haave 2 pointers n distance apart and move the window and than change the node pointers
//Time should be O(n)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(-1);
        d.next = head;
        int count = 0;
        ListNode fast = d;
        ListNode slow = d;
        

        while(count<=n){
            System.out.println(count);
            fast = fast.next;
            count++;
        }

        while(fast!=null){
            count++;
            System.out.println(count);
            fast= fast.next;
            slow=slow.next;
        }
        System.out.println(count);
        if(count-1==n){
            ListNode dfinal = head.next;
            head.next = null;
            return dfinal;
        }
        ListNode del = slow.next;
        slow.next = slow.next.next;
        del.next = null;
        return head;
        
    }
}