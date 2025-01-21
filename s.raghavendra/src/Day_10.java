public class Day_10 {
    public static void main(String[] args) {
        int[] num1={1,2,5,6,9,100};
        int[] num2={4,5,6,9,100};
        int[] merged = mergeArrays(num1, num1.length, num2, num2.length);
        for (int i : merged) {
            System.out.print(i + " ");
        }
    
}
public  static void mergeArrays(int[] num1,int a,int[] num2,int n ){
int[] newArr = new int[a+n];
int p1 = 0;
int p2 = 0;
int idx = 0;
while(p1 < a && p2 < n){
    if(num1[p1] <= num2[p2]){
        p1++;
        newArr[idx] = num1[p1];
    }else{
        newArr[idx] = num2[p2];
        p2++;
    }

idx++;

}
while(p1 < a){
    newArr[idx++] = num1[p1++];
}
while(p2 < n){
    newArr[idx++] = num2[p2++];
    
    idx++;
}
return newArr;
}
}

