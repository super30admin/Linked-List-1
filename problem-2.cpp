// Remove Nth Node From End of List
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
uses two pointers, one moving n steps ahead (fp) and the other traversing from the beginning (sp). Once fp reaches the end,
indicating n steps from the end, sp is positioned at the node just before the one to be removed. then adjusts the pointers
to bypass the node to be removed and deletes it, ensuring the list remains connected.
*/

ListNode* removeNthFromEnd(ListNode* head, int n) {
    ListNode *sp = head,*fp = head;
    for(int i = 1;i<=n;i++){
        fp=fp->next;
    }
    if (fp == NULL){
        sp = sp->next;
        delete head;
        return sp;
    } 
    while(fp->next!=NULL)
    {
        // prev = sp;
        sp=sp->next;
        fp=fp->next;
    }
    ListNode *prev = sp->next;
    sp->next = sp->next->next;
    delete prev;
    
    return head;

}