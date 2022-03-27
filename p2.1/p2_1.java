public class p2_1 {
    public static void ex1(int x) {
        System.out.println("x="+x);
        if ( (2*x+1) <20) {
            ex1(2*x+1);
    }
    }

    public static void ex2(int x) {
        if ( (2*x+1) <20) {
            ex2(2*x+1);
    }
        System.out.println("x="+x);
    }

    private static int step=0;
    public static void ex3(int x) { space(); System.out.println(""+x+"-> "); step++;
        if ((2*x+1) <20) {
            ex3(2*x+1);
        }
        step--;
        space();
        System.out.println(""+x+ " <-");
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }

    public static int fact(int n){
        int result;
        if (n==1) return 1;
        else{
            result=fact(n-1)*n;
            return result;
        }
    }

    public static int f(int n){
        if (n==0){
        return 0;
    }else
    if (n==1){
        return 1;
    } else {

        System.out.println((n-2)+"  "+(n-1));
        return f(n-2)+f(n-1);
    }
    }

    public  static void main(String[]args){
        //output of results
        System.out.println("1 приклад використання рекурсії: ");
        ex1(1);
        System.out.println("2 приклад використання рекурсії: ");
        ex2(1);
        System.out.println("3 приклад використання рекурсії: ");
        ex3(1);
        System.out.println("4 приклад з використанням рекурсії для пошуку фібоначчі: ");
        int i=5;
        System.out.println("ми вводимо:"+i);
        System.out.println( f(i));
}
}