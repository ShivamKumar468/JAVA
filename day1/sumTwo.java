/*public class sumTwo {
    public static void main(String[] args) {
        int a=10, b=15;
        System.out.println("Sum of two: " +a+b);
    }             // here in java it will add a+b like string it will act 
                // as string because " " it befor a+b so sting will add to a first (string+a)
                // then string+a+b so this all is string 
                // we can print using (a+b)BOADMAS to add integer value after string
    
}
  */


public class sumTwo {
    public static void main(String[] args) {
        int a=10, b=15;
        System.out.println("Sum of two: " +(+a+b));
        System.out.println(a+b+ " Sum of two: " );  //but we can add like this
    }
}
