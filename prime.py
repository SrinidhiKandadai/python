a=int(input("enter starting number"))
b=int(input("enter ending number"))
for i in range(a,b+1):
	if(i>1):
		for j in range(2,i):
			if(i%j==0):
				break
		else:
			print(i)
