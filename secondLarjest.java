//only the function

int print2largest(int arr[], int n) {
    int l = arr[0], sl=-1;
    
    for(int i =1 ; i< n ;i++){
        if(arr[i]>l) {
            sl = l;
            l=arr[i];
        }
        
        if (arr[i]>sl && arr[i]<l) sl = arr[i];
    }
    return sl;
}