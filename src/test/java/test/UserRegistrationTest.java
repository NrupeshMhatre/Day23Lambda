package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import practice.InvalidUserException;
import practice.UserRegistration;

class UserRegistrationTest {
	 UserRegistration userRegistration = new UserRegistration();
	    
	    @Test
	    public void firstNameTestShouldReturnTrue(){
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException.class);
	            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","Nrupesh","HAPPY");
	        } catch (InvalidUserException e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);
	    }
	    @Test
	    public void firstNameTestShouldReturnFalse(){
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException.class);
	            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","Rabbu","HAPPY");
	        } catch (InvalidUserException e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);
	}
}


