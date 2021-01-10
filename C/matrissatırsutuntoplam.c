#include <stdio.h>
#include <stdlib.h>

int main()
{
    int matris[4][3]=
    {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {10,11,12}
    };

//MATRISI YAZDIRMA
    for(int i=0;i<=3;i++)
    {
        for(int j=0;j<=2;j++)
        {
            printf("%d.satir %d.sutun=%d\n",i+1,j+1,matris[i][j]);
        }
    }
//SUTUNLARI TOPLAMA

    int j;
    int top=0;
    printf("SUTUN TOPLAMI\n");
    for(int j=0;j<3;j++)
    {
         for(int i=0;i<4;i++)printf("Deneme%d\n",matris[i][j]);
              {
                  printf("%d\n",matris[i][j]);
                  top+=matris[i][j];
              }
     printf("%d.sutun toplami:%d\n",j+1,top);
     top=0;
    }
//SATIRLARI TOPLAMA

    printf("SATIR TOPLAMI\n");
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<3;j++)
        {
            printf("%d\n",matris[i][j]);
            top+=matris[i][j];
        }
    printf("%d.satir toplami:%d\n",i+1,top);
    top=0;
    }


    return 0;


}
