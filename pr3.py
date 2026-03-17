lst = [] 

lst.append(50) 
lst.append(30) 
lst.append(80) 
print("After insertion:", lst) 


        # Traversal 
print("Traversing list:") 
for item in lst: 
    print(item, end=" ") 

        # Searching 
key = 80
if key in lst: 
    print("\nElement", key, "found") 
else: 
    print("\nElement not found") 
        # Deletion 
lst.remove(30) 
print("After deletion:", lst) 

        # Length 
print("Length of list:", len(lst))