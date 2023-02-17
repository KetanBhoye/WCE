public class Q7 {
    public static void main(String[] args) {

        int[] arr = {11,23,10,14,45,20};

        Boolean flag = false;
        int index =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==10 && arr[j]==20)
                {
                    flag = true;
                    index = j;
                }
            }
        }

        if(flag == true)
        {
            System.out.println("\nYES,Their is 20 present after 10 in array at index : "+index);
        }
        else
        {
            System.out.println("\nNO,Seaching unsuccessful");
        }

    }

}
