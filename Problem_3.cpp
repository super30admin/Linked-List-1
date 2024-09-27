//Time Complexity: O(N), where n is the number of elements in the linked list.
//Space Complexity: O(1).

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
        ListNode* slow = head;
        ListNode* fast = head;
        bool flag = false;
        while(fast && fast->next){
            slow = slow->next;
            fast = fast->next->next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(flag==true){
            slow = head;
            while(slow != fast){
                slow = slow->next;
                fast = fast->next;
         }
         return slow;
        }
       return NULL;
    }
};