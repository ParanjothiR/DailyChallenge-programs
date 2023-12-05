#Your code below
a=input()
l=len(a)
out = ""
f=0
if l%2==0:
    for i in range(0,l,2):
        out+=a[i]+a[i]
        
else:
    for i in range(1,l,2):
        out+=a[i]+a[i]
        f+=1   
if f!=0:
    out+=a[l-1]
print(out,end=" ")
