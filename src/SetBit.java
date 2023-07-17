import java.util.*;

class Solution
{
    public void setbit(int a,int b)
    {
        int solution = 0;
        solution= solution|(1<<a);
        solution = solution|(1<<b);
        System.out.println(solution);
    }
}

class SetBit
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        Solution solution =new Solution();
        solution.setbit(a,b);
    }
}
