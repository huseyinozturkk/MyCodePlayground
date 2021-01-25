#! /usr/bin/python3
# sqlite3 veritabanı eklenecek
def get_id_list():
    id_list=[]
    with open("id_data.txt") as file:
        lines=file.readlines()
        for data in lines:
            data=data.replace("\n","").split("-")
            id_list.append(data[0])

    return id_list

def show_id_data(data):
    output="ID:"+data[0]+" Name-Surname:"+data[1]+" "+data[2]
    return output

def get_id(faceID):
    id_data=[]
    with open("id_data.txt") as file:
        lines=file.readlines()
        for data in lines:
            data=data.replace("\n","").split("-")
            id_data.append(data)

    for id in id_data:
        if id[0] == str(faceID):
            return id
