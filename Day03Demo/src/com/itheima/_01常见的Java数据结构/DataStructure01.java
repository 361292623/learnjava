package com.itheima._01常见的Java数据结构;
/*
* 数据结构： 栈，队列 ，线性表，链表 ，红黑树
*
*   （1）队列：先进先出 First In First Out(FIFO)
*         场景：各种排队。
*
    （2）栈：先进后出(后进先出) First In Last Out(FILO)
          场景：手枪的弹夹。
          做游戏 手枪 子弹

    （3）线性表：
        线程表就是数组的形式，它里面的元素是在一块连续的内存区域存储的，
        每个元素占用的空间大小是一样的。

        增删慢：每次增删元素时需要创建新的数组，需要拷贝大量的数组元素。
        查询快：可以直接根据索引获得对应的元素，可以直接根据索引计算出该索引元素的地址
               然后直接去这个地址拿到它。

    （4）链表
        链表它的元素是游离存储的，各个元素按照链前后衔接到一起。

        增删快：每次增删元素不需要移动元素位置，
               只需要修改上一个元素记住下一个元素的地址值。

        查询慢：每次查询元素都需要从链表头或链表尾部开始遍历查询。

    	索引决定了是从链表头还是链表尾部开始查询
    		如果索引大于等于元素个数的一半，从链表尾部开始查询，否则从链表头开始查询。

    （5）红黑树(了解) ==> 树 ==> 二叉树
        只有一个根节点。
        每个节点最多只有两个子节点
        二叉树一般用于对元素进行排序。
*
* */
public class DataStructure01 {
}
