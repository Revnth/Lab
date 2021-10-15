#include <iostream>

using namespace std;

class bank {
  private:
    int ac_no, ac_type, b_amnt, dep, wit;
  char name[20];
  public:
    void getdata();
  void deposit();
  void withdraw();
  void display();

};

void bank::getdata() {
  cout << "\n Enter the Name of account  holder : ";
  cin >> name;
  cout << "\n Enter the Acc.Number :";
  cin >> ac_no;
  cout << " \nEnter the ac_type \n1.current \n2.saving  ";
  cin >> ac_type;
  cout << "\nEnter the Balance amount in the account :";
  cin >> b_amnt;
}

void bank::deposit() {
  cout << "\n Enter the amount of deposit :";
  cin >> dep;
  b_amnt = dep + b_amnt;
}

void bank::withdraw() {
  cout << "\nYour Current Balance is \n" << b_amnt;
  cout << "\nEnter the Amount \n";
  cin >> wit;
  if(b_amnt - wit>=250){
     b_amnt = b_amnt - wit;
  }else
  cout<< "INSUFFICIENT BALANCE \n";

}

void bank::display() {
  cout << "Hi " << name << endl;
  cout << "balance = " << b_amnt << endl;
}

int main() {
  int x=1;
  bank b;
  b.getdata();
  while (x > 0) {
    cout << "Enter \n 1.for Deposit \n 2.for Withdraw \n 0.for exit\n";
    cin >> x;
    switch (x) {
    case 1:
      b.deposit();
      b.display();
      break;
    case 2:
      b.withdraw();
      b.display();
    }
  }

}
