package com.example.metier;

import com.example.dao.IDao;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MetierImplTest {

    @Test
    public void testCalcul() {
        // Create a mock IDao object
        IDao daoMock = Mockito.mock(IDao.class);
        Mockito.when(daoMock.getValue()).thenReturn(100.0);

        // Inject the mock into MetierImpl
        MetierImpl metier = new MetierImpl();
        metier.setDao(daoMock);

        double result = metier.calcul();
        Assert.assertEquals(200.0, result, 0);
    }
}
