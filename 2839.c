#include <stdio.h>

int main(){
    int N;
    int x, y;
    
    scanf("%d", &N);
    if(N < 3 || N > 5000)
        return -1;
    
    y = N / 5;
    while(y >= 0){
        x = (N - 5 * y) / 3;
        
        if((N - 5 * y) % 3 == 0){
            printf("%d", x + y);
            return 0;
        }
        else{
            y--;
        }
    }
    printf("-1");
    return 0;
    
}
