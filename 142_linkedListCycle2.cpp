// Time Complexity : O(N)
// Space Complexity :O(1)

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL){
            return head;
        }
        ListNode* fast = head;
        ListNode* slow = head;
        bool hasCycle = false;
        while(fast != NULL && fast->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle)
            return NULL;
        slow = head;
        while(slow != fast){
            slow = slow->next;
            fast = fast->next;
        }
        return fast;
    }
};
