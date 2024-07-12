// time: O(n)
// space: O(1) - iterative; O(n) - recursive

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
    ListNode* reverseList(ListNode* head) {
        /*
        //iterative - 3 ptrs
        if(head == NULL || head -> next == NULL) {
            return head;
        }
        ListNode *slow = NULL;
        ListNode *curr = head;
        ListNode *fast = head -> next;
        while(fast != NULL) {
            curr -> next = slow;
            slow = curr;
            curr = fast;
            fast = fast -> next;
        }
        curr -> next = slow;
        return curr;
        */

        //recursive
        if(head == NULL) {
            return head;
        }
        return helper(head);
    }
private:
    ListNode* helper(ListNode* head) {
        if(head -> next == NULL) {
            return head;
        }
        ListNode* newHead = helper(head -> next);
        head -> next -> next = head;
        head -> next = NULL;
        return newHead;
    }
};