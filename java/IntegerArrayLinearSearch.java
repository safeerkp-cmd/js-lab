import java.util.*;

class Main{
public static void main(String arr []){
Scanner sc =new Scanner(System.in);
int key;

System.out.println("ENTER SIZE OF ARRAY:");
int n=sc.nextInt();
int a[]=new int [n];
int found=0;


System.out.println("ENTER NUMBERS TO ARRAY:");
	for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
}
	System.out.println("ENTER A KEY TO SEARCH:");
	key=sc.nextInt();

for(int j=0;j<n;j++){
	if(a[j]==key){

	found=1;
	break;
	}
}
	if(found==1){

	System.out.println("KEY VALUE IS HERE:" + key);
	

	}
	else{

		System.out.println("KEY VALUE IS NOT HERE:");
	}

}
}
