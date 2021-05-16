import threading


def deneme():
    #while 1:
    print("hello")


threads = []

for i in range(50):
    t = threading.Thread(target=deneme)
    t.daemon = True
    threads.append(t)


for i in range(50):
    threads[i].start()

for i in range(50):
    threads[i].join()
