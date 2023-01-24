class Solution {
    public List<String> fizzBuzz(int n) {
        String arr[] = new String[n];
        arr = fb(n);
        List<String> l = new ArrayList<>();
        for(String s: arr)
        {
            l.add(s);
        }
        return(l);
    }
    String[] fb(int n)
    {
        String arr[] = new String[n];
        for(int i=0; i<n; i++)
        {
            if((i+1)%3==0 && (i+1)%5==0)
            {
                arr[i]="FizzBuzz";
            }
            else if((i+1)%3==0)
            {
                arr[i]="Fizz";
            }
            else if((i+1)%5==0)
            {
                arr[i]="Buzz";
            }
            else
            {
                arr[i]=Integer.toString(i+1);
            }
        }
        return(arr);
    }
}
