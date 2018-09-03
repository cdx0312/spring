package com.registration.service;

import com.registration.model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
* UserManager Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 24, 2017</pre> 
* @version 1.0 
*/ 
public class UserManagerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: exists(User user)
    *
    */
    @Test
    public void testExists() throws Exception {
        UserManager userManager = new UserManager();
        User user = new User("aa", "aa");
        boolean exists = userManager.exists(user);
        Assert.assertEquals(true, exists);
    }

    /**
    *
    * Method: add(User user)
    *
    */
    @Test
    public void testAdd() throws Exception {
        UserManager userManager = new UserManager();
        User user = new User("bb", "bb");
        boolean exists = userManager.exists(user);
        if (!exists) {
            userManager.add(user);
            boolean testAdd = userManager.exists(user);
            Assert.assertEquals(true, testAdd);
        } else {
            Assert.fail("not added");
        }
    }


} 
