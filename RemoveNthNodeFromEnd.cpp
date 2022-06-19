// Brute-force solution. It uses two passes of the given linked list.
// Time Complexity - O(n) - Since we are iterating over 'n' nodes in the input list.
// Space Complexity - O(1) - Since we are just using two pointers('temp' and 'curr') to get to the solution
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        int count = 0;
        ListNode* temp = head;
        while(temp){
            count++;
            temp = temp->next;
        }
        delete temp;
        cout << count << endl;
        if(count == n){
            head = head->next;
            return head;
        }
        
        ListNode* curr = head;
        int m = count - n - 1;
        for(int i = 0; i < m; i++){
            curr = curr->next;    
        }
        curr->next = curr->next->next;
        return head;
    }
};

// Approach 2 - In one pass
// Time Complexity - O(n) - Since we are iterating over 'n' nodes in the input list.
// Space Complexity - O(1) - Since we are just using 3 pointers('slow', 'fast' and 'dummy') to get to the solution
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        ListNode* fast = dummy;
        ListNode* slow = dummy;
            for(int i = 0; i <= n; i++){
                fast = fast->next;
         }
        
        while(fast){
            fast = fast->next;
            slow = slow->next;
        }
        
        slow->next = slow->next->next;
        return dummy->next;
    }
};