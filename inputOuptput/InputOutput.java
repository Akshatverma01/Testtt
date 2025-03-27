// package inputOuptput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputOutput {
 
    public static void main(String[] args) throws IOException { 
        // Using scanner class for normal-inputs
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your number") ;
    //    int n= sc.nextInt();
    //     System.out.println("The number is:"+n);
    //     sc.close();

    // Usinf buffered class for larger inputs
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter your number") ;
    int n = Integer.parseInt(reader.readLine());
    System.out.println("The number is:"+n);

    // System.out.println("Enter your string:") ;
    // String s = reader.readLine();
    // System.out.println("The string is: "+s);


    // Input an array
    // int arr[]= new int[n];
    // System.out.println("Enter the elements of array");
    // for(int i=0;i<n;i++){
    //     arr[i]= Integer.parseInt(reader.readLine());
    // }

    // for(int i=0;i<n;i++){
    //     System.out.println(arr[i]+" ");
    // }

    

    
    }
}
