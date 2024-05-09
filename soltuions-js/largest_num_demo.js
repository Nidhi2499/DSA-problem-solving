arr = [1, 2, 4, 3,5];
lar = arr[0];
for (i=1; i<arr.length ;i++){
    if (arr[i] > lar) lar = arr[i];
}
 console.log('The largest number in array is ', lar);