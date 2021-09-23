import java.io.*;
import java.util.Stack;
class OurStack
{
 char arr[]=new char[100];
 int top=-1;
 void push(char c)
 {
  arr[++top]=c;
 }
 char pop()
 {
  return arr[top--];
 }
 char peek()
 {
  return arr[top];
 }
 boolean isEmpty()
 {
  return (top==-1)?true:false;
 }
}
public class Convert
{
 public static void main(String s[]) throws IOException
 {
  String exp;
  int ch,z;
  BufferedReader k =new BufferedReader(new InputStreamReader(System.in));
  while(true)
  {
   System.out.println("\nConvert\n1:Infix to Postfix\n2:Infix to Prefix\n3:Prefix to Postfix\n4:Exit\n");
   ch =Integer.parseInt(k.readLine());
   switch(ch)
   {
    case 1:
    System.out.println("\nEnter the infix expression: ");
    exp= k.readLine();
    System.out.println("Postfix expression: "+ toPostfix(exp));
    break;
    case 2:
    System.out.println("\nEnter the infix expression: ");
    exp= k.readLine();
    System.out.println("Prefix expression: "+ toPrefix(exp));
    break;
    case 3:
    System.out.println("\nEnter the prefix expression: ");
    exp= k.readLine();
    System.out.println("Postfix expression: "+ PretoPost(exp));
    break;
    case 4:
    System.exit(0);
    default:
    System.out.println("Invalid\n");
    break;
   }
  } 
 }
 static int priority(char x)
 {
  if(x=='+'||x=='-')
  return 1;
  if(x=='*'||x=='/')
  return 2;
  return 0;
 }
 public static String toPostfix(String exp)
 {
  OurStack st=new OurStack(); 
  char symbol;
  String postfix="";
  for(int i=0;i<exp.length();++i)
  {
   symbol=exp.charAt(i);
   if(Character.isLetter(symbol))
    postfix= postfix+ symbol;
   else if(symbol=='(')
    st.push(symbol);
   else if(symbol==')')
   {
    while(st.peek()!='(')
    {
     postfix= postfix+ st.pop();
    }
    st.pop();
   }
   else
   {
    while(!st.isEmpty() && !(st.peek()=='(') && priority(symbol)<=priority(st.peek()))
    postfix= postfix+ st.pop();
    st.push(symbol);
   }
  }
  while(!st.isEmpty())
  postfix= postfix+ st.pop();
  return postfix;
 }
 public static String reverse(String exp)
 {
  String rev="";
  char[] arrexp= new String(exp).toCharArray();
  for(int i=arrexp.length-1;i>=0;i--)
  {
   if(arrexp[i]=='(')
   arrexp[i]=')';
   else if(arrexp[i]==')')
   arrexp[i]='(';
   rev=rev+arrexp[i];
  }
  return rev;
 }
 public static String toPrefix(String exp)
 {
  System.out.println(reverse(exp));
  return reverse(toPostfix(reverse(exp)));
 }  
 public static String PretoPost(String exp)
 {
  Stack<String> st= new Stack<String>();
  String rev=reverse(exp);
  String symbol,op1,op2;
  String postfix="";
  for(int i=0;i<rev.length();++i)
  {
   symbol=rev.charAt(i)+"";
   if(Character.isLetter(rev.charAt(i)))
   {
    st.push(symbol+"");
   }
   else
   {
     op1=st.pop();
     op2=st.pop();
     String temp=op1+op2+symbol;
     st.push(temp);
    }
  }
  while(!st.isEmpty())
  postfix=postfix+ st.pop();
  return postfix;
 }
}

   
       
   
   
   
   

