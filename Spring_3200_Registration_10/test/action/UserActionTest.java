package action;

import com.registration.action.UserAction;
import com.registration.dto.UserRegisterInfo;
import com.registration.model.User;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

/** 
* UserAction Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 26, 2017</pre> 
* @version 1.0 
*/ 
public class UserActionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUsername() 
* 
*/ 
@Test
public void testGetUsername() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setUsername(String username) 
* 
*/ 
@Test
public void testSetUsername() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getPassword() 
* 
*/ 
@Test
public void testGetPassword() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setPassword(String password) 
* 
*/ 
@Test
public void testSetPassword() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getPassword2() 
* 
*/ 
@Test
public void testGetPassword2() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setPassword2(String password2) 
* 
*/ 
@Test
public void testSetPassword2() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getUserManager() 
* 
*/ 
@Test
public void testGetUserManager() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setUserManager(UserManager userManager) 
* 
*/ 
@Test
public void testSetUserManager() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: execute() 
* 
*/ 
@Test
public void testExecute() throws Exception {
    UserAction userAction = new UserAction();
    UserRegisterInfo info = new UserRegisterInfo();
    info.setUsername("ghg");
    info.setPassword("ghj");
    userAction.setInfo(info);
    java.lang.String ret = userAction.execute();
    Assert.assertEquals("success", ret);
} 

@Test
    public void testList() throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    UserAction userAction = (UserAction)ctx.getBean("user");
    userAction.list();
    Assert.assertTrue(userAction.getUsers().size() > 0);
}

@Test
public void testLoad() throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    UserAction userAction = (UserAction)ctx.getBean("user");

    UserRegisterInfo info = new UserRegisterInfo();
    info.setId(1);
    userAction.load();
    System.out.println(userAction.getUser().getClass());
    Assert.assertTrue(userAction.getUser() != null);
}

} 
