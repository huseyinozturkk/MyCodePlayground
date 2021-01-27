#!/bin/bash
echo "<<SMS-Bomber V2>>"
max=10
echo "Telefon numarasını başında + olmadan ülke koduyla giriniz>>"
read num
echo "Proxy kullanmak ister misiniz(kali-linux)(E/h)(Y/n)?"
read proxy
case "$proxy" in 
[Ee] | [Yy])
    echo "with proxy.."
    for i in $(seq 1 $max);
    do
    proxychains python3 bomber.py -num $num
    done
    ;;
[Hh] | [Nn])
    echo "without proxy.."
    for i in $(seq 1 $max);
    do
    python3 bomber.py -num $num
    done
    ;;
*)
    echo "Geçersiz giriş/Invalid input."
esac

    

