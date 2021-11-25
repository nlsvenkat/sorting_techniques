import java.util.Scanner;
public class insertion_sort{
    public static void main(String[] args){
        Scanner loki = new Scanner(System.in);
        System.out.print("Enter the no.of elements : ");
        int a=loki.nextInt(),temp;
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=loki.nextInt();
            
        }
        for(int i=1;i<a;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>arr[j-1]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=a-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
