#include<stdio.h>
int isVowel(char x)
{
  if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
  {
    return 0;
  }
  else
  {
    return 1;
  }
}
  
int main()
{
  char str[100],i;
  scanf("%[^\n]s", str);
  for(i=0;str[i]!='\0';i++)
  {
    if(isVowel(str[i]))
    printf("%c",str[i]);
  }
  
  
  //Type your code here
  
  return 0;
}