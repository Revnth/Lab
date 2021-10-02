/*Write a program using classes which inputs the name of the employee, year of
joining,and position held in the company. The program should find out the years
of experience of each employee and print them as super senior,senior and junior
categories along with their experience.*/

#include <iostream>
using namespace std;

class employee{
char name[30];
int yoj;
int yoe;
char pos[30];
public:
    void getData();
    void putData();
    int check(employee e1,employee e2);
};
void employee::getData(){
    cout << "Enter the name of Employee \n";
    cin >> name;
    cout<< "Year of joining "<<endl;
    cin >> yoj;
    cout<< "Position "<<endl;
    cin >> pos;
    yoe=2020-yoj;

}
int employee::check(employee e1,employee e2){
    int flag;

    if(e1.yoe<e2.yoe){
        flag =1;
    }else
    flag=0;

    return flag;

}
 void employee::putData(){
 cout<<name <<" \t"<<yoe<<" \t"<<endl;
 }

int main(){
    int n,i,j,f;
employee emp[20],temp;
cout<< "Enter the number of Employees" <<endl;
cin>> n;

for(i=0;i<n;i++){
    emp[i].getData();
}

 for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){
                f=temp.check(emp[j],emp[j+1]);
        if(f==1){
                temp=emp[j];
            emp[j]=emp[j+1];
            emp[j+1]=temp;

        }

        }
    }
cout << "name \t" << "yoe \t"<<endl;
for(i=0;i<n;i++){
    emp[i].putData();
}


}




