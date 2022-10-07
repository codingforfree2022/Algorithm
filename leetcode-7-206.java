class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode i = head, j = head.next;        
        
        while(j != null) {
            ListNode k = j.next;
            j.next = i;
            i = j;
            j = k;
        }
        
        head.next = null;
        return i;
    }
}