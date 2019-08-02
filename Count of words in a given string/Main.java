#include<stdio.h>
#include<string.h>

int main()
{
  char a[100];
    scanf("%[^\n]s", a);
  int len=strlen(a);
  int word=1;
  for(int i=0;i<len;i++)
  {
    if(a[i]==' ')
      word=word+1;
  }

  printf("%d",word);
  return 0;
  //Type your code here
  
}