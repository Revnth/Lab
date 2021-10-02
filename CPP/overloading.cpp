#include <iostream>
using namespace std;

class Big
 { int num;
public: void getdata() {
    cout<<"Enter number"<<endl;
    cin>>num;
}
Big operator < (Big ob)
 {
if(ob.num >num)
 return ob;
else
 return *this;
}
void output(){
    cout<<"Greater is "<<num<<endl;
}
 };

 int main(){
     Big A,B,C;
     A.getdata();
     B.getdata();
     C = A<B;
     C.output();
     return 0;
 }
