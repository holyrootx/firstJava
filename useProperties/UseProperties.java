package useProperties;

import java.util.Enumeration;
import java.util.Properties;

public class UseProperties {

	public static void main(String[] args) {
		
		// Properties 
		// Properties도 key value 형태이지만 String으로 받는다.
		
		// 설정파일을 읽어와 값을 설정할 때 사용한다고 들었다.
		// FileInputStream
		// prop.load() 사용하여 InputStream으로 읽어와 설정파일의 값으로 설정한다.
		// setProperty(key,value)로 값 설정할 수 있다.
		// getProperty(key)로 value를 받아올 수 있다.
		Properties prop = new Properties();
		prop.setProperty("a", "1");
		prop.setProperty("b", "2");
		prop.setProperty("c", "3");
		prop.setProperty("d", "4");
		prop.setProperty("e", "5");
		
		System.out.println(prop.get("a")+"  "+prop.get("a").getClass());;
		
		// Properties는 Enumeration가 반복자 역할을 한다.
		// 1. Properties객체의 keys() 메서드로 key 가져오기
		Enumeration en = prop.keys(); // 순서를 보장하는 듯함
		
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			System.out.println(key + "   " + prop.getProperty(key));
		}
		
		// 2. Properties객체의 PropertyNames() key 가져오기
		
		en = prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			System.out.println(key);
		}
		
		// 3. Proerties 객체의 elements()로  Value가져오기
		// value로 가져온다.
		en = prop.elements();
		while(en.hasMoreElements()) {
			String value = (String)en.nextElement();
			System.out.println(value);
		}
	}

}
