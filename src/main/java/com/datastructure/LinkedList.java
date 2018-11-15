package com.datastructure;

public class LinkedList<E> {

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

    private Node dummyHead;
    private int size;

    //获取链表的元素个数
    public LinkedList(){
        dummyHead = new Node();
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


    //向链表的index(0-based)位置添加新的元素e
    //不常用，练习
    public void add(int index,E e){
        if(index < 0 || index >size){
            throw new IllegalArgumentException("Add failed,Illegal index.");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index ; i++) {
            prev = prev.next;
        }
//      Node node = new Node(e);
//      node.next = prev.next;
//      prev.next = node;
        prev.next = new Node(e,prev.next);
        size ++;

    }

    //向链表头中添加新元素
    public void addFirst(E e){

        add(0,e);
    }

    //向链表末尾添加新的元素e
    public void addLast(E e){
        add(size,e);
    }


    //获得链表的第index(0-based)个位置的元素
    //在链表中不是一个常用的操作，练习用
    public E get(int index){

        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Add failed,Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }

        return cur.e;
    }


    //取得第一个节点
    public E getFirst(){
        return get(0);
    }

    //取得最后一个节点
    public E getLast(){
        return get(size -1);
    }

    //更新链表的第index(0-based)个位置的元素
    //在链表中不是一个常用的操作，练习用

    public void set(int index,E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Add failed,Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //查找链表中是否含有元素e

    public boolean contains(E e){
        Node cur = dummyHead.next;
//        for (int i = 0; i < size; i++) {
//            if(cur.e.equals(e)){
//                return true;
//            }
//            cur = cur.next;
//        }
//        return false;

        while(cur != null){

           if(cur.e.equals(e)){
                return true;
           }
           cur = cur.next;
        }
        return false;
    }

    //从链表中删除索引为index(0-base)位置的节点
    public E remove(int index){

        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Add failed,Illegal index.");
        }
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node retNode = pre.next;
        pre.next = retNode.next;
        retNode.next = null;
        return retNode.e;
    }


    //从链表中删除第一个元素
    public E removeFirst(){
      return remove(0);
    }

    //从链表中删除最后一个元素

    public E removeLast(){
        return remove(size - 1);
    }

    @Override
    public String toString() {
        Node cur = dummyHead.next;
        StringBuilder res= new StringBuilder();
        while (cur != null){
            res.append(cur.e +"->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
       // linkedList.addFirst(1);
       // System.out.println(linkedList);
        for (int i = 0; i < 5; i++) {
           linkedList.addFirst(i);
           System.out.println(linkedList);
        }
        linkedList.add(2,3333);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

    }
}