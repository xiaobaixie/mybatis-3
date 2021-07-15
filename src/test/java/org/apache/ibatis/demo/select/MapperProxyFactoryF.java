package org.apache.ibatis.demo.select;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperProxyFactoryF implements InvocationHandler {
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // 获取SQL语句，然后就去执行，具体业务代码 mybatis: selectOne
    Select select = method.getAnnotation(Select.class);
    String sql = select.value()[0];
    System.out.println("SQL------>[" + sql + "]------------>[" + args[0] + "]");

    return null;
  }
}
