import java.util.Scanner; //connect the scanner

public class p22 {
static StringBuilder result=new StringBuilder(); //create a constructor
// /create a method
public static void meth(int i){
    if(i>1){
        result.append(i%2);
        meth(i/2);
    }else{
        result.append(i);
        System.out.println("результат дорівнює= "+result.reverse());
    }
}

public  static void main(String[]args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Введіть число, яке треба перевести в двійкову систему: ");
        int num=sc.nextInt();//assign num to our input number
        meth(num);//call the previously created method
    }
}
}
