/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    List<Integer> li ;
    ListNode root;
    Solution()
    {
        li = new ArrayList<>();
        root = null;
    }
    void append(ListNode b)
    {
        while(b!=null)
        {
            li.add(b.val);
            b = b.next;
        }
    }
    void set(int n)
    {
        ListNode temp = new ListNode(n,null);
        if(root==null)
            root = temp;
        else
        {
            ListNode p = root;
            while(p.next!=null)
                p = p.next;
            p.next = temp;
        }
    }
    public ListNode mergeKLists(ListNode[] b) 
    {
        int n = b.length;
        for(int i=0;i<n;i++)
            append(b[i]);
        Collections.sort(li);
        for(Integer i:li)
            set(i);
        return root;    
    }
}