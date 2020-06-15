n=int(input('enter a number:\n'))
i=2
flag=0
while i<n:
    if (n%i!=0):
        flag=1
        i+=1
if (flag==1):        
    print('it is a prime number')
else:
    print('it is not a prime number')