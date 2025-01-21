import java.util.Scanner;

class example{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


System.out.println("enter the size of the array");
int n = scanner.nextInt();
System.out.println(n);
    int [] arr = new int[n];
    System.out.println("enter the elements of the array");
    for(int j =0;j<n;j++){
        System.out.println("elements of the array Before Reading"+arr[j]);
    }
    int i;
    for( i = 0; i < n; i++){
        arr[i] = scanner.nextInt();

    for(int j =0;j<n;j++){
        System.out.println("elements of the array after Reading "+arr[j]);
    }
   
}
}
}