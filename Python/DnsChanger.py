import os
from colorama import Fore

OpenDns         = "208.67.222.222-208.67.220.220"
CloudflareDns   = "1.1.1.1-1.0.0.1"
GooglePublicDns = "8.8.8.8-8.8.4.4"
CommonSecureDns = "8.26.56.26-8.20.247.20"
Quad9Dns        = "9.9.9.9-149.112.112.112"
VerisignDns     = "64.6.64.6-64.6.65.6"


def DnsInfo():
    print(Fore.YELLOW + "Current dns configrations reading..")

    with open("/etc/resolv.conf","r") as file:
        resolvCONF = file.readlines()
        for i in resolvCONF:
            if i.startswith("nameserver"):
                print(Fore.YELLOW + "Current DNS conf. at /etc/resolv.conf->>",i[11:].replace("\n",""))
                file.close()
            else:
                pass
                #print(Fore.RED + "empty DNS data")
    return resolvCONF


def DnsChange(dns1,dns2):


    resolvCONF = DnsInfo()
    resolvPATH = "/etc/resolv.conf"
    print(Fore.YELLOW + "DNS changing to->>" + dns1 + " " + dns2)

    with open(resolvPATH,"w") as file:

        file.write("nameserver " + dns1 + "\n")
        file.write("nameserver " + dns2 + "\n")
        file.write("options edns0 trust-ad" + "\n")
        file.write("search domain.name" + "\n")

    DnsInfo()

while True:
    print(Fore.YELLOW + """
<<DNS Changer>>
1-OpenDns
2-Cloudflare Dns
3-Google Public Dns
4-Common Secure Dns
5-Quad9 Dns
6-Verisign Dns
""")
    try:
        a = int(input(Fore.YELLOW + "Please select DNS [1-6]>>"))
    except:
        print(Fore.RED + "<<only int>>")
    finally:

        if a == 1:
            DnsChange(OpenDns[:14],OpenDns[15:])
            break
        if a == 2:
            DnsChange(CloudflareDns[:7],CloudflareDns[8:])
            break
        if a == 3:
            DnsChange(GooglePublicDns[:7],GooglePublicDns[8:])
            break
        if a == 4:
            DnsChange(CommonSecureDns[:10],CommonSecureDns[11:])
            break
        if a == 5:
            DnsChange(Quad9Dns[:7],Quad9Dns[8:])
            break
        if a == 6:
            DnsChange(VerisignDns[:10],VerisignDns[11:])
            break
        else:
            print(Fore.RED + "<<invalid input>>")
