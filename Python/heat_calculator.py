print("""
1 - Celcius
2 - Fahrenheit
3 - Kelvin
""")
while True:
  secim1=input("\nGiris yapacacagınız sicaklik degerinin birimini seciniz : ")
  if secim1 in "123":
    break    
  else:
    print("\nHATA!!! Lutfen uygun seceneklerden birini seciniz !!!")
while True:
  try:
    secim2=int(input("\nDonusturmek istediginiz sicaklik degerini giriniz : "))
    if secim2==int(secim2):
      break
  except(ValueError):
    print("\nHATA!!! Lütfen yalnizca sayi giriniz !!!")
  except:
    print("\nBeklenmeyen hata olustu")
while True:
  secim3=input("\nDonusturmek istedginiz sicaklik birimini giriniz : ")
  if secim3 in "123" and secim3!=secim1:
    if secim1=="1" and secim3=="2":
      sonuc1=(secim2*1.8)+32
      print("\nsonuc : " + str(sonuc1))
      break      
    elif secim1=="1" and secim3=="3":
      sonuc2=secim2+273
      print("\nsonuc : " + str(sonuc2))
      break
    elif secim1=="2" and secim3=="1":
      sonuc3=(secim2-32)/1.8
      print("\nsonuc : " + str(sonuc3))
      break
    elif secim1=="2" and secim3=="3":
      sonuc4=((secim2-32)/1.8)+273
      print("\nsonuc : " + str(sonuc4))
      break
    elif secim1=="3" and secim3=="1":
      sonuc5=secim2-273
      print("\nsonuc : " + str(sonuc5))
      break
    elif secim1=="3" and secim3=="2":
      sonuc6=((secim2-273)*1.8)+32
      print("\nsonuc : " + str(sonuc6))
      break       
  elif secim3==secim1:
    print("\nHATA!!! Donusturulmek istenen birim, giris birimiyle ayni olamaz!!!")
  else:
    print("\nHATA!!! Lutfen uygun seceneklerden birini seciniz!!!")
while True:
  son=input("\nCikmak icin 'q' ya basiniz : ")
  if son=="q":
    exit()
  else :
    print("Hatali secim yaptiniz tekrar deneyiniz")
    