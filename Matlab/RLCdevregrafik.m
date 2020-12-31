clear all
clc

t=0:0.1:10
R=10;C=0.1;L=0.5;
w0=10;

Fr= 1/(2*pi*(sqrt(L*C)))
w=2*pi*Fr
Vk=40*sin(w*t);

XC=1/(w*C);
XL=w*L;
X=j*(XL-XC);
Z=R+X;
I=Vk/Z;
Vr=I*R;
Vc=-j*I*XC;
Vl=j*I*XL;

plot(t,Vr,'g')
hold on
plot(t,Vc,'r')
hold on
plot(t,Vl,'b')
hold on 
plot(t,I,'c')