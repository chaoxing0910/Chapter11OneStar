import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

//11.13去掉重复元素
public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		//输入10个整数
		System.out.print("Enter 10 integers:");
		for(int i=0;i<10;i++) {
			list.add(input.nextInt());
		}
		//去重
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
	    ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
		//输出去掉重复后的列表
		System.out.print("The distinct integers are :");
		for(int i=0;i<listWithoutDuplicates.size();i++) {
			System.out.print(listWithoutDuplicates.get(i)+" ");
		}
	}

}
