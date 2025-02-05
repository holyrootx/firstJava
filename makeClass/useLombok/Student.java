package makeClass.useLombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
@RequiredArgsConstructor
public class Student {
	final int x;
	final int y;
	private String name;
	private int age;
	private int grade;
	private int classNum;
	private int num;
	
}
