import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

//11.13ȥ���ظ�Ԫ��
public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		//����10������
		System.out.print("Enter 10 integers:");
		for(int i=0;i<10;i++) {
			list.add(input.nextInt());
		}
		//ȥ��
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
	    ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
		//���ȥ���ظ�����б�
		System.out.print("The distinct integers are :");
		for(int i=0;i<listWithoutDuplicates.size();i++) {
			System.out.print(listWithoutDuplicates.get(i)+" ");
		}
	}

}
