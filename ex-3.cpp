//time complexity: O(n) - as we are travelling only one through the list
//space complexity: O(1) - no extra space is used in the process

//idea: take two pointers fast and slow and fast moves two steps at a time and slow moves one step at a time.
//if fast reaches a nullptr then no cycle and if slow and fast meet each other then there is the cycle 
//Now we have to find at which node the cycle starts.
//for that take another pointer start it from head and move one step at a time and slow also moves one step at a time from the node both fast and slow meets each other.
//the point where both slow and new pointer meet is the starting point of the cycle.

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
        int pos;
        ListNode* slow = head; //moves one step at a time
        ListNode* fast = head; //moves two steps at a time
        ListNode* meet = head; //stays still till fast and slow meet and move one step at a time after they meet

        //base case -> no linked list, only one node.
        if(head == nullptr || head->next == nullptr){
            pos = -1;
            return nullptr;
        }

        while(fast != nullptr && fast->next != nullptr){ //exit when fast is nullptr or when it is at end node 
            fast = fast->next->next;
            slow = slow->next;
            if(fast == slow){
                int count = 0;
                while(slow != meet){
                    slow = slow->next;
                    meet = meet->next;
                    count++;
                }
                pos = count;
                return meet;
            }
        }
        pos = -1;
        return nullptr; // no cycle is present in the linked list 
    }
};
