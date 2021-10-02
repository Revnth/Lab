#include <iostream>
#include <string.h>
using namespace std;
int const totalWorkingHours = 160; 
class Employee
{
protected:
    char name[10];
    int empNo;
    float payRate;

public:
    Employee() {}
    void getEmployeetData()
    {
        cout << "Enter the employee details below" << endl;
        cout << "--------------------------------" << endl;
        cout << "Enter the name:" << endl;
        cin >> name;
        cout << "Enter employment no." << endl;
        cin >> empNo;
        cout << "Enter pay rate:" << endl;
        cin >> payRate;
    }
    virtual float pay() = 0;
    void displayEmployeeData()
    {
        cout << "********************" << endl;
        cout << "Name of employee: " << name << endl;
        cout << "Employment No. " << empNo << endl;
        cout << "Pay rate " << payRate << endl;
        cout << "Salary: " << pay() << endl;
        cout << "********************" << endl;
    }
};
class Manager : public Employee
{
private:
    bool isSalaried;
    int workingHours;

public:
    void getManagerData()
    {
        cout << "If salaried hourly enter 0 else 1:" << endl;
        cin >> isSalaried;
        if (!isSalaried)
        {
            cout << "Enter the total working hours:" << endl;
            cin >> workingHours;
        }
    }
    float pay()
    {
        if (isSalaried)
            return payRate * totalWorkingHours;
        else
            return payRate * workingHours;
    }
};
class Supervisor : public Employee
{
private:
    string department;

public:
    void getSupervisorData()
    {
        cout << "\n Department: ";
        cin >> department;
    }
    
    float pay()
    {
        return payRate * totalWorkingHours;
    }
};

int main()
{   Manager M1;
    Supervisor S;
   int choice;
    cout << "\n *****enter details***** ";
    cout << "\n 1. Manager";
    cout << "\n 2. Supervisor";
    cout << "\n Enter your choice(1 or 2): ";
    cin >> choice;
     switch (choice)
      { case 1: 
    
    M1.getEmployeetData();
    M1.getManagerData();
    M1.displayEmployeeData();
     break;
     
     case 2:

    S.getEmployeetData();
    S.getSupervisorData();
    S.displayEmployeeData();
     break;
     default:cout << "\n Oops.....Incorrect Choice!";
        };

    return 0;
}
  
  
       
