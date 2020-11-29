import java.util.ArrayList;
import java.util.Scanner;

//11.15 凸多边形面积
public class fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of points:");
		int n=input.nextInt();
		System.out.println("Enter the coordinates of the points:");
		ArrayList<Double> xlist=new ArrayList<>();
		ArrayList<Double> ylist=new ArrayList<>();
		for(int i=0;i<n;i++) {
			xlist.add(input.nextDouble());
			ylist.add(input.nextDouble());
		}
		xlist.add(xlist.get(0));
		ylist.add(ylist.get(0));
		double a=0,b=0,sum=0;
		for(int i=0;i<xlist.size()-1;i++) {
			a+=xlist.get(i)*ylist.get(i+1);
		}
		for(int i=0;i<ylist.size()-1;i++) {
			b+=xlist.get(i+1)*ylist.get(i);
		}
		sum=(a-b)/2;
		System.out.println(sum);
	}

}
