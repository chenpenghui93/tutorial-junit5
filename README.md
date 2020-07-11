# tutorial-junit5
## 简介
JUnit是一个Java测试框架，JUnit5是下一代的JUnit。<br>
JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage  

- JUnit Platform 测试框架的基础  
- JUnit Jupiter 基于Java8+的新特性做的更改  
- JUnit Vintage 为了向下兼容JUnit4、JUnit3  

官网：https://junit.org/junit5/

文档：https://junit.org/junit5/docs/current/user-guide/

## 快速开始

### 版本要求
  - JDK 1.8+
  - Spring Boot 2.2.x
### 使用步骤
1. 引入依赖包

   ```xml
   <dependency>
   	<groupId>org.springframework.boot</groupId>
   	<artifactId>spring-boot-starter-test</artifactId>
   	<scope>test</scope>
   	<exclusions>
   		<exclusion>
   			<groupId>org.junit.vintage</groupId>
   			<artifactId>junit-vintage-engine</artifactId>
   		</exclusion>
   	</exclusions>
   </dependency>
   ```

   或者

   ```xml
   <dependency>
       <groupId>org.junit.platform</groupId>
       <artifactId>junit-platform-launcher</artifactId>
       <version>1.6.2</version>
       <scope>test</scope>
   </dependency>
   <dependency>
       <groupId>org.junit.jupiter</groupId>
       <artifactId>junit-jupiter-engine</artifactId>
       <version>5.6.2</version>
       <scope>test</scope>
   </dependency>
   <dependency>
       <groupId>org.junit.vintage</groupId>
       <artifactId>junit-vintage-engine</artifactId>
       <version>5.6.2</version>
       <scope>test</scope>
   </dependency>
   ```

2. 创建测试类

   参考`MyFirstJUnitJupiterTests.java`

3. 常用注解

   参考`MyFirstJUnitJupiterTests.java`注释

## 依赖关系
![](component-diagram.svg)