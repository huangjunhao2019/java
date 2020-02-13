import java.util.*;
public class Sort{
    public static void main(String[] args){
        double[] list=new double[100];
        for(int i=0;i<list.length;i++)
            list[i]=Math.random();
        Arrays.sort(list);
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
    }
}
