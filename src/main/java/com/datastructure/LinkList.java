package com.datastructure;

public class LinkList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    int size;

    //获取链表的元素个数
    public LinkList(){
        head = null;
        size = 0;
    }

    //获取链表中元素的个数
    public int getSize(){
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //向链表头中添加新元素
    public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        head = new Node(e,head);
        size ++;
    }

    //向链表的index(0-based)位置添加新的元素e
    //不常用，练习
    public void add(int index,E e){
        if(index < 0 || index >size){
            throw new IllegalArgumentException("Add failed,Illegal index.");
        }

        if(index == 0){
            addFirst(e);
        }else{
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
            prev.next = new Node(e,prev.next);
            size ++;
        }
    }

    //向链表末尾添加新的元素e
    public void addLast(E e){
        add(size,e);
    }
}
