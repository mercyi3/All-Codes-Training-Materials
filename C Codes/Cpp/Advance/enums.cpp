#include <iostream>  
using namespace std;  
enum week { 
	Monday=1, Tuesday, Wednesday, 
	Thursday, Friday, Saturday, Sunday 
};  
enum fruitshop {
	apple =150,
	orange = 100,
	mango =250
};
int main()  {  
		week day;  
    	day = Friday;  
    	cout << "Day: " << day<<endl;  
		cout<<Sunday-Tuesday<<endl;

		cout<<"Apple 1kg = "<<apple<<endl;
		cout<<"Orange 1kg = "<<orange<<endl;
		cout<<"Mango 1kg = "<<mango<<endl;

		cout<<apple-orange<<endl;
    	return 0;  
}	 
