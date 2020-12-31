tablo = ["-", "-", "-",
         "-", "-", "-",
         "-", "-", "-"]

oyun_durumu = True
kazanan = None
suanki_oyuncu = "X"


def tablo_goster():
    print("""
       {}   |  {}  |  {}
      ----------------
       {}   |  {}  |  {}
      ----------------
       {}   |  {}  |  {}

    """.format(tablo[0],tablo[1],tablo[2],tablo[3],tablo[4],tablo[5],tablo[6],tablo[7],tablo[8]))

def oyun_devam(player):
    print(player + "'in sırası.")
    pozisyon = input("1-9 arası yer seçin: ")

    valid = False
    while not valid:
        while pozisyon not in ["1", "2", "3", "4", "5", "6", "7", "8", "9"]:
            pozisyon = input("Yanlış giriş.1-9 arası yer seçin: ")
        pozisyon = int(pozisyon) - 1
        if tablo[pozisyon] == "-":
            valid = True
        else:
            print("Dolu bir yere işaretleme yapamazsın.")

    tablo[pozisyon] = player
    tablo_goster()


def row_kontrol():
    global oyun_durumu

    row_1 = tablo[0] == tablo[1] == tablo[2] != "-"
    row_2 = tablo[3] == tablo[4] == tablo[5] != "-"
    row_3 = tablo[6] == tablo[7] == tablo[8] != "-"
    if row_1 or row_2 or row_3:
        oyun_durumu = False
    if row_1:
        return tablo[0]
    elif row_2:
        return tablo[3]
    elif row_3:
        return tablo[6]

    return


def column_kontrol():
    global oyun_durumu

    column_1 = tablo[0] == tablo[3] == tablo[6] != "-"
    column_2 = tablo[1] == tablo[4] == tablo[7] != "-"
    column_3 = tablo[2] == tablo[5] == tablo[8] != "-"
    if column_1 or column_2 or column_3:
        oyun_durumu = False
    if column_1:
        return tablo[0]
    elif column_2:
        return tablo[1]
    elif column_3:
        return tablo[2]

    return


def diagonal_kontrol():
    global oyun_durumu

    diagonal_1 = tablo[0] == tablo[4] == tablo[8] != "-"
    diagonal_2 = tablo[6] == tablo[4] == tablo[2] != "-"
    if diagonal_1 or diagonal_2:
        oyun_durumu = False
    if diagonal_1:
        return tablo[0]
    elif diagonal_2:
        return tablo[1]

    return


def kazanan_var_mi():
    global kazanan

    row_winner = row_kontrol()
    column_winner = column_kontrol()
    diagonal_winner = diagonal_kontrol()
    if row_winner:
        kazanan = row_winner
    elif column_winner:
        kazanan = column_winner
    elif diagonal_winner:
        kazanan = diagonal_winner
    else:
        kazanan = None
    return kazanan


def kitlendi_mi():
    global oyun_durumu
    if "-" not in tablo:
        oyun_durumu = False

    return


def oyun_bitti_mi():
    kazanan_var_mi()
    kitlendi_mi()


def oyuncu_degis():
    global suanki_oyuncu

    if suanki_oyuncu == "X":
        suanki_oyuncu = "O"
    elif suanki_oyuncu == "O":
        suanki_oyuncu = "X"
    return


def oyun_baslat():
    tablo_goster()
    while oyun_durumu:
        oyun_devam(suanki_oyuncu)
        oyun_bitti_mi()
        oyuncu_degis()

    if kazanan == "X" or kazanan == "O":
        print(kazanan + " kazandı.")
    elif kazanan == None:
        print("Düğüm oldu.")


oyun_baslat()
