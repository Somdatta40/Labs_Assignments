public class AbundantDeficientPerfect {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int i;
  for(i=1;i<100;i++)
  {
   if(i==1)
    System.out.println("1 is neither perfect nor abundant nor deficient");
   else
   {
    int sum=0;
    for(int j=1;j<i;j++)
    {
    if(i%j==0)
    sum+=j;
    }
    if(sum==i)
    System.out.println(i+" is a Perfect number \n");
    else if(sum<i)
    System.out.println(i+" is a Deficient number \n");
    else
    System.out.println(i+" is an Abundant number \n");
   }
   
  }
 }

}
