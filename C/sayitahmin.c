#include <stdio.h>
#include <stdlib.h>

int random_sayi_uret(){
    srand(time(NULL));
    int sayi,bas1=0,bas2=0,bas3=0,bas4=0;
    int basamaklar_ayni=1;
    while(basamaklar_ayni){
        bas1=(rand()%9)+1;//binler basamagi oldugu icin 0 yok
        bas2=rand()%10;//0-9 arasi rakam
        bas3=rand()%10;
        bas4=rand()%10;
        sayi=(1000*bas1)+(100*bas2)+(10*bas3)+bas4;
        //sayinin 4 basamaginin farkli olup olmadigini kontrol ediyoruz.
        if(bas1!=bas2 && bas1!=bas3 && bas1!=bas4 && bas2!=bas3 && bas2!=bas4 && bas3!=bas4){
            basamaklar_ayni=0;//eger sayinin 4 basamagi farkli ise while(0) olacak ve while dongusu bitecek
        }
    }
    return sayi;
}

void kontrol(int belirli,int tahmn){
    int belirli_bas[4];
    int tahmn_bas[4];
    //sayilarin basamaklarini daha rahat karsilastirabilmek icin basamaklarini ayri ayri iki diziye kaydediyorum.
    belirli_bas[0]=belirli/1000;//binler bas
    belirli_bas[1]=(belirli%1000)/100;//yuzler
    belirli_bas[2]=(belirli%100)/10;//onlar
    belirli_bas[3]=belirli%10;//birler
    tahmn_bas[0]=tahmn/1000;//binler bas
    tahmn_bas[1]=(tahmn%1000)/100;//yuzler
    tahmn_bas[2]=(tahmn%100)/10;//onlar
    tahmn_bas[3]=tahmn%10;//birler
    //tahminlerin yerinin dogru olup olmadigini anlamak icin bu islemleri yapiyorum
    int dogru_yer=0;
    int yanlis_yer=0;
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(belirli_bas[i]==tahmn_bas[j] && i==j){//yerleri ayni dogru tahmin var mi onu kontrol ettiriyorum eger varsa dogru_yer degiskenini arttiriyorum
                dogru_yer++;
            }
            else if(belirli_bas[i]==tahmn_bas[j] && i!=j){//yerleri farkli dogru tahmin var mi kontrol ettiriyorum eger varsa yanlis_yer degiskenini arttiriyorum
                yanlis_yer++;
            }
        }
    }

    //yazdirma kısmı
    //sadece dogru yerler varsa yani sadece + yazdıracagim kisim
    if(dogru_yer>0 && yanlis_yer==0){
        printf("+%d\n",dogru_yer);
    }
    //sadece yanlis yerler varsa yani - yazdiracagim kisim
    if(yanlis_yer>0 && dogru_yer==0){
        printf("-%d\n",yanlis_yer);
    }
    //hem dogru hem yanlis yer varsa yazdiracagim kisim
    if(dogru_yer>0 && yanlis_yer>0){
        printf("+%d -%d\n",dogru_yer,yanlis_yer);
    }
    //eger hic dogru yoksa
    if(dogru_yer==0 && yanlis_yer==0){
        printf("Hic dogru tahmin yok\n");
    }
}

main(){

    int belirlenen_sayi=random_sayi_uret();
    int tahmin,hak=10;
    int input_4bas_mi=1;
    while(hak!=0){
            while(input_4bas_mi){//eger tahmin 4 basamakli degilse haklardan gitmeyecek
                    printf("tahmin edilen sayiyi giriniz: ");
                    scanf("%d",&tahmin);
                    if(tahmin>999 && tahmin<10000){
                        input_4bas_mi=0;//eger tahmin edilen sayi 4 basamaktan büyük ise while dongusu bitecek ve o deger tahmine atanacak
                    }
                    else{
                        printf("4 basamakli bir sayi giriniz.\n");//4 basamakli degilse uyari vecerek
                    }
            }
            if(tahmin==belirlenen_sayi){
                printf("tebrikler sayiyi buldunuz");
                return 0;
            }
            else{
                hak--;//tahminin 4 basamakli olmamasi durumunda haklarin gitmemesi icin hak degiskenini burda azalattim
                printf("hak:%d\n",hak);//kac hak kaldigini gosteren kod
                kontrol(belirlenen_sayi,tahmin);
                input_4bas_mi=1;//boylece tekrar input aldigimiz while içerisine girebilecek
            }
    }
    if(hak==0){
        printf("Haklariniz bitti.Sayi=%d",belirlenen_sayi);
    }



}
