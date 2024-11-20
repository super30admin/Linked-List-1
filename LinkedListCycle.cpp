/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        //initialize two pointer fast and slow
        ListNode *slow = head;
        ListNode *fast = head;

        // now to detect the cycle
        while(fast && fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
            if(fast == slow)
                break;
        }
        //check if no cycle is detected
        if(!fast || !fast->next)
            return NULL;
        //once we detected the cycle
        slow = head;
        while(slow != fast)
        {
            slow= slow->next;
            fast= fast->next;
        }

        return slow;
    }
};
//Time Complexity O(N)
//Space Complexity O(1)
