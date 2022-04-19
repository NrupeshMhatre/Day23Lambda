package practice;

import java.util.regex.Pattern;

@FunctionalInterface
interface Check {
    boolean check(String a, String b, String c) throws InvalidUserException1;
}
public class UserRegistrationLambda {
	public static void main(String[] args) throws InvalidUserException1 {
		 Check firstName = (String pattern, String fname, String mood) -> {try {
	            if (mood.equals("HAPPY")) {
	                if (Pattern.matches(pattern, fname))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }};
	        
	        Check lastName = (String pattern, String lname, String mood) -> {try {
	            if (mood.equals("Happy")) {
	                if (Pattern.matches(pattern, lname))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }};
	        Check email = (String pattern, String iEmail, String mood) -> {try {
	            if (mood.equals("Happy")) {
	                if (Pattern.matches(pattern, iEmail))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }};
	}
}