#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int first_digit=num/100;
  int last_digit=(num%100)%10;
int add=first_digit+last_digit;
  printf("%d",add);
  return 0;
}