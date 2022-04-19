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
	        Check phone = (String pattern, String iPhone, String mood) -> {try {
	            if (mood.equals("Happy")) {
	                if (Pattern.matches(pattern, iPhone))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }};
	        Check password = (String pattern, String iPassword, String mood) -> {try {
	            if (mood.equals("Happy")) {
	                if (Pattern.matches(pattern, iPassword))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new InvalidUserException1("Please enter proper message");
	        }};
	        firstName.check("^[A-Z]{1}[a-z]{3,}$","Nrupesh","HAPPY");
	        firstName.check("^[A-Z]{1}[a-z]{3,}$","Soni","HAPPY");
	        lastName.check("^[A-Z]{1}[a-z]{3,}$","Mhatre","Happy");
	        lastName.check("^[A-Z]{1}[a-z]{3,}$","Mhatre","Happy");
	        email.check("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","mhatre@gmail.com","Happy");
	        email.check("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","rabbu007#gmail.com","Happy");
	        phone.check("^[0-9]{2}[ ]?[0-9]{10}$","912345879621","Happy");
	        phone.check("^[0-9]{2}[ ]?[0-9]{10}$","919039165805","Happy");
	        password.check("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","nrupesh@","Happy");
	        password.check("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","rabba023","Happy");

	}
}