#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j,count=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(count==0){
        printf("*");
        count=1;
      }
      else
      {
        printf("#");
        count=0;
      }
    }
    printf("\n");
  }
  	return 0;
}
