class Sum

,

private int sum;

public int getSum() (
return sum;

)

public void setSum(int sum) (
this.sum = sum;
F
y

class Summation implements Runnable
private int upper;
private Sum sumvValue;

public Summation (int upper, Sum sumvalue) (
this upper = upper;
this.sumValue = sumValue;

)

public void run() (
int sum = 0;
for (int i = 0; à <= upper; is)
sum += i;
sumValue.setSum (sum) ;
)
F

public class Driver
t
public static void main(Stringl] args) (
if (args.length > 0) (
if (Integer .parseInt (args [0]) < 0)
System.err.printin(args [0] + " must be >= 0.");
else (
// create the object to be shared
Sum sumObject = new Sum();
int upper = Integer .parseInt (args [0]);
Thread thrd = new Thread (new Summation (upper, sumobject));
thrd.start ();
try [
thrd.join();
System.out .printin
("The sum of "+upper+" is "+sumObject .getSum());
) catch (Interruptedexception ie) ( )
)
)

else
System.err.printin("Usage: Summation <integer value>"); )