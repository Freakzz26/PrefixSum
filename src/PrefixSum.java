import java.util.Scanner;

public class PrefixSum {
    static int[] sum(int arr[],int n)
    {
        int add=0;
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {

            add=add+arr[i];
            result[i]=add;

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int result[]=sum(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(result[i]+" ");
        }

    }
}
