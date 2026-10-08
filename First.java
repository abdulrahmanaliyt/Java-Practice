import java.lang.*;
class First{
    public static void main(String []args)
    {
        boolean x = true;
        bl1:{
            bl2:{
                bl3:{
                    System.out.println("Block 3");
                    if(x) break bl2;
                }
                System.out.println("Block 2");                
            }
            System.out.println("Block 1");       
        }
        System.out.println("End of all block");    
    }
}