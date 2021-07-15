package org.apache.ibatis.demo.select;

import java.lang.reflect.Proxy;

public class SqlSessionF {

  public Object getMapper(Class clazz) {
    return Proxy.newProxyInstance(SqlSessionF.class.getClassLoader(), new Class[]{clazz}, new MapperProxyFactoryF());
  }
}
