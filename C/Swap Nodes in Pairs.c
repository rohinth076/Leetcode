/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int length(struct ListNode * root)
{
    struct ListNode *p;
    int c=0;
    p=root;
    while(p!=NULL)
    {
        c++;
        p=p->next;
    }
    return c;
}

struct ListNode* swapPairs(struct ListNode* root)
{
    struct ListNode *p,*q;
    int n,i,c,l;
    p=root;
    n=length(root);
    l=n/2;
    i=1;
    while(i<=l)
    {
        q=p->next;
        
        c=p->val;
        p->val=q->val;
        q->val=c;
        
        p=q->next;
        i++;
        
    }
    return root;
}

