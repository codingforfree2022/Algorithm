public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode i = headA;
        ListNode j = headB;
        
        while(i != j) {
            i = i != null ? i.next : headB;
            j = j != null ? j.next : headA;
        }
        
        return i;
    }
}