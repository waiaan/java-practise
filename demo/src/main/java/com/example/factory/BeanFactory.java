package com.example.factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
  private static Properties props = new Properties();

  private static Map<String, Object> beans = new HashMap<String, Object>();

  static {
    InputStream in = null;
    try {
      in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
      props.load(in);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
    }
  }

  public static Object getBean(String beanName) {
    Object bean = null;
    String beanPath = props.getProperty(beanName);
    if (beans.get(beanName) == null) {
      try {
        bean = Class.forName(beanPath).getDeclaredConstructor().newInstance();
        beans.put(beanName, bean);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return beans.get(beanName);
  }
}
