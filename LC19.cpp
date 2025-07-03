// Time complexity O(n)
// Space complexity O(1)

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
        if (head == nullptr) {
            return head;
        }

        int size = length(head);
        if (n > size) {
            return head;
        }

        int k = size - n + 1;
        ListNode* prev = nullptr;
        ListNode* curr = head;
        for (int i = 1; i < k; i++) {
            prev = curr;
            curr = curr->next;
        }

        if (prev == nullptr) {
            head = head->next;
            return head;
        }

        prev->next = prev->next->next;
        return head;
        
    }

    int length(ListNode* head) {
        if (head == nullptr) {
            return 0;
        }

        int count = 0;
        ListNode* curr = head;
        while (curr != nullptr) {
            count++;
            curr = curr->next;
        }
        return count;
    }
};