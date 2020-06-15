print("\n\n\n\t\t\t\tChat Box\n")
while 1:
    print("ENTER YOUR NAME\n")
    n=input()
    print("ENTER YOUR USERNAME\n")
    u=input()
    print("ENTER YOUR MAIL ID\n")
    m=input()
    print("ENTER PASSWORD\n")
    p=input()
    print("CONFIRM PASSWORD\n")
    p1=input()
    if p1==p:
        print("SIGN UP SUCCESSFUL\n")
        s=1
    else:
        print("RECHECK CREDENTIALS AND TRY AGAIN\n")
        s=0
    if s==0:
        continue
    elif s==1:
        print("LOG IN\n")
        print("ENTER USERNAME\n")
        u1=input()
        print("ENTER PASSWORD\n")
        p2=input()
        if p2==p:
            if u1==u:
                print("LOG IN SUCCESSFUL\n")
                break
            else :
                print("LOGIN UNSUCCESSFUL\n")
                continue