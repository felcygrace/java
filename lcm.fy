num1=5
num2=10
if num1>num2{
    num1 = greater
}
else{
    num2= greater
}
while(true){
    if (greater%num1==0 and greater%num2==0){
        lcm=greater
        break
        }
    greater+=1
    print(lcm)
}


