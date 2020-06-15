#include <stdio.h>
int main(void) {
  char name[] = "Harry Potter";
  printf("%c\n", name);     // Output: H

  char *namePtr;
  namePtr = name;
  printf("%c\n", *namePtr);     // Output: H
  printf("%c\n", *(namePtr+1));   // Output: a
  printf("%c\n", *(namePtr+7));   // Output: o
}
