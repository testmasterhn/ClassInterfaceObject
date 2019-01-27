package interfacesample;

public class TextBox implements WebElement {

	public String ElementType;
	
	public String GetElement()
	{
		return "TextBox";
	}
	
	public String GetText() {
		return this.Value.toString();
	}

	public boolean IsChecked() {
		return false;
	}

}
