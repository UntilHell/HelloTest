package com.datastructure;

import org.junit.Test;

public class Array<E> {
    private E[] data;
    private int size;
    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    //返回数组的容量
    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //向所有元素后添加一个新的元素
    public void addLast(E e){
//        if(size == data.length){
//            throw new IllegalArgumentException("Add Last Fail,Array Is Full");
//        }
//        data[size] = e;
//        size++;

        add(size,e);
    }

    public void addFirst(E e){
        add(0,e);
    }

    //在index添加一个元素e
    public void add(int index,E e){
        if(index <0 || index > size){
            throw new IllegalArgumentException("Add Fail,Require index > 0 or index <= size");
        }
        if(size == data.length){
            resize(2*data.length);
        }

        for (int i = size -1; i >= index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }


    //获取index索引位置的元素
    E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }
        return data[index];
    }

    public E getLast(){
        return get(size -1);
    }

    public E getFirst(){
        return get(0);
    }
    //修改index索引位置为e
    void set(int index, E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed. Index is illegal");
        }
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    //查找数组中是元素e的索引
    public int find(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    //删除指定的索引位置的元素，返回删除元素
    public E remove(int index){

        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Remove failed. Index is illegal");
        }

        E ret = data[index];
        for (int i = index + 1; i < size ; i++) {
            data[i-1] = data[i];
        }
        size --;
        data[size] = null;
        if(size == data.length / 4 && data.length / 2 != 0){
            resize(data.length / 2);
        }
        return ret;
    }


    //删除第一个元素
    public E removeFirst(){
        return remove(0);
    }
    //删除最后一个元素
    public E removeLast(){
        return remove(size - 1);
    }

    //删除e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size - 1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
