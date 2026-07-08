#include <stdio.h>
#include <string.h>

struct Patient
{
    int id;
    char name[30];
    int age;
    char disease[30];
    char doctor[30];
};

struct Patient p[100];
int count = 0;

// Function to Add Patient
void addPatient()
{
    printf("\nEnter Patient ID: ");
    scanf("%d", &p[count].id);

    printf("Enter Patient Name: ");
    scanf("%s", p[count].name);

    printf("Enter Age: ");
    scanf("%d", &p[count].age);

    printf("Enter Disease: ");
    scanf("%s", p[count].disease);

    printf("Enter Doctor Name: ");
    scanf("%s", p[count].doctor);

    count++;

    printf("\nPatient Added Successfully!\n");
}

// Function to Display Patients
void displayPatients()
{
    if(count == 0)
    {
        printf("\nNo Records Found!\n");
        return;
    }

    printf("\n===============================");
    printf("\nHospital Patient Records");
    printf("\n===============================\n");

    for(int i = 0; i < count; i++)
    {
        printf("\nPatient %d\n", i + 1);
        printf("ID       : %d\n", p[i].id);
        printf("Name     : %s\n", p[i].name);
        printf("Age      : %d\n", p[i].age);
        printf("Disease  : %s\n", p[i].disease);
        printf("Doctor   : %s\n", p[i].doctor);
        printf("----------------------------\n");
    }
}

// Search Patient
void searchPatient()
{
    int id, found = 0;

    printf("\nEnter Patient ID to Search: ");
    scanf("%d", &id);

    for(int i = 0; i < count; i++)
    {
        if(id == p[i].id)
        {
            printf("\nPatient Found!\n");
            printf("Name     : %s\n", p[i].name);
            printf("Age      : %d\n", p[i].age);
            printf("Disease  : %s\n", p[i].disease);
            printf("Doctor   : %s\n", p[i].doctor);

            found = 1;
            break;
        }
    }

    if(found == 0)
        printf("\nPatient Not Found!\n");
}

// Delete Patient
void deletePatient()
{
    int id, found = 0;

    printf("\nEnter Patient ID to Delete: ");
    scanf("%d", &id);

    for(int i = 0; i < count; i++)
    {
        if(id == p[i].id)
        {
            for(int j = i; j < count - 1; j++)
            {
                p[j] = p[j + 1];
            }

            count--;
            found = 1;

            printf("\nPatient Record Deleted Successfully!\n");
            break;
        }
    }

    if(found == 0)
        printf("\nPatient Not Found!\n");
}

// Bill Calculation
void bill()
{
    int days;
    float total;

    printf("\nEnter Number of Days Admitted: ");
    scanf("%d", &days);

    total = days * 1500;

    printf("\n========== BILL ==========\n");
    printf("Room Charge per Day : Rs.1500\n");
    printf("Days Admitted       : %d\n", days);
    printf("Total Bill          : Rs.%.2f\n", total);
    printf("==========================\n");
}

int main()
{
    int choice;

    while(1)
    {
        printf("\n==============================");
        printf("\n HOSPITAL MANAGEMENT SYSTEM");
        printf("\n==============================");

        printf("\n1. Add Patient");
        printf("\n2. Display Patients");
        printf("\n3. Search Patient");
        printf("\n4. Delete Patient");
        printf("\n5. Generate Bill");
        printf("\n6. Exit");

        printf("\n\nEnter Choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                addPatient();
                break;

            case 2:
                displayPatients();
                break;

            case 3:
                searchPatient();
                break;

            case 4:
                deletePatient();
                break;

            case 5:
                bill();
                break;

            case 6:
                printf("\nThank You!\n");
                return 0;

            default:
                printf("\nInvalid Choice!\n");
        }
    }

    return 0;
}