#SORU 1_______________________________________________________
l_r=[]
def flatten(l):
  for j in l:
    if type(j) == list:
      flatten(j)
    else:
      l_r.append(j)
  return l_r

x= [[1,"a",["cat"],2],[[[3]],"dog"],4,5]
print(flatten(x))


#SORU 2_________________________________________________________
def rev(l):
  for j in l:
    if type(j) == list:
      j.reverse()
  l.reverse()
  return l

x=[[1, 2],[3, 4],[5, 6, 7]]
print(rev(x))
