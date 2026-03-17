arr=[2,3,5,7,8]

value=int(input("Enter value to find : "))
# idx=0
res=False
for i in range (len(arr)):
    if value == arr[i]:
        print("Element at position :",i+1)
        res=True
        break

if (res != True):
    print("element not found")