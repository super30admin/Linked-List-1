/**
 * TC - O(n)
 * SC - S(1)
*/
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = NULL;
        ListNode*  curr = head;
        while(curr){
            ListNode* tempNode  = curr->next;
            curr->next = prev;
            prev = curr;
            curr = tempNode;

        }
        return prev;
    }
};