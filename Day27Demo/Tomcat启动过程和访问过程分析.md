tomcat服务器启动过程
1. 加载web.xml配置文件并使用DOM方式进行解析
2. 先解析每一个<servlet>标签，将解析到的数据存储到Map集合
	* Map<String,String> servlet; 其中key是servlet名字，value是servlet-class。
	servlet.put("one","com.itheima.FirstServlet");
	servlet.put("three","com.itheima.ThreeServlet");

3. 然后解析每一个<servlet-mapping>，将解析到的数据存储到Map集合
	* Map<String,String> servletMapping; 其中key是servlet名字，value是url-pattern。
	servletMapping.put("/one","one");

浏览器访问：http://localhost:8080/qq/one
1. 通过域名找主机：localhost 表示本机。通过端口找程序：8080端口对应tomcat服务器程序。
2. 通过/qq确定访问服务器中的哪个应用程序
3. 将/one作为servlet集合的key获得servlet名称
4. 根据servlet命名作为servletMapping集合的key获得servlet类全名字符串
5. 根据 servlet类全名字符串 通过反射创建Servlet对象，并创建request和response对象
6. 调用Servlet对象的service方法并传递request和response对象
