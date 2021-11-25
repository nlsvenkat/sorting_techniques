import java.util.Scanner;
public class bubble_sort{
    public static void main(String[] args){
        Scanner loki = new Scanner(System.in);
        System.out.print("Enter the no.of elements : ");
        int a=loki.nextInt(),temp;
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=loki.nextInt();
            
        }
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-1;j++){
                temp=arr[j];
                if(arr[j+1]<arr[j]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
