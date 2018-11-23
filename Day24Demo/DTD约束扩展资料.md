# DTD语法-元素约束

- 元素约束的语法	

  ```dtd
  <!ELEMENT 元素名 元素的类别或内容>
  ```

- 元素的类别有三种

  ```dtd
  (#PCDATA)：Parsed Character Data 被解析的字符数据。即文本内容。
  EMPTY：表示一个空的标签 如：<BR/>  的DTD为：<!ELEMENT BR EMPTY>
  ANY：任意内容都可以
  ```

- 元素的内容修饰符号

  ```dtd
  ？：表示出现0或1次
  * ：表示出现0或n次
  + ：表示出现1或n次
  ()：用来给元素分组
  | ：表示在列出的对象中选择一个
  , ：表示组中的元素必须按照指定的顺序出现。
  ```

- 回答每一行的含义

  ```dtd
  book (title,author,price) book中包含这三个子元素，而且子元素要依次出现，出现一次。
  book (title|author|price) book中包含这三个子元素的其中一个。
  book (author+) book中子元素author出现1~n次
  book (author*) book中子元素author出现0~n次
  book (author?) book中子元素author出现0~1次
  book (author)  book中子元素author只能出现1次
  ```

# DTD语法-属性约束

- 属性约束语法

  ```dtd
  <!ATTLIST 元素名 
  	属性名 属性类型 类型选项
  	属性名 属性类型 类型选项>  
  ```

- 属性类型

  ```dtd
   属性类型					说明
   CDATA				  字符类型(Character Data)
  (enum1|enum2|enum3)   枚举类型，属性的取值从给定的几种中选择
    ID        		属性值在整个XML文件中是唯一，而且命名不能以数字开头
  ```

- 类型选项

  ```dtd
  类型选项			选项的含义
  #REQUIRED		   必须的属性
  #IMPLIED		   可选的属性
  #FIXED value 	   属性的值是固定的，只能取value
  默认值	    		 不显示给出属性时，则该属性的值为默认值
  ```
