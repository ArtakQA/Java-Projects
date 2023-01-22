class COrderInit
{
    int a = InitMethod("a = ");
    COrderInit()
    {
        a = b = c = 10;
        System.out.println("Constructor COrderInit().");
    }

    int c = InitMethod("c = ");
    int InitMethod(String s)
    {
        System.out.println(s + "InitMethod().");
        return 100;
    }

    int b = InitMethod("b = ");
    

    public static void main(String[] args)
    {
        COrderInit obj = new COrderInit();
    }
}
