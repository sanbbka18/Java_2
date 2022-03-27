import java.util.Scanner; //connect the scanner

public class p23 {
static Scanner sc=new Scanner(System.in);
static int step=0;
//array input
public static void inArray(int [] arr){
    if(step!=arr.length){
        System.out.println("Введіть "+step+ " число: ");
        arr[step]=sc.nextInt();
        step++;
        inArray(arr);
    }
   step=0;
}

public static void outArrayFromLast(int[] arr){
    if(arr.length-step>0){
        System.out.print(arr[arr.length-++step]+" ");
        outArrayFromLast(arr);
    }
    System.out.println();
    step=0;
}
    public static void outArrayFromFirst(int[] arr){
        if(step<arr.length){
            System.out.print(arr[step]+" ");
            step++;
            outArrayFromFirst(arr);
        }
        System.out.println();
        step=0;
    }

public  static void main(String[]args){
    System.out.println("Введіть довжину масиву: ");
    int [] array=new int[sc.nextInt()];
     inArray(array);
    outArrayFromLast(array);
    outArrayFromFirst(array);
}
}
