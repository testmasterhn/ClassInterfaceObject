package interfacesample;

public class CheckBox implements WebElement {

	public String ElementType = "CheckBox";

	public String GetElement()
	{
		return "CheckBox";
	}
	
	public String GetText() {
		return "";
	}

	public boolean IsChecked() {
		// TODO Auto-generated method stub
		return (boolean)this.Value;
	}

}
