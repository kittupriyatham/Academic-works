a=int(input('enter 1st number:\n'))
b=int(input('enter 2nd number:\n'))
c=int(input('enter 3rd number:\n'))
if (a>b) and (a>c):
    print(a,'is greatest')
elif (b>a) and (b>c):
    print(b, 'is greatest')
else:
    print(c, 'is greatest')  
    