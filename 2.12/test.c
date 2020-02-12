#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a[]={1,2,3,4,5,6,7,8,9};
	int i;
	for(i=0;i<10;i++){
		if(i==3)
			continue;
		printf("%d\n",a[i]);
	}
	return 0;
}
