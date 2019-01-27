package intefaceExample;

public class Regtangle implements Sharp {
	public int canh1; 
	public int canh2;
	
	public int GetChuVi() {
		return (canh1+ canh2)*2;
	}

	public int GetArea() {
		return canh1*canh2;
	}
	
	public int GetSharp()
	{
		return 0;
	}
}
