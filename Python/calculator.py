giris="""
(1) toplama
(2) cıkarma
(3) carpma
(4) bolme
(5) karesini hesaplama
(6) karekök hesaplama
"""
print(giris)
while True :
  soru=input("\nyapmak istediginiz islemi seciniz (çıkmak için q) : ")
  if soru =="q":
    print("\nçıkılıyor")
    break
  elif soru == "1":
    print("\n{} işlemini seçtiniz".format("toplama"))
    c1=int(input("\nbirinci sayiyi giriniz : ")) + int(input("\nikinci sayiyi giriniz : "))
    print("\ncevap = ", c1)
  elif soru== "2":
    print("\n{} işlemini seçtiniz".format("cıkarma"))
    c2=int(input("\nbirinci sayiyi giriniz : ")) - int(input("\nikinci sayiyi giriniz : "))
    print("\ncevap = ", c2)
  elif soru== "3":
    print("\n{} işlemini seçtiniz".format("carpma"))
    c3=int(input("\nbirinci sayiyi giriniz : ")) * int(input("\nikinci sayiyi giriniz : "))
    print("\ncevap = ", c3)
  elif soru== "4":
    print("\n{} işlemini seçtiniz".format("bolme"))
    c4=int(input("\nbirinci sayiyi giriniz : ")) / int  (input("\nikinci sayiyi giriniz : "))
    print("\ncevap = ", c4)
  elif soru== "5":
    print("\n{} işlemini seçtiniz".format("karesini hesaplama"))
    c5=int(input("\nsayiyi giriniz : "))**2
    print("\ncevap = ", c5)
  elif soru== "6":
    print("\n{} işlemini seçtiniz".format("karekök hesaplama"))
    c6=int(input("\nsayiyi giriniz : "))**0.5
    print("\ncevap = ", c6)
  else :
    print("\nhatalı seçim yaptınız")
    print("\nAsağidaki seceneklerden birini giriniz", giris)