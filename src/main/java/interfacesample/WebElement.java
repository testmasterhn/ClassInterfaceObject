package interfacesample;

public interface WebElement {
/*
 * String ElementType - Quy định Kiểu của WebELement
- Object Value - Giá trị của Element
- GetText() - Trả ra text trên Element tương ứng.
- IsChecked() - Trả ra trạng thái của Element dựa trên Object Value.
 */
	public Object Value=null;
	
	public String GetElement();
	
	public String GetText();
	
	public boolean IsChecked();
	
	/*Notes:
	 * Interface dùng để khai báo
	 * Khởi tạo thì phải dùng Class
	 */
	
	
}
