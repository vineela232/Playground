#include <stdio.h>
int main() {
  int i,sum;
  sum=0;
  scanf("%d",&i);
  while(i!=0)
  {
    sum=sum+i%10;
    i=i/10;
   
  }
printf("%d",sum);
	//Type your code
	return 0;
}