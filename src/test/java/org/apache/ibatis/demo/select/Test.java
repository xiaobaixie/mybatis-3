package org.apache.ibatis.demo.select;

import org.apache.ibatis.demo.BlogMapper;

public class Test {

  public static void main(String[] args) {
    SqlSessionF sqlSessionF = new SqlSessionF();
    BlogMapper mapper = (BlogMapper) sqlSessionF.getMapper(BlogMapper.class);
    mapper.selectBlog(1);
  }
}
