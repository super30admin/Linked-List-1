//this is still O(n) + O(1), tell me how!
//fundamentally, no different from solution given by sir
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
    if (head == NULL || head->next == NULL)
        return NULL;
    
    ListNode *tortoise  = head;
    ListNode *hare  = head;
    ListNode *answer = head;
    
    while (hare->next && hare->next->next) {
        tortoise = tortoise->next;
        hare = hare->next->next;
        if (tortoise == hare) {                      // there is a cycle
            while(tortoise != answer) {               // found the entry location
                tortoise  = tortoise->next;
                answer = answer->next;
            }
            return answer;
        }
    }
    return NULL;                                 // there has no cycle
}
};
