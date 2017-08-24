public class Multiplicar
{
    public static void main(String[] args)
    {
	String rs;
	int arg1;
	int arg2;
	int result;

	if(args.length == 2)
	    {
		arg1 = Integer.parseInt(args[0]);
		arg2 = Integer.parseInt(args[1]);
		result = arg1 * arg2;
		rs = Integer.toString(result);
		System.out.println("The product of " + args[0] +" and " + args[1] + " is " + rs);
	    }
	else
	    System.out.println("Uso: java Multiplicar n1 n2");
    }
}
