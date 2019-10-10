#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int f=n%10;
  while(n>10)
  {
    n=n/10;
  }
  int l=n;
  int sum=f+l;
  printf("%d",sum);
	return 0;
}