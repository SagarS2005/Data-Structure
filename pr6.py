def evaluate_posfix(expression):
    stack=[]
    for char in expression:
        if char.isdigit(): 
            stack.append(int(char));
        else:
            b= stack.pop()
            a=stack.pop()

            if char=="+":
                result=a+b
            elif char=='-':
                result = a-b
            elif char=='*':
                result = a*b
            elif char=='/':
                result = a/b

            stack.append(result)

    return stack.pop()    
    
# expression="23*54*+9-"
expression=input("enter expression : ")
result=evaluate_posfix(expression)
print(f'The result of the postfix expression {expression} is :{result}')
        