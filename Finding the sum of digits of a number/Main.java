#include <stdio.h>
int main() {
	//Type your code
   int n,sum=0;
  scanf("%d",&n);
  while(n>0)
  {
   int rem = n % 10;
    sum = sum + rem;
    n = n / 10;
  }
  printf("%d",sum);
	return 0;
}
