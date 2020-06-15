n=int(input())
lst = []
for i in range(0,n):
    ele=int(input())
    lst.append(ele)
for i in range (0,n-1):
    for j in range(0,n-i-1):
        if lst[j]>lst[j+1]:
            temp=lst[j]
            lst[j]=lst[j+1]
            lst[j+1]=temp
print('\n',lst[n-2])