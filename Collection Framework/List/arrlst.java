import java.util.ArrayList;

public class arrlst
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(20);

        System.out.println(nums.get(2));
        nums.remove(3);
        System.out.println(nums.size());

        nums.set(1, 40);

        System.out.println(nums.get(1));


        System.out.println(nums.contains(50));
    }
}