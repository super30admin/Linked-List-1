//Time Complexity: O(N), where n is the number of elements in the linked list.
//Space Complexity: O(1).

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(0);
        ListNode* slow = dummy;
        ListNode* fast = dummy;
        dummy->next = head;
        int count = 0;
        while(count<=n){
            fast = fast->next;
            count++;
        }
        while(fast != NULL){
            fast = fast->next;
            slow = slow->next;
        }
        slow->next = slow->next->next;
        return dummy->next;
    }
};