package intarray;

public class IntArray {

    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
    static int counter = 0;
    static int[] arr = new int[5];
    
    public static void main(String[] args) {
        new IntArray().input().firstToLast().lastToFirst();
    }
    
    public IntArray input(){
        for(counter = 0; counter <= 4;counter++){
        System.out.print("Enter Integer Number On Index "+counter+": ");
        arr[counter] = sc.nextInt();
        }
        return this;
    }
    
    public IntArray firstToLast(){
        System.out.print("First to Last: ");
        for(counter = 0; counter <= 4;counter++){
            System.out.print(arr[counter]+" ");
        }
        return this;
    }
    
    public IntArray lastToFirst(){
        System.out.println("");
        System.out.print("Last to First: ");
        for(counter = 4; counter >= 0 ;counter--){
            System.out.print(arr[counter]+" ");
        }
        return this;
    }
}