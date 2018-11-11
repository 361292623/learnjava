package com.itheima._08jdbcTemplate执行DQL;

import com.itheima._03数据源工具类.DataSourceUtil;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
    jdbcTemplate执行DQL语句：查询数据
 */
public class JdbcTemplateDemo01 {
    // 查询产品记录数
    @Test
    public void test01() throws Exception {
        // 创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 执行查询：查询产品记录数
        // int count = jdbcTemplate.queryForInt("select count(*) from product;");

        // 执行查询：查询id为5产品的价格
        int price = jdbcTemplate.queryForInt("select price from product where id = ?;",5);
        System.out.println("price = " + price);
    }

    // queryForLong  返回一个long类型整数
    @Test
    public  void test02() throws Exception {
        // 创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 执行查询：查询产品记录数
        long count = jdbcTemplate.queryForLong("select count(*) from product;");
        System.out.println("count = " + count);
        // 执行查询：查询id为5产品的价格
        long price = jdbcTemplate.queryForLong("select price from product where id = ?;",5);
        System.out.println("price = " + price);
    }

    /*
        public <T> T queryForObject(String sql, Class<T> requiredType,Object...params)
        执行查询语句，返回一个指定类型的数据。
    */
    @Test
    public void test03() throws Exception {
        // 创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 执行查询：查询产品记录数
        int count = jdbcTemplate.queryForObject("select count(*) from product;",
                Integer.class);
        System.out.println("count = " + count);

        // 执行查询：查询id为5产品的价格
        long price = jdbcTemplate.queryForObject("select price from product where id = ?;",Long.class,5);
        System.out.println("price = " + price);
    }

    // 需求：根据编号查询产品名称，返回字符串
    @Test
    public void test04() throws Exception {
        // 创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 查询id为2的产品名称
        String name = jdbcTemplate.queryForObject("select name from product where id = 2;", String.class);
        System.out.println(name);
    }


    /*  public Map<String, Object> queryForMap(String sql)
            执行查询语句，将一条记录放到一个Map中。
           Map集合的键：字段名  值：列的值
           {id=2,name=Iphone 7p,price=4500}
        */
    @Test
    public void test05() throws Exception {
        // 创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 查询id为2的产品信息
        Map<String, Object> map = jdbcTemplate.queryForMap("select * from product where id = 2;");
        System.out.println(map);
    }

    /*
    public List<Map<String, Object>> queryForList(String sql)
        执行查询语句，返回一个List集合，List中存放的是Map类型的数据。
     */
    @Test
    public void test06() throws Exception {
        // 创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtil.getDataSource());
        // 查询所有产品信息
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from product;");
        list.forEach(System.out::println);
    }
}
