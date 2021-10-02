#include <stdio.h>

struct student{
int rollno;
char name[10];
int marks;
int rank;
}s[100];
void main(){
    struct student temp;
    int n,i,j;

    printf("enter the no.of students \n");
    scanf("%d",&n);

    /*Reading students details */

    for(i=0;i<n;i++){
        printf("Enter the Roll.no.of the student\n");
        scanf("%d",&s[i].rollno);
        printf("Enter the name of the student \n");
        scanf("%s",s[i].name);
        printf("Enter the marks.of the student\n");
        scanf("%d",&s[i].marks);
        printf("Enter the Rank of the student\n");
        scanf("%d",&s[i].rank);
    }

    /*Sorting*/

    for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){

            if(s[j].marks<s[j+1].marks){

                temp=s[j];
                s[j]=s[j+1];
                s[j+1]=temp;
            }
        }
    }
/*Printing*/

printf("Roll.no \t Name \t Marks \t Rank \n");
for(i=0;i<n;i++)
printf("%d \t %s \t %d \t %d \n",s[i].rollno,s[i].name,s[i].marks,s[i].rank);

}
