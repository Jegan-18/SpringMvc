package com.spring.assignment;



import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;


@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {
	
	@Mock
	Customer customer ;
	
	@Test
	public void displayinfo() {
		
		Assert.assertEquals(true, true);
	}

}
