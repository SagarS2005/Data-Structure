def dequeue(a):
    if len(a) ==0:
        print("queue is empty")
    item=a.pop(0)
    return item

def enqueue(a,item):
    return a.append(item)

a=[1,2,3]
print("previous list",a)
operation=input("Enque or Deque:\n")
if(operation =="Enque"):
    item=int(input("eneter item:"))
    enqueue(a,item);
    print(a)

else:
    dequeue(a)
    print("list  after dequeue",a);


