package org.apache.ibatis.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class MybatisMain {

  public static void main(String[] args) throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//    try (SqlSession session = sqlSessionFactory.openSession()) {
//      Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 1);
//      System.out.println(blog);
//    }

    try (SqlSession session = sqlSessionFactory.openSession()) {
      HashMap<Object, Object> map = new HashMap<>();
//      map.put("id", 1);
      map.put("username", "digov");
      List<Blog> blogs = session.selectList("org.mybatis.example.BlogMapper.selectBlogBy", map);
      System.out.println(blogs);
    }

//    try (SqlSession session = sqlSessionFactory.openSession()) {
//      BlogMapper mapper = session.getMapper(BlogMapper.class);
//      Blog blog = mapper.selectBlog(1);
//      System.out.println(blog);
//    }
  }
}
