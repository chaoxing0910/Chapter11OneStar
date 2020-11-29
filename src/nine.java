import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//11.9最大的行和列
public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the array size n:");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		ArrayList<Integer> row=new ArrayList<>();
		ArrayList<Integer> column=new ArrayList<>();
		int [][] a =new int [n][n];
		
		//随机填入0或1
		System.out.println("The random array is:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=((int)(Math.random()*10))%2;
			}
		}
		
		//输出矩阵
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		//计算每行1的个数
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==1)
					sum+=1;
			}
			row.add(sum);
			sum=0;
		}
		//寻找哪一行1最多并输出下标
		int rowMax = Collections.max(row);
		System.out.print("The largest row index:");
		for(int i=0;i<row.size();i++) {
			if(row.get(i)==rowMax)
				System.out.print(i+" ");
		}
		System.out.println(" ");
		//计算每列1的个数
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[j][i]==1)
					sum+=1;
			}
			column.add(sum);
			sum=0;
		}
		//寻找哪一列1最多并输出下标
		int columnMax = Collections.max(column);
		System.out.print("The largest column index:");
		for(int i=0;i<column.size();i++) {
			if(column.get(i)==columnMax)
				System.out.print(i+" ");
		}

	}

}
