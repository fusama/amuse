public class IsPowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(num==1 )
        {
        return true;
        }
        boolean flag=false;

        int power=1;
        while( num>power){
            power=power*4;
            if(power==num)
            {
                flag=true;
            }
        }
        return flag;
    }
}
