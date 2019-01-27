package javaobject;

public class WebElement {
	//Properties
	public String Text;
	public String Tag;
	
	//Constructor Methods
	public WebElement() {};
	public WebElement(String text, String tag)
	{
		this.Text = text;
		this.Tag = tag;
	}
	
	//Methods
	public void SetText(String text)
	{
		this.Text = text;
	}
	
	public String GetText()
	{
		return this.Text;
	}
}
