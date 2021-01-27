"""
This application is for private or educational purposes only.
Do not use it on other people without their permission.
I do not accept responsibility for banned accounts or penalties of any kind caused by the use of this bots.
I would like to point out that using a bot violates the Terms and Conditions of Whatsapp.
By using the bot, you automatically accept that you yourself are criminally responsible for yourself and you are aware that it violates the guidelines.

This application needs chromedriver to start chrome.
You can download chromedriver from https://chromedriver.chromium.org/downloads.
Make sure after downloading it you add chromedriver to your PATH.

https://github.com/huseyinozturkk
"""


from selenium import webdriver
from time import sleep
import colorama
import random
import os



colors=['\033[1;31m','\033[1;32m','\033[1;33m','\033[1;34m','\033[1;35m','\033[1;36m']
W='\033[0m'

print(random.choice(colors))
print("Chrome starting..")
driver=webdriver.Chrome()

sleep(1)

def show_logo():
    print(random.choice(colors))
    print("""
    ░██╗░░░░░░░██╗██╗░░██╗░█████╗░████████╗░██████╗░█████╗░██████╗░██████╗░
    ░██║░░██╗░░██║██║░░██║██╔══██╗╚══██╔══╝██╔════╝██╔══██╗██╔══██╗██╔══██╗
    ░╚██╗████╗██╔╝███████║███████║░░░██║░░░╚█████╗░███████║██████╔╝██████╔╝
    ░░████╔═████║░██╔══██║██╔══██║░░░██║░░░░╚═══██╗██╔══██║██╔═══╝░██╔═══╝░
    ░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║░░░██║░░░██████╔╝██║░░██║██║░░░░░██║░░░░░
    ░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝░░░░░

   ░██████╗██████╗░░█████╗░███╗░░░███╗███╗░░░███╗███████╗██████╗░     ▄▄▀█▄───▄───────▄
   ██╔════╝██╔══██╗██╔══██╗████╗░████║████╗░████║██╔════╝██╔══██╗     ▀▀▀██──███─────███
   ╚█████╗░██████╔╝███████║██╔████╔██║██╔████╔██║█████╗░░██████╔╝     ░▄██▀░█████░░░█████
   ░╚═══██╗██╔═══╝░██╔══██║██║╚██╔╝██║██║╚██╔╝██║██╔══╝░░██╔══██╗      ███▀▄███░███░███░███░ ▄
   ██████╔╝██║░░░░░██║░░██║██║░╚═╝░██║██║░╚═╝░██║███████╗██║░░██║      ▀█████▀░░░▀███▀░░░▀██▀
   ╚═════╝░╚═╝░░░░░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚═╝

       Whatsapp Message Bot for Educational purposes *~*
       https://github.com/huseyinozturkk/Whatsapp-spammer


       This application is for private or educational purposes only.
       Do not use it on other people without their permission.
       I do not accept responsibility for banned accounts or penalties of any kind caused by the use of this bots.
       I would like to point out that using a bot violates the Terms and Conditions of Whatsapp.
       By using the bot, you automatically accept that you yourself are criminally responsible
       for yourself and you are aware that it violates the guidelines.
    """)





def web_init():
    global driver
    driver.get("https://web.whatsapp.com")
    input("After QR Code press Enter >>")

def clr():
    if os.name == 'nt':
        os.system('cls')
    else:
        os.system('clear')
clr()

# target
def who():
    global name
    name=input("Spam to >>")
    sure=input("Are you sure?(Y/n) >>")
    while True:
        if sure.lower()=="y":
            while True:
                if name[0] == " " or name[len(name)-1] == " ":
                    print("Target name can't include blank characters at the beginning or at the end.")
                    name=input("Spam to >>")
                    sure=input("Are you sure?(Y/n) >>")
                else:
                    break
            break
        elif sure.lower()=="n":
            name=input("Spam to >>")
            sure=input("Are you sure?(Y/n) >>")
        else:
            sure=input("Invalid input.Are you sure?(Y/N) >>")

def is_empty(message):
    a=0
    for i in message:
        if i==" ":
            a+=1
    if a==len(message):
        return True
    else:
        return False


# message type
def text_message():
    global message
    sure=None
    message=input("Message >>")
    sure=input("Are you sure?(Y/n) >>")
    while True:
        if not is_empty(message):
            while True:
                if sure.lower()=="y" and not is_empty(message):
                    break
                elif sure.lower()=="n":
                    message=input("New Message >>")
                    sure=input("Are you sure?(Y/n) >>")
                else:
                    sure=input("Invalid input.Are you sure?(Y/n) >>")
            break
        elif sure.lower()=="n":
            message=input("New Message >>")
            sure=input("Are you sure?(Y/n) >>")
        elif is_empty(message) and sure.lower()=="y":
            message=input("Message can't include empty characters.New Message >>")
            sure=input("Are you sure?(Y/n) >>")
        elif sure.lower()!="y" or sure.lower()!="n":
            sure=input("Invalid input.Are you sure?(Y/n) >>")

# message type
def attachment_message():
    global filepath
    sure=None
    while True:
        filepath=input("Path of your attachment >>")
        sure=input("Are you sure?(Y/n) >>")
        if sure.lower()=="y":
            break
        elif sure.lower()=="n":
            message=input("New path >>")
            sure=input("Are you sure?(Y/N) >>")
        else:
            sure=input("Invalid input.Are you sure?(Y/N) >>")

# to search for find_target
def search_for_target():
    search_box = driver.find_element_by_xpath('//div[@class="_2S1VP copyable-text selectable-text"]')
    search_box.send_keys(name)
    sleep(0.1)

# to click to the target
def find_target():
    try:
        user = driver.find_element_by_xpath('//span[@title="{}"]'.format(name))
        user.click()
        sleep(0.1)
    except:
        print("{} not found.".format(name))

# to send text messages
def send_text_to_target():
    try:
        msg_box = driver.find_element_by_class_name('_2WovP')
        msg_box.send_keys(message)
        button = driver.find_element_by_xpath('//span[@data-icon="send"]')
        button.click()
    except:
        print("An error occured while sending message.")


# to send images and videos
def send_image_to_target():
    try:
        attachment_box = driver.find_element_by_xpath('//span[@data-icon = "clip"]')
        attachment_box.click()
        sleep(0.5)
        image_box = driver.find_element_by_xpath('//input[@accept="image/*,video/mp4,video/3gpp,video/quicktime"]')
        image_box.send_keys(filepath)
        sleep(2)#daha da kısaltılabilir.
        send_button = driver.find_element_by_xpath('//span[@data-icon="send-light"]')
        send_button.click()
    except:
        print("An error occured while sending image/video.")


# docs and sounds
#bu fonksiyonla resimde atılabilir ama chatte resim önizlenmez
def send_doc_to_taget():
    try:
        attachment_box = driver.find_element_by_xpath('//span[@data-icon = "clip"]')
        attachment_box.click()
        sleep(0.5)
        docs_box = driver.find_element_by_xpath('//input[@accept="*"]')
        docs_box.send_keys(filepath)
        sleep(2)#ayarlanabilir
        send_button = driver.find_element_by_xpath('//span[@data-icon="send-light"]')
        send_button.click()
    except:
        print("An error occured while sending document.")



def clear_search():
    try:
        clear_button=driver.find_element_by_xpath('//span[@data-icon="x-alt"]')
        clear_button.click()
    except:
        print("An error occured while removing last search.")

# Main
show_logo()
web_init()
while True:
    print(random.choice(colors))
    flg=input("Press q to quit or to continue press something else >>")
    if flg.lower() != "q":
        who()
        val=input("Send Text or Other ?(T/O) >>")
        while True:

            if val.lower() == "t":
                print(random.choice(colors))
                try:
                    text_message()
                    count=int(input("how many times do you want to sent message >>"))
                    search_for_target()
                    find_target()
                    clear_search()
                    for i in range(count):
                         send_text_to_target()
                except:
                    print("An error occured.")
                finally:
                    print("{} messages sent to {}".format(count,name))
                    sleep(2)
                    clr()
                    break
            if val.lower() == "o":
                print(random.choice(colors))
                val1=input("V-video and images ,D-documents and sounds >>")
                while True:

                    if val1.lower()=="v":
                        print(random.choice(colors))
                        try:
                            attachment_message()
                            count=int(input("how many times do you want to sent message >>"))
                            search_for_target()
                            find_target()
                            clear_search()
                            for i in range(count):
                                send_image_to_target()
                            print("<<image sent by {} times>>".format(count))
                        except:
                            print("An error occured.")
                        finally:
                            break
                    elif val1.lower()=="d":
                        print(random.choice(colors))
                        try:
                            attachment_message()
                            count=int(input("how many times do you want to sent message >>"))
                            search_for_target()
                            find_target()
                            clear_search()
                            for i in range(count):
                                send_doc_to_taget()
                            print("<<doc at {} sent by {} times>>".format(filepath,count))
                        except:
                            print("An error occured.")
                        finally:
                            sleep(2)
                            clr()
                            break


                        break
                    else:
                        print(random.choice(colors))
                        print("Invalid input.(V/D)")
                        val1=input("v-video and images ,D-documents and sounds >>")
                break
            else:
                val=input("Invalid input.Text or Other?(T/O) >>")


    else:
        print(random.choice(colors))
        clr()
        show_logo()
        sleep(3)
        break
