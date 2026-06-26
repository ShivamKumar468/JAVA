public class TypeCasting {
    public static void main(String[] args) {
        long b= 128; 
        byte i= (byte)b;  //128- 127`
        //b=(byte)(b+2);
        System.out.println(b);
        System.out.println(b);
        System.out.println(i);
         System.out.println(i);

         char ch= 97;
         System.out.println(ch); // here we will get character value because type is 
     
         // type is character (according to ascii table)

         int num = 'a';
         System.out.println(num); // here we will get number of a in ascii table 
                                 // because type is integer
    }
    
}
 