package com.offer;

import org.junit.Test;

public class ReverseList {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;



    }

    @Test
    public void reverse(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        //遍历一个链表
        ListNode head = listNode1;
        while(head != null){
            System.out.print(head.val);
            head= head.next;
        }


        System.out.println();
        ListNode head1 = reverseList(listNode1);
        while(head1 != null){
            System.out.print(head1.val);
            head1= head1.next;
        }


        //反转链表
//        listNode1.next = null;
//        listNode2.next = listNode1;
//        listNode3.next = listNode2;
//        listNode4.next = listNode3;
//        listNode5.next = listNode4;
//        listNode6.next = listNode5;
//
//
//        //遍历一个链表
//        head = listNode6;
//        while(head != null){
//            System.out.print(head.val);
//            head= head.next;
//        }


    }
}
