#include<stdio.h>
int main()
{
  int num = 365,quotient,remainder;
  quotient = num/4;
  remainder = num%4;
  printf("Quotient: %d \n",quotient);
  printf("Remainder: %d",remainder);
  return 0;
}