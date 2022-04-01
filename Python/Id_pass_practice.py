ID=str(input("kullanıcı adı giriniz : "))
PSS=str(input("sifre giriniz : "))
print("kullanıcı adi ve parola {} karakterden olusuyor".format(len(ID)+len(PSS)))
if len(ID)+len(PSS)<=40:
  print("kullanıcı adi ve sifre uygundur")
else :
  print("kullanıcı adi ve sifre uygun değildir")