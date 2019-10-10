#include <stdio.h>
int main() {
	
   int n,i,j,count=0;
  scanf("%d",&n);
  int val=n;
  for(i=1;i<=n;i++)
  {
    
    for(j=val;j>0;j--)
    {
      printf("%d",j);
    }
    printf("\n");
    val--;
    
  }
	return 0;
}
