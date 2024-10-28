package com.example.dao;

import com.example.dao.DaoImpl;
import com.example.dao.IDao;

import org.junit.Assert;
import org.junit.Test;

public class DaoImplTest {

    @Test
    public void testGetValue() {
        IDao dao = new DaoImpl();
        double value = dao.getValue();
        Assert.assertEquals(100.0, value, 0);
    }
}