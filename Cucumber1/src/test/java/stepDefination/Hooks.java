package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before("@web_test")
public void  before_method() {
	System.out.println("before method");
	
}
@After("@web_test")
public void after_method() {
	System.out.println("after method");}
}
