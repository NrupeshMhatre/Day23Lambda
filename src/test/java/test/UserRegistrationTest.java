package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import practice.InvalidUserException1;
import practice.UserRegistration;

class UserRegistrationTest {
	 UserRegistration userRegistration = new UserRegistration();
	    
	    @Test
	    public void firstNameTestShouldReturnTrue(){
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","Nrupesh","HAPPY");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);
	    }
	    @Test
	    public void firstNameTestShouldReturnFalse(){
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","Rabbu","HAPPY");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);
	}
	    @Test
	    public void lastNameTestShouldReturnTrue() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$","Yeggewar","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertTrue(result);
	    }
	    @Test
	    public void lastNameTestShouldReturnFalse() {
	        boolean result = false;
	        try {
	            ExpectedException expectedException = ExpectedException.none();
	            expectedException.expect(InvalidUserException1.class);
	            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$","kv","Happy");
	        } catch (InvalidUserException1 e) {
	            e.printStackTrace();
	        }
	        assertFalse(result);
	    }
}


