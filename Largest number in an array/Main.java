#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int max;
  for(i=0;i<n;i++)
  {
    if(arr[i]>max)
    {
      max=arr[i];
    }
  }
  printf("%d",max);
  return 0;
}