import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner loki = new Scanner(System.in);
        System.out.print("Enter the no.of elements : ");
        int a=loki.nextInt(),temp,k,l;
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=loki.nextInt();
            
        }
        for(int i=0;i<a;i++){
		k=arr[i];
		l=i;
            for(int j=i;j<a;j++){
                if(arr[j]<k){
		    k=arr[j];
                    l=j;
                }
            }
	    temp=arr[i];
	    arr[i]=arr[l]
	    arr[l]=temp;
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
