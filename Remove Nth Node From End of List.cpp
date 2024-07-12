// time: O(n)
// space: O(1)

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
        
        ListNode* dummy = new ListNode(0, head);
        ListNode *slow = dummy;
        ListNode *fast = dummy;
        int count = 0;
        while(count <= n) {
            fast = fast -> next;
            count++;
        }
        while(fast != NULL) {
            slow = slow -> next;
            fast = fast -> next;
        }
        if(slow == dummy) {
            return head -> next;
        }
        slow -> next = slow -> next -> next;
        return head;
    }
};