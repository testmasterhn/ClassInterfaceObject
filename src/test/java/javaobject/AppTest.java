package javaobject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;
import javaobject.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void Text_WebElement() {
		String[] arrTags = { "p", "a", "span", "button", "input", "table", "td", "tr" };

		ArrayList<WebElement> arrElement = new ArrayList<WebElement>();
		Random rd = new Random();
		// Sinh ngau nhien 10 phan tu cua web Element
		for (int i = 0; i < 10; i++) {
			WebElement el = new WebElement();
			// Get random tag
			int randomIndex = rd.nextInt(arrTags.length);
			el.Tag = arrTags[randomIndex];
			// el.Text= "";
			// Add to array
			arrElement.add(el);
		}

		// Count
		int totalButton = 0, totalSpan = 0, totalP = 0;
		for (WebElement el : arrElement) {
			if (el.Tag.equalsIgnoreCase("p")) {
				totalP++;
			} else if (el.Tag.equalsIgnoreCase("span")) {
				totalSpan++;
			} else if (el.Tag.equalsIgnoreCase("button")) {
				totalButton++;
			}
		}

		// Print to check
		System.out.println("Co " + totalButton + " buttons, " + totalSpan + " span, va " + totalP + "P");
		
		
		for (WebElement el : arrElement) {
			if (el.GetText().contains("Việt Nam vô địch")) {
				System.out.println("Found \"Viet Nam Vo Dich\"");
			}
		}
		
	}
	
	@Test
	public void Test_WebEelemnt_Array()
	{
		String[] arrTags = { "p", "a", "span", "button", "input", "table", "td", "tr" };
		WebElement[] arrElements = new WebElement[10];
		Random rd = new Random();
		// Sinh ngau nhien 10 phan tu cua web Element
		for (int i = 0; i < 10; i++) {
			WebElement el = new WebElement();
			// Get random tag
			int randomIndex = rd.nextInt(arrTags.length);
			el.Tag = arrTags[randomIndex];
			// el.Text= "";
			// Add to array
			arrElements[i]=el;
		}
	}
}
