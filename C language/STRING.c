#include <stdio.h>
int main()
{
    char name[30];
    printf("Enter name: ");
    scanf("%[^\n]s",name);  // read string
    printf("Name: ");
    puts(name);  // display string
    return 0;
}
