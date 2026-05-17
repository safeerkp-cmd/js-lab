import java.util.*;

class Matrix{
	public static void main(String arr[]){
	int a[][] = new int[20][20];
	int b[][] = new int[20][20];
	int mul[][] = new int[20][20];
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
		for(int k = 0;k<c;k++){
		mul[i][j] += a[i][k] * b[k][j];
}
}
}	
	System.out.println("After multiplication:");
		for(int i = 0; i<r;i++){
		for(int j = 0;j<c;j++){
			System.out.print(mul[i][j] + " ");
}
	System.out.println( );
}
	
}
}
