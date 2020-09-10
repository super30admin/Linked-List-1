//Time Complexity: O(n)//length of the list
//Space Complexity: O(1)
//Did it run on leetcode: yes
//Problems faced any: No

public class Problem49 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //find size of the list
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            size++;
            curr = curr.next;
        }

        if(size==1)
            return null;
        if(size == n)
            return head.next;
        int count = 0;
        curr = head;
        while(count < size-n-1){
            count++;
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
