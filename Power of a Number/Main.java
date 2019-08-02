#include <stdio.h>
#include<math.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  if(b<0)
  {
    printf("Wrong input");
  }
  else
  {
    double p=pow(a,b);
    printf("%.0lf",p);
  }
  	//Your code here       
    return 0;
}