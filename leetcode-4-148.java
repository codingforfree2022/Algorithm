class Solution {
    public ListNode mergeSort(ListNode i, ListNode j) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        
        while(i != null && j != null) {
            if(i.val < j.val) {
                cur.next = i;
                i = i.next;
            } else {
                cur.next = j;
                j = j.next;
            }
            
            cur = cur.next;
        }
        
        if(i != null) cur.next = i;
        else cur.next = j;
    
        return dummy.next;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode fast = head.next, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        fast = slow.next;
        slow.next = null;
        
        ListNode i = sortList(fast);
        ListNode j = sortList(head);
        
        return mergeSort(i, j);
    }
}