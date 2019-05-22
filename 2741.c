#include <stdio.h>

int main(){
    int N;
    scanf("%d", &N);
    if(N <= 0 || N > 100000)
        return -1;
    
    for(int i = 0 ; i < N ; i++)
        printf("%d\n", i + 1);
    return 0;
}
