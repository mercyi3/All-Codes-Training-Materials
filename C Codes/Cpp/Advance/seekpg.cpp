#include<iostream>
#include<fstream>
using namespace std;

void writefile()
{
ofstream fout;
fout.open ("dreamhouse.doc",ios::binary);

const char text1[] = "Hello World";
fout.write(text1, sizeof(text1) - 1); 

fout<<"My Dream House - my rejoicing yard"<< endl;
fout<<"A Secret Chamber"<<endl;
fout.seekp(6,ios::beg);
fout<<"Slides in the Home!"<<endl;
fout.close();
}

void readfile()
{
char ch;

ifstream fin;
fin.open ("dreamhouse.doc",ios::binary);
fin.seekg(0,ios::beg);
while (fin.get(ch))
{
    cout<<ch;
}
fin.close();
}

int main ()
{
    writefile();
    readfile();
}