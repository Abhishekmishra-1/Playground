#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int second_last =(num%100)/10;
  printf("%d",second_last);
  return 0;
}