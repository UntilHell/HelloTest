# HelloTest
idea项目
#将练习剑指offer的题目

#2018.11.11分析动态数组的时间复杂度

添加操作

addLast(e)    O(1) 直接在末尾添加

addFirst(e)   O(n) 需要移动

add(index,e)  O(n/2) = O(n)    平均向后移动n/2

需要resize O(n)

删除O(n)


改：已知索引O(1);未知索引O(n)

查：已知索引O(1);未知索引O(n)

不会每次都会触发resize

假如当前capacity = 8

每次addLast,都会进行2次基本操作

均摊复杂度O(1)

复杂度震荡

lazy

当size = capacity/4


#栈和队列
线性

操作是数组的子集

一端存取
##栈的应用

编辑器的撤销undo

系统栈的调用-操作系统

括号匹配-编译器

程序调用所使用的系统栈

子过程调用结束后，会回到原来的位置，就是栈

递归

##栈的实现

多种底层实现方式

时间复杂度全是O(1)

括号匹配

#队列Queue

先进先出FIFO

void enqueue(E) O(1) 均摊

dequeue(E) 出队O(n)

#循环队列

出栈为O(1)
真是复杂
全是O(1)

研究的意义在哪里，区别


