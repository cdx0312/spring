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
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    UserService userService = (UserService) ctx.getBean("userService");
    userService.addUser(new User());
} 


} 
