#include<stdio.h>
void main()
{
  int i,j,v,n=1,p,q,a,b;
  int visited[25]={0},min,mincost=0,g[25][25];
  	printf("\n\t Prim's algorithm\n");
  printf("\n Enter the number of vertices:");
  scanf("%d",&v);
  printf("\nEnter the adjacency matrix:\n");
  for(i=0;i<v;i++){
  	for(j=0;j<v;j++)
  	{
  		scanf("%d",&g[i][j]);
  		if(g[i][j]==0)
  		g[i][j]=999;
	  }
  }
  visited[1]=1;
  printf("\n");
  while(n<v)
  {
  	for(i=1,min=999;i<=v;i++)
  	for(j=1;j<=v;j++)
  	if(g[i][j]<min)
  	if(visited[i]!=0)
  	{
  		min=g[i][j];
  		a=p=i;
  		b=q=j;
	  }
	if(visited[p]==0|| visited[q]==0) 
	{
	  printf("\n Edge %d:(%d %d) cost:%d",n++,a,b,min);
	  mincost+=min;
	  visited[b]=1;	
	 } 
	 g[a][b]=g[b][a]=999;
  }
  printf("\n minimum cost=%d",mincost);
}
  
