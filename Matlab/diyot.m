clc
clear all

Vt = 0.026; %V
Is = 1.0e-14; %sýzýntý akýmý
n=1.0;

vd_start = 0.5;
vd_stop = 0.8;
vd_step = 0.005;

Vd = vd_start : vd_step : vd_stop;
Id = Is * (exp(Vd/(n*Vt))-1);

plot (Vd,Id);
grid; 
xlabel(' Vd (mV)'); 
ylabel(' Id (A).');
