- 自定义XML标签
  - xsd:schemas
  - handlers: 命名空间，org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.parseBeanDefinitions
  - 标签属性



- 读取配置文件
  - ![ClassPathXmlApplicationContext](.app_images/6300201d.png)
- 创建工厂BeanFactory
- 创建BeanDefinitionReader, 并且设置BeanFactory
  - ![loadBeanDefinitions-code](.app_images/c6dff3d5.png)
  - ![Schemas](.app_images/6e02e215.png)
  - ![loadBeanDefinitions-stack](.app_images/f86f7d9c.png)


