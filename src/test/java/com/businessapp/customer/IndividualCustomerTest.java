package com.businessapp.customer;

import com.businessapp.model.IndividualCustomer;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class IndividualCustomerTest {
    IndividualCustomer individualCustomer;

    String firstName;
    String lastName;
    String id;
    Date created;

    @Before
    public void setUp() throws Exception {
        individualCustomer = new IndividualCustomer();
    }

    @Test
    public void testFirstName() throws Exception {
        firstName = "firstName";
        individualCustomer.setFirstName((firstName));
        assertEquals(individualCustomer.getFirstName(),firstName);

        firstName = null;
        individualCustomer.setFirstName(firstName);
        assertEquals(individualCustomer.getFirstName(),firstName);

        firstName = "";
        individualCustomer.setFirstName(firstName);
        assertEquals(individualCustomer.getFirstName(),firstName);
    }

    /**
     * Test für den Nachnamen
     * @throws Exception
     */
    @Test
    public void testName() throws Exception {
        lastName = "lastName";
        individualCustomer.setName((lastName));
        assertEquals(individualCustomer.getName(),lastName);

        lastName = null;
        individualCustomer.setName((lastName));
        assertEquals(individualCustomer.getName(),lastName);

        lastName = "";
        individualCustomer.setName((lastName));
        assertEquals(individualCustomer.getName(),lastName);
    }

    @Test
    public void testId() throws Exception {
        id = "0001";
        individualCustomer.setId((id));
        assertEquals(individualCustomer.getId(),id);

        id = null;
        individualCustomer.setId((id));
        assertEquals(individualCustomer.getId(),id);

        id = "";
        individualCustomer.setId((id));
        assertEquals(individualCustomer.getId(),id);
        //assertThat(one.getId()==oneId, is (true));
    }

    @Test
    public void testCreated() throws Exception {
        created = new Date();
        individualCustomer.setCreated((created));
        assertEquals(individualCustomer.getCreated(),created);

        created = null;
        individualCustomer.setCreated((created));
        assertEquals(individualCustomer.getCreated(),created);
    }
}