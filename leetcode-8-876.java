class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}

/*
	slow和fast指针的初始值，有都指向head和一个指向head一个指向head.next两种；
	这取决于当链表的节点数量为偶数时，题目要去返回第一个中间节点还是第二个中间节点；


*/