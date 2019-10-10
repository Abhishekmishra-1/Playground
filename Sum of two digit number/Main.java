#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int first=num/10;
  int last=num%10;
  int add=first+last;
  printf("%d",add);
  return 0;
}