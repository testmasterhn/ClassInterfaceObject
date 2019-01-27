package javaobject;

import interfacesample.WebElement;
import interfacesample.CheckBox;
import interfacesample.TextBox;
import org.junit.*;

public class Sample {
	WebElement tb;
	
	@Before
	public void Setup()
	{
		tb =new TextBox();
	}
	
	@Test
	public void Test()
	{
		System.out.println(tb.GetElement());
	}
	
}
