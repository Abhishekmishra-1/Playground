#include <stdio.h>
int main() {
     int n,digit=0,sum=0;
     scanf("%d",&n);
  int temp=n;
     while(temp>0)
     {
       digit++;
       temp=temp/10;
     }
  int temp1=n;
  while(temp1>0)
  {
    int rem=temp1%10;
    sum=sum+pow(rem,digit);
      temp1=temp1/10;
  }
  if(n==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}