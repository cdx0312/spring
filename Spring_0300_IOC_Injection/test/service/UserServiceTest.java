package service;

import com.dao.UserDAO;
import com.model.User;
import com.service.UserService;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* UserService Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 11, 2017</pre> 
* @version 1.0 
*/ 
public class UserServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUserDAO() 
* 
*/ 
@Test
public void testGetUserDAO() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setUserDAO(UserDAO userDAO) 
* 
*/ 
@Test
public void testSetUserDAO() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addUser(User user) 
* 
*/ 
@Test
public void testAddUser() throws Exception {
      ApplicationContext factory = new ClassPathXmlApplicationContext("spring-config.xml");
//    自动创建实例
//    UserService userService = new UserService();
//    UserDAO userDAO = (UserDAO) factory.getBean("u");
//    userService.setUserDAO(userDAO);
//    User user = new User();
//    userService.addUser(user);

//    自动装配
    UserService userService = (UserService) factory.getBean("userService");
    User user = new User();
    user.setUsername("zhangsan");
    user.setPassword("sss");
    userService.addUser(user);
} 


} 
