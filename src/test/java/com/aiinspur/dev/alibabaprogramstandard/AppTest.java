package com.aiinspur.dev.alibabaprogramstandard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Integer v1 = 100;
        Integer v2 = 100;
        assertTrue( Objects.equals(v1,v2));

        Integer v3 = 1000;
        Integer v4 = 1000;
        assertTrue( Objects.equals(v3,v4));
        assertTrue(v3 == v4);
    }


    @Test
    public void forLoopTest(){
        String str = "start";
        for (int i = 0; i < 100; i++) {
            str = str + "hello"; }
    }


    @Test
    public void UserTest(){
        User user1 = new User();
        user1.setName("hello");

        User user2 = new User();
        user2.setName("hello");

        assertEquals(user1,user2);
        //assertTrue(Objects.equals(user1,user2));
        assertTrue(Objects.equals(user1.hashCode(),user2.hashCode()));
    }

    @Test
    public void arrayListTest(){
        String[] strings = new String[]{"hello","word"};
        List list = Arrays.asList(strings);
        // list.add("you");

        assertEquals("hello",strings[0]);
        strings[0] = "hello1";
        assertEquals("hello1",strings[0]);

    }
}
