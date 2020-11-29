import java.util.ArrayList;

//11.18 字符数组列表
public class eighteen {

	public static ArrayList<Character> toCharacterArray(String s) {
		// TODO Auto-generated method stub
		String str="abc";
		String[] array = str.split("");
		ArrayList<Character> list=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			char[] arr = array[i].toCharArray();
			char ch = arr[0];
			list.add(ch);
		}
		return list;
	}

}
