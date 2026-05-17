import java.util.*;

class Matrix{
	public static void main(String arr[]){
	int a[][] = new int[20][20];
	int b[][] = new int[20][20];
	int sum[][] = new int[20][20];
	int r;
	int c;
	Scanner sc = new Scanner(System.in);	

	System.out.println("enter matrix row");
	r=sc.nextInt();
	System.out.println("enter matrix column");
	c=sc.nextInt();
	
	System.out.println("enter first matrix");
	for(int i = 0; i<r;i++){
		for(int j = 0;j<c;j++){
			a[i][j]=sc.nextInt();
	}
	}
	System.out.println("enter second matrix");
	for(int i = 0; i<r;i++){
		for(int j = 0;j<c;j++){
			b[i][j]=sc.nextInt();
	}
	}
	for(int i = 0; i<r;i++){
		for(int j = 0;j<c;j++){
			sum[i][j]= a[i][j] + b[i][j];
}
}	
	System.out.println("sum:");
		for(int i = 0; i<r;i++){
		for(int j = 0;j<c;j++){
			System.out.print(sum[i][j] + " ");
}
	System.out.println( );
}
	
}
}
