// Time Complexity                              :  O(N)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/linked-list-cycle-ii/

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
        ListNode *fast, *slow;
        if(head == NULL or head->next == NULL) return NULL;
        
        fast = head->next->next;
        slow = head->next;
        

        // The first time fast and slow meet, confirms that there is a cycle in the linked list.
        while(fast != NULL and fast->next != NULL and fast != slow) {
            fast = fast->next->next;
            slow = slow->next;
        }
        
        if(fast == NULL or fast->next == NULL) {
            return NULL;
        }
        
        // Move slow to the head of the linked list and keep fast where it was.
        // Move both fast and slow one node at a time forward.
        // Wherever they will meet, is the node from where the cycle originates.
        slow = head;
        while(fast != slow) {
            fast = fast->next;
            slow = slow->next;
        }
        
        return fast == slow ? fast : NULL;
    }
};