public class BitManu {
    public static void main(String args[]){

        //example of get bit
        System.out.println("We need to find the 3rd bit of 1010 i.e 10: ");
        System.out.println("The 3rd bit is 0");
        int b=10;
        int pos=3;
        int bitMask=1<<pos;
        if((bitMask&b)==0){
            System.out.println("The bit is zero; ");
        }else{
            System.out.println("The bit is one ");
        }
        //example of set bit
        //lets set bit no 2 from b
        int mas=1<<2;
        //new val
        int temp=mas|b;
        System.out.println(temp);
}
}
