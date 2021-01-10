#include<stdio.h>
int main(int argc, char const *argv[])
{
    int sinir,i,say=0,z=0;
    printf("yazdıracağınız sayılar kaça kadar olsun?  ");
    scanf("%d",&sinir);
   while(sinir<2){printf("2den büyük bir değer giriniz.  ");scanf("%d",&sinir);}//girilen 2den küçük olunca yeniden girilmesini istiyoruz
    for (i = 2; i <= sinir; i++)//2 den itibaren sayıyı arttırıyoruz
    {
      for(z=2;z<i;z++){//2 den itibaren arttırdığımız sayıyı yine 2 den kendisine kadar olan sayılara göre modunu alarak tam bölünüp bölünmediği var mı kontrol ediyoruz.
         if(i%z==0){//tam bölünürse değişkeni yükseltiyoruz ki döngü dışında asal sayı olmadığı için yazdırmayalım
             say++;//eğer i sayısı z ye hiç tam bölünmezse say=0 kalacak ve böylece asal sayı olduğu anlaşılacak
            }
        }  
    if(say==0)printf("\nasal  %d",i);//say=0 ise o anki i değerini yazdırıyoruz.
    //if(say!=0)printf("\nasal degıl  %d",i);//Asal olmayan sayılarında gösterilmesi için ek blok
    say=0;// yukarıdaki for loopta say artmış olabilir bundan dolayı say'ı tekrar 0 a eşitliyoruz.

    }
    return 0;
}
