package useProperties;

import java.util.Enumeration;
import java.util.Properties;

public class UseProperties {

	public static void main(String[] args) {
		
		// Properties 
		// Properties�� key value ���������� String���� �޴´�.
		
		// ���������� �о�� ���� ������ �� ����Ѵٰ� �����.
		// FileInputStream
		// prop.load() ����Ͽ� InputStream���� �о�� ���������� ������ �����Ѵ�.
		// setProperty(key,value)�� �� ������ �� �ִ�.
		// getProperty(key)�� value�� �޾ƿ� �� �ִ�.
		Properties prop = new Properties();
		prop.setProperty("a", "1");
		prop.setProperty("b", "2");
		prop.setProperty("c", "3");
		prop.setProperty("d", "4");
		prop.setProperty("e", "5");
		
		System.out.println(prop.get("a")+"  "+prop.get("a").getClass());;
		
		// Properties�� Enumeration�� �ݺ��� ������ �Ѵ�.
		// 1. Properties��ü�� keys() �޼���� key ��������
		Enumeration en = prop.keys(); // ������ �����ϴ� ����
		
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			System.out.println(key + "   " + prop.getProperty(key));
		}
		
		// 2. Properties��ü�� PropertyNames() key ��������
		
		en = prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			System.out.println(key);
		}
		
		// 3. Proerties ��ü�� elements()��  Value��������
		// value�� �����´�.
		en = prop.elements();
		while(en.hasMoreElements()) {
			String value = (String)en.nextElement();
			System.out.println(value);
		}
	}

}
