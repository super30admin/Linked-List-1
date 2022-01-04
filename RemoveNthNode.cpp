// Time Complexity :  O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english

/* Use Slow and fast pointers. Start the fast pointer and maintain a count. Move the fast pointer till count becomes equals to n.
 * When count is euqal to n, start slow pointer and keep moving both the pointers forward until fast pointer becomes null.
 * When fast is null, slow's next is pointing to n'th node from end. Remove that node.
 */

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
        
        if (head == nullptr)
            return head;
        
        // Required for head element removal
        ListNode* dummy = new ListNode();
        dummy->next = head;
        
        int count = 0;
        ListNode *slow, *fast;
        
        slow = dummy;
        fast = dummy;
        
        while (count <=  n)
        {
            fast = fast->next;
            count++;
        }
        
        while (fast != nullptr)
        {
            fast = fast->next;
            slow = slow->next;
        }
        
        slow->next = slow->next->next;
        return dummy->next;
        
    }
};