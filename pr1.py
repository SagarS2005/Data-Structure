arr=[1,2,3,4]


idx=int(input("Enter the index: "))
if idx >=0 and idx<len(arr) :
    value=int(input("Enter  to insert: "))
    arr.insert(idx,value)   
else:
    print("Invalid index")
    exit

print(arr)

idx2=int(input("Enter index to delete element:"))

if idx2 >=0 and idx2 <len(arr):
    removed_value=arr.pop(idx2)
else:
    print("invalid index")
    
print("Deleted Element :",removed_value)

print(arr)