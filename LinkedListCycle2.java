ublic class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = true;;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ){
                flag = false;
                break;
            }
        }

        if(flag){
            return null;
        }
        slow = head;

        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

/**
TC : O(n)

SC : O(1)

Description : 

By using 2 pointers, one pointer moves with normal speed and second pointer moves with 2X speed, they both will meet each other. By this we can check whether a cycle exists or not.

To check the starting position of cycle, we can use this formula or method.

If a+b(firstPointer) = a+b+c+b/2 (SecondPointer) → a+2b = a+2b+c → a=c

So resetting the first pointer and iterating first pointer and second pointer, where they both meet is the starting position.  

TC : O(n), SC : O(1)



 */