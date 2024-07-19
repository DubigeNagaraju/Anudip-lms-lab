class GreatestNum
{
    public static void main(String[] args)
    {
        int k,l,m,n,o;
        k=19;
        l=21;
        m=17;
        n=27;
        o=53;
        if(k>l && k>m && k>n && k>o)
        {
            System.out.println("k is greater");
        }
        else if(l>m && l>n && l>o)
        {
            System.out.println("l is greater");
        }
        else if(m>n && m>o)
        {
            System.out.println("m is greater");
        }
        else if(n>o)
        {
            System.out.println("n is greater");
        }
        else
        {
            System.out.println("o is greater");
        }
    }
}