public class xxYOLO420xx{
public static void main(String[] args){
int[] xXx = {5, 3, 8, 4, 2};
sortem(xXx);
for(int i=0;i<xXx.length;i++)System.out.print(xXx[i]+" ");
}

public static void sortem(int[] banana)
{
for(int i=0;i<=banana.length;i++)
{
for(int j=0;j<banana.length-i;j++)
{
if(banana[j+1]<banana[j])
{
int lol=banana[j];
banana[j]=banana[j+1];
banana[j+1]=lol;
}
}
}
}
