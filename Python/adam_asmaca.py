"""
CodeHS'de hangman bölümü için yazdığım kod
bug:Bir harf birden fazla defa girilebiliyor ama yanlış sayıyor.
"""
import random

words = ["kelebek","yeşil","doktor","elma","ananas","portakal","mavi","kırmızı","erşan kuneri","bob marley faruk"]  # buradan oyuna kelime ekliyebilirsiniz
secret_word = random.choice(words)


def get_guess():
    while True:
        guess = input("Guess:")
        if len(guess) == len(secret_word):  # Yeni eklendi
            return str(guess)
        elif len(guess) == 1 and guess.islower():
            return str(guess)
        elif len(guess) != 1:
            print("Your guess must have exactly one character!")
        elif not guess.islower():
            print("Your guess must be a lowercase letter!")


dashes = len(secret_word) * "-"
list_dash = list(dashes)
recent_dash = list()


def update_dashes(guesss):
    cnt = 0
    a = 1
    b = 0
    if guesss == secret_word and len(guesss) == len(secret_word):  # Yeni ekleme için düzeltme
        return "Well Done" + guesss
    elif guess != secret_word and len(guesss) == len(secret_word):  # Yeni ekleme için düzeltme
        return "Nice Try" + "\n" + ''.join(list_dash)
    else:
        for i in secret_word:

            if i == guesss:
                a += 1
                list_dash[cnt] = guesss
                b += 3
            else:
                pass
            cnt += 1

        if b % 2 == 0:
            return "That letter is not in the word." + "\n" + ''.join(list_dash)

        if a != 1:
            return "That letter is in the word." + "\n" + ''.join(list_dash)


# Main
guesses_left = 10
print(dashes)
recent = dashes.count("-")
print(guesses_left, "incorrect guesses left.")
while True:
    guess = get_guess()
    print(update_dashes(guess))
    now = update_dashes(guess).count("-")

    if recent == now:
        guesses_left -= 1
    print(guesses_left, "incorrect guesses left")
    recent = update_dashes(guess).count("-")
    if update_dashes(guess).count("-") == 0:
        print("You won.")
        break
    if guesses_left == 0:
        print("Amına kodumun sala")
        break
