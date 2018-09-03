package service;

import com.aop.LogInterceptor;
import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;
import com.service.UserService;
import com.spring.BeanFactory;
import com.spring.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.lang.reflect.Proxy;

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
    BeanFactory factory = new ClassPathXmlApplicationContext();
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

@Test
    public void testProxy() {
    UserDAO userDAO = new UserDAOImpl();
    LogInterceptor logInterceptor = new LogInterceptor();
    logInterceptor.setTarget(userDAO);
    UserDAO userDAOProxy = (UserDAO)Proxy.newProxyInstance(userDAO.getClass().getClassLoader(),new Class[]{UserDAO.class},logInterceptor);
    userDAOProxy.delete();
    userDAOProxy.save(new User());
}


} 
