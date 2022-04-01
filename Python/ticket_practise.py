print("""
Mevcut aktiviteler
(1) Sinema
(2) Tiyatro
""")
soru=input("Gerçekleştirmek istediğiniz aktiviteyi seçiniz :")
sinema=int(15)
tiyatro=int(10)
o_sinema=float(7.5)
o_tiyatro=int(5)
if soru=="1":
  soru2=input("\nogrenci misiniz (e/h) ?")
  if soru2 =="e":
    print("\nOdemeniz gerekn tutar : {} TL".format(o_sinema))
  elif soru2=="h":
    print("\nOdemeniz gerekn tutar : {} TL".format(sinema))
  else:
    print("\nhatali giris yaptiniz")
elif soru=="2":
  soru2=input("\nogrenci misiniz (e/h) ?")
  if soru2 =="e":
    print("\nOdemeniz gerekn tutar : {} TL".format(o_tiyatro))
  elif soru2=="h":
    print("\nOdemeniz gerekn tutar : {} TL".format(sinema))
  else:
    print("\nhatali giris yaptiniz")
else:
  print("\nhatali giris yaptiniz")

